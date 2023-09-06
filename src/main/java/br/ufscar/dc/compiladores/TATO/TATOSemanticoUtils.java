package br.ufscar.dc.compiladores.TATO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.Token;

public class TATOSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>(); //Lista de erros.
    public static HashMap<String, String> caracteristicas = new HashMap<>();
    // Função para adicionar erros semânticos.
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    //Função para recuperar as características do torneio (repescagem e pontos)
    public static HashMap<String, String> getCaracteristicas(){
        return caracteristicas;
    }

    //Verificação semântica do nome do torneio, não pode haver torneios com mesmo nome
    public static String verificarTipo(TabelaDeSimbolos tabela, TATOParser.Nome_torneioContext ctx){
        String torneio = ctx.CADEIA().getText();
    
        if(tabela.existe(torneio)){
            adicionarErroSemantico(ctx.start, "Torneio "+torneio+" já declarado");
            tabela.adicionar(torneio, TabelaDeSimbolos.TipoTATO.INVALIDO);
        }else{
            tabela.adicionar(torneio, TabelaDeSimbolos.TipoTATO.TORNEIO);
        }
        
        return torneio;
        
    }

    //Verificação semântica da quantidade de equipes declaradas
    //--O mínimo de equipes é 4 e o máximo são 32
    //--A quantidade declarada deve coincidir com a quantidade de nomes declarados
    public static ArrayList<String> verificarTipo(TabelaDeSimbolos tabela, TATOParser.EquipesContext ctx){
        int nmr_equipes = Integer.parseInt(ctx.nmr_equipes().NMR_EQP().getText());
        if(nmr_equipes <4){
            adicionarErroSemantico(ctx.nmr_equipes().start, "Quantidade de equipes inválida. Minimo 4 equipes");
        }else if(nmr_equipes>32){
            adicionarErroSemantico(ctx.nmr_equipes().start, "Quantidade de equipes inválida. Maximo 32 equipes");
        }
        int contador = 0;//contator para contralar qual a equipe esta sendo avaliada
        ArrayList<String> nomes = new ArrayList<String>();
        for(TATOParser.Nome_equipesContext nome_equipe : ctx.nome_equipes()){
            if(contador+1 > nmr_equipes){
                contador++;
                adicionarErroSemantico(ctx.stop,"Numero de equipes declaradas ["+contador+"] superior ao valor dado em 'quantidade_equipes' ["+nmr_equipes+"]");
                break;
            }
            nomes.add(TATOSemanticoUtils.verificarTipo(tabela, nome_equipe, nmr_equipes, contador));
            contador++;
        }
        if(contador < nmr_equipes){
            adicionarErroSemantico(ctx.stop,"Numero de equipes declaradas ["+contador+"] inferior ao valor dado em 'quantidade_equipes' ["+nmr_equipes+"]");
        }
        return nomes;
    }

    //Verificação semântica do nomes das equipes, não pode haver mesmo nome dentro do mesmo torneio, mas pode em torneio diferentes
    //Verificação semântica para declaração de time com vantagem apenas com quantidade ímpar de participantes e apenas uma equipe com vantagem por torneio
    public static String verificarTipo(TabelaDeSimbolos tabela, TATOParser.Nome_equipesContext ctx, int nmr_equipes, int contador){
        String equipe="";
      
        if(ctx.equipe_vantagem() != null){
            equipe = ctx.equipe_vantagem().CADEIA().getText();
            if(tabela.existe(equipe)){
                adicionarErroSemantico(ctx.start, "Equipe "+equipe+" já declarada");
                tabela.adicionar(equipe, TabelaDeSimbolos.TipoTATO.INVALIDO, false);
            }else{
                if(nmr_equipes % 2 == 0){
                    adicionarErroSemantico(ctx.start, "Torneio com numero par de equipes nao pode ter equipe declarada com vantagem");
                } if(contador>0 && tabela.getVantagem()){ //só verifica se há dupla declaração de vantagem a partir da segunda equipe
                    adicionarErroSemantico(ctx.start, "Outra equipe ja foi declarada com vantagem anteriormente");
                }else{
                    tabela.adicionar(equipe, TabelaDeSimbolos.TipoTATO.EQUIPE, true);
                    equipe = equipe.replace("\"", ""); //remove aspas no nome da equipe
                    caracteristicas.put("vantagem",equipe);
                }
            }
        }else{
            equipe = ctx.CADEIA().getText();
            if(tabela.existe(equipe)){
                adicionarErroSemantico(ctx.start, "Equipe "+equipe+" já declarada");
                tabela.adicionar(equipe, TabelaDeSimbolos.TipoTATO.INVALIDO, false);
            }else{
                tabela.adicionar(equipe, TabelaDeSimbolos.TipoTATO.EQUIPE, false);
            }
        }
        equipe = equipe.replace("\"", ""); //remove as aspas do nome das equipes
        return equipe;
    }


    //Verificação semântica das características, uma mesma característica não pode ser declarada duas vezes no mesmo torneio, não importa seu valor
    public static void verificarCaracteristicas(String repescagem, String pontos, TATOParser.CaractContext ctx){

        if(ctx != null){
            //if(ctx.dur() != null){
            //    verificarCaracteristicas(duracao, repescagem, pontos, ctx.dur());
            //}else 
            if(ctx.rep() != null){
                verificarCaracteristicas(repescagem, pontos, ctx.rep());
            }else if(ctx.pts() !=null){
                verificarCaracteristicas(repescagem, pontos, ctx.pts());
            }
        }

    }

    /*public static void verificarCaracteristicas(String duracao, String repescagem, String pontos, TATOParser.DurContext ctx){
       
        if(ctx.cml().getText()!=null && duracao!=null){
            adicionarErroSemantico(ctx.start, "Declaracao duplciada de 'duracao' na sessão de caracteristicas");
        }
        duracao = ctx.cml().getText();
        caracteristicas.put("duracao",duracao); //armazena o valor de duracao
        if(ctx.rep() != null){
            verificarCaracteristicas(duracao, repescagem, pontos, ctx.rep());
        }else if(ctx.pts() != null){
            verificarCaracteristicas(duracao, repescagem, pontos, ctx.pts());
        }
    }*/

    public static void verificarCaracteristicas(String repescagem, String pontos, TATOParser.RepContext ctx){
        
        if(ctx.sn().getText() != null && repescagem != null){
            adicionarErroSemantico(ctx.start, "Declaracao duplicada de 'repescagem' na sessão de caracteristicas");
            
        }
        repescagem = ctx.sn().getText();
        caracteristicas.put("repescagem",repescagem); //armazena o valor de repescagem
        //if(ctx.dur() != null){
        //    verificarCaracteristicas(duracao, repescagem, pontos, ctx.dur());
        //}else 
        if(ctx.pts() != null){
            verificarCaracteristicas(repescagem, pontos, ctx.pts());
        }
    }

    public static void verificarCaracteristicas(String repescagem, String pontos, TATOParser.PtsContext ctx){
    
        if(ctx.sn().getText() != null && pontos != null){
            adicionarErroSemantico(ctx.start, "Declaracao duplicada de 'pontos' na sessão de caracteristicas");
        }
        pontos = ctx.sn().getText();
        //System.out.println("pontos -> "+pontos);
        caracteristicas.put("pontos",pontos); //armazena o valor dos pontos
        //if(ctx.dur() != null){
        //    verificarCaracteristicas(duracao, repescagem, pontos, ctx.dur());
        //}else 
        if(ctx.rep() != null){
            verificarCaracteristicas(repescagem, pontos, ctx.rep());
        }
    }
}
