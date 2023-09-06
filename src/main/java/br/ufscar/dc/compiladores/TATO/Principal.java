package br.ufscar.dc.compiladores.TATO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.TATO.TATOParser.ProgramaContext;

public class Principal {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Uso: java br.ufscar.dc.compiladores.la.semantico.App entrada.txt saida.txt");
            System.exit(1);
        }

        Boolean erroLexico = false; //Variável de controle para saber se houve erro léxico

        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            TATOLexer lex = new TATOLexer(cs);

            // Redirecionar a saída para o arquivo de texto
            FileOutputStream fos = new FileOutputStream(args[1]);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String tnome = TATOLexer.VOCABULARY.getDisplayName(t.getType());

                switch(tnome){
                    case "ERRO": //mensagem para erro de simbolos nao identificados
                        System.out.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                        erroLexico = true;
                        break;
                    case "ERRO_CADEIA": //mensagem para cadeia nao fechada
                        System.out.println("Linha "+t.getLine()+": formato inválido para o nome da(o) equipie/torneio");
                        erroLexico = true;
                        break;
                    case "ERRO_COMENTARIO": //mensagem para comentario nao fechado
                        System.out.println("Linha "+t.getLine()+": comentario nao fechado");
                        erroLexico = true;
                        break;
                    default: //nao houve erro, imprimir token
                        //Descomentar a linha abaixo para testar o léxico
                        //System.out.println("<'" + t.getText() + "'," + tnome + ">");
                }

                if(tnome == "ERRO" | tnome == "ERRO_CADEIA" | tnome == "ERRO_COMENTARIO" ){break;}
            }

            //Comentar o bloco if abaixo para testar o léxico
            if (!erroLexico) {
                lex.reset();
                CommonTokenStream tokens = new CommonTokenStream(lex);
                TATOParser parser = new TATOParser(tokens);
        
                parser.removeErrorListeners(); // Remove o ErroListener padrão (default)
                MyCustomErrorListener mcel = new MyCustomErrorListener(fos); 
                parser.addErrorListener(mcel); // Adiciona o ErroListener customizado
        
                parser.programa();
            

            //Análise semântica (comentar para testar outras análises)
            lex.reset();
            tokens = new CommonTokenStream(lex);
            parser = new TATOParser(tokens);

            parser.removeErrorListeners(); 
            
            ProgramaContext arvore = parser.programa();
            TATOSemantico tato = new TATOSemantico();

            tato.visitPrograma(arvore);
            
            if(TATOSemanticoUtils.errosSemanticos.isEmpty()) {
                TATOGeradorHTML ghtml = new TATOGeradorHTML();
                ghtml.visitPrograma(arvore);
                System.out.println(ghtml.saida.toString());
            }
            TATOSemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
        }

            System.out.println("Fim da compilacao"); //Comentar para testar o gerador
            // Fechar o arquivo após concluir a análise semantica
            ps.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        }

    }
    
}
