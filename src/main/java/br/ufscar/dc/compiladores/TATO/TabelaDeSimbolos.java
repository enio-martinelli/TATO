package br.ufscar.dc.compiladores.TATO;

import java.util.HashMap;

public class TabelaDeSimbolos {
    public enum TipoTATO {
        TORNEIO,
        EQUIPE,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoTATO tipo;
        boolean vantagem; //armazena se um time posui vantagem
        

        private EntradaTabelaDeSimbolos(String nome, TipoTATO tipo) {
            this.nome = nome;
            this.tipo = tipo;
            this.vantagem = false;
        }

        private EntradaTabelaDeSimbolos(String nome, TipoTATO tipo,  boolean vantagem) {
            this.nome = nome;
            this.tipo = tipo;
            if(!this.vantagem) this.vantagem = vantagem;
        }
    }
    
    private final HashMap<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoTATO tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }

    public void adicionar(String nome, TipoTATO tipo,  boolean vantagem){
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, vantagem));
        
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoTATO verificar(String nome) {
        return tabela.get(nome).tipo;
        
    } 

    public boolean getVantagem() {
        boolean vantagem = false; // Inicialize vantagem como false
        
        for (EntradaTabelaDeSimbolos ets : tabela.values()) {
            if (ets.vantagem) {
                vantagem = true;
                break; // Se encontrou vantagem em um, pode retornar true e sair do loop
            }
        }
        
        return vantagem;
    }
    

    
}
    
    
