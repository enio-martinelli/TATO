package br.ufscar.dc.compiladores.TATO;

import java.util.HashMap;
import java.util.Map;

public class TATOSemantico extends TATOBaseVisitor<Void> {
    private Escopos escopo;
    private TabelaDeSimbolos tabelaTorneio;

    public TATOSemantico() {
        escopo = new Escopos();
        escopo.criarNovoEscopo();
        tabelaTorneio = escopo.obterEscopoAtual();
    }

    @Override
    public Void visitCorpo(TATOParser.CorpoContext ctx){
        //Validação do nome do torneio
        for(TATOParser.Nome_torneioContext nt : ctx.nome_torneio()){
            TATOSemanticoUtils.verificarTipo(tabelaTorneio, nt);
        }

        //Validação dos nomes das equipes e quantidade de equipes
        for(TATOParser.EquipesContext equipes : ctx.equipes()){
            escopo.criarNovoEscopo();
            TabelaDeSimbolos tabelaEquipes = escopo.obterEscopoAtual();
            TATOSemanticoUtils.verificarTipo(tabelaEquipes, equipes);
            
        }

        //Validação das características do torneio
        for(TATOParser.PropriedadesContext propriedades : ctx.propriedades()){
            TATOSemanticoUtils.verificarCaracteristicas(null, null, propriedades.caract());
            HashMap<String, String> caracteristicas = new HashMap<>();
            caracteristicas = TATOSemanticoUtils.getCaracteristicas();
            /*for (Map.Entry<String, String> entry : caracteristicas.entrySet()) {
                String chave = entry.getKey();
                String valor = entry.getValue();
                System.out.println("Chave: " + chave + ", Valor: " + valor);
            }*/
        }

        return super.visitCorpo(ctx);
    }
    
}
