package br.ufscar.dc.compiladores.TATO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TATOGeradorHTML extends TATOBaseVisitor<Void>{
    private Escopos escopo;
    private TabelaDeSimbolos tabelaTorneio;
    StringBuilder saida;
    TATOGeradorHTML_Utils aux= new TATOGeradorHTML_Utils();


    public TATOGeradorHTML() {
        escopo = new Escopos();
        escopo.criarNovoEscopo();
        tabelaTorneio = escopo.obterEscopoAtual();
        saida = new StringBuilder();
    }

    @Override
    public Void visitPrograma(TATOParser.ProgramaContext ctx){
        saida.append("<!DOCTYPE html>\n");
        saida.append(TATOGeradorHTML_Utils.idioma("en"));
        saida.append(TATOGeradorHTML_Utils.head());

        saida.append("<body>\n");
        visitCorpo(ctx.corpo());
        saida.append("</body>\n</html>");

        return null;
    }

    @Override
    public Void visitCorpo(TATOParser.CorpoContext ctx){

        for(TATOParser.Nome_torneioContext nt : ctx.nome_torneio()){
            String torneio = TATOSemanticoUtils.verificarTipo(tabelaTorneio, nt);
            torneio = torneio.replace("\"", ""); //retira as aspas do nome do torneio
            saida.append("  <h1><center>"+torneio+"</center></h1>\n");
            
        }
        ArrayList<String> nome_equipes = new ArrayList<String>();
        int nmr_eqp=0;
        for(TATOParser.EquipesContext equipes : ctx.equipes()){
            escopo.criarNovoEscopo();
            TabelaDeSimbolos tabelaEquipes = escopo.obterEscopoAtual();
            
            nome_equipes=TATOSemanticoUtils.verificarTipo(tabelaEquipes, equipes);
            nmr_eqp = Integer.parseInt(equipes.nmr_equipes().NMR_EQP().getText());
        }

        ArrayList<HashMap<String, String>> caracteristicas = new ArrayList<>();
        for(TATOParser.PropriedadesContext propriedades : ctx.propriedades()){
            TATOSemanticoUtils.verificarCaracteristicas(null, null, propriedades.caract());
            caracteristicas.add(TATOSemanticoUtils.getCaracteristicas()); //recura o valor das caracteristicas do torneio
        }

        //valores default das caracteristicas 
        boolean repescagem = false;
        boolean pontos = false;
        String equipe_vantagem = "";

        //valores declarados no algoritmo
        for(HashMap<String, String> carac : caracteristicas){
            for (Map.Entry<String, String> entry : carac.entrySet()) {
                String chave = entry.getKey();
                String valor = entry.getValue();
                switch(chave){ 
                    case "repescagem":
                        if(valor.equals("sim")) repescagem = true;
                        break;
                    case "pontos":
                        if(valor.equals("sim")) pontos = true;
                        break;
                    case "vantagem":
                        equipe_vantagem = valor;
                        break;
                }
            }
        }
        
        Collections.shuffle(nome_equipes); //mistura a ordem das equipes para que os confrontos sejam 'aleatórios' e não na ordem em que foram declaradas as equipes
        aux= new TATOGeradorHTML_Utils(nmr_eqp, nome_equipes, equipe_vantagem, repescagem, pontos);
        saida.append(aux.body_html()); //imprime o corpo do arquivo html
        saida.append("  </div>\n");
        return super.visitCorpo(ctx);
    }
    
}
