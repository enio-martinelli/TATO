package br.ufscar.dc.compiladores.TATO;

import java.util.ArrayList;


public class TATOGeradorHTML_Utils {
    
    static ArrayList<String> copia_nomes;
    static ArrayList<String> nome_equipes = new ArrayList<>();
    static int tabelas_grupos; //armazena quantos grupos possui o torneio, caso a caracteristica 'pontos' seja 'sim'
    int nmr_equipes;
    String equipe_vantagem;
    boolean repescagem;
    boolean pontos;
    static int cont_vencedor; //contador para controle do número de 'vencedores'
    static int cont_equipes; //contador para controle do número de equipes ja visitas
    static int cont_jogos; //contador para controle do número de jogos do torneio
    

    public TATOGeradorHTML_Utils(int nmr_equipes, ArrayList<String> nome_equipes, String equipe_vantagem, boolean repescagem, boolean pontos){
        this.nmr_equipes = nmr_equipes;
        TATOGeradorHTML_Utils.nome_equipes = nome_equipes;
        this.repescagem = repescagem;
        this.pontos = pontos;
        this.equipe_vantagem = equipe_vantagem;
        TATOGeradorHTML_Utils.tabelas_grupos = 0;
        TATOGeradorHTML_Utils.copia_nomes = new ArrayList<>(nome_equipes);
        TATOGeradorHTML_Utils.cont_vencedor=1;
        TATOGeradorHTML_Utils.cont_equipes=0;
        TATOGeradorHTML_Utils.cont_jogos=1;
    }

    public TATOGeradorHTML_Utils() {
    }

    //metodo pra setar o idioma do arquivo html
    public static String idioma(String id){
        return "<html lan=\""+id+"\">\n";
    }

    //método para imprimir o <head> do html
    public static String head(){
        String begin = "<head>\n";
        String end = "</head>\n";

        String charset = "  <meta charset=\"UTF-8\">\n";
        String name_content =  "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
        String title = "  <title>Gerador TATO</title>\n";
        String css = "  <link rel=\"stylesheet\" type=\"text/css\" href=\"gerador.css\">\n"; //O css esta em um arquivo a parte, salvo na pasta onde são gerados os arquivos html
        String content = charset + name_content + title + css;

        return begin + content + end;
    }

    //método para divir as equipes em grupos
    //tentar sempre manter o numero minimo de grupos com tamanhos de 4-7 equipes por grupo
    //não é 100% eficiente, mas serve pro propósito do trabalho
    public static String dividir_grupos_recursivo(int nmr_equipes, String parte1, String parte2){
        if(nmr_equipes<8){
            return parte1 + parte2 + gera_tabela(nmr_equipes);
        }else if(nmr_equipes%4 == 0){
            for(int i=0; i<nmr_equipes/4; i++){
                parte1 += gera_tabela(4);
            }
        }else if(nmr_equipes%5 == 0){
            for(int i=0; i<nmr_equipes/5; i++){
                parte1 += gera_tabela(5);
            }
        }else if(nmr_equipes%6 == 0){
            for(int i=0; i<nmr_equipes/6; i++){
                parte1 += gera_tabela(6);
            }
        }else if(nmr_equipes%7 == 0){
            for(int i=0; i<nmr_equipes/7; i++){
                parte1 += gera_tabela(7);
            }
        }else if(nmr_equipes%4 == 1 || nmr_equipes%4 == 3){
            parte1 += dividir_grupos_recursivo(nmr_equipes/2, "", "");
            parte2 += dividir_grupos_recursivo(nmr_equipes/2+1, "", "");
        }else{ // nmr_equipes%4 == 2
            parte1 += dividir_grupos_recursivo(nmr_equipes/2, "", "");
            parte2 += dividir_grupos_recursivo(nmr_equipes/2, "", "");
        }
        return parte1 + parte2;
    }
    

    //método para gerar a tabela do grupo, de acordo com a quantidade de equipes nele
    public static String gera_tabela(int x){
        
        String begin = "        <div class=\"tournament-cell-group\">\n";
        String end = "        </div>\n";
        
        String open_table = "          <table class=\"inner-table\" border=3>\n";
        String close_table= "          </table>\n";
        String open_line_table = "            <tr>\n";
        String close_line_table = "            </tr>\n";

        String lines_table = "";
        lines_table+=open_line_table;
        lines_table+= "              <td class=\"team-name\">GRUPO "+(tabelas_grupos+1)+"</td>\n";
        lines_table+=close_line_table;
        for(int i=1; i<=x; i++){ //pega o inteiro 'x' passado, que é o número de equipes nesse grupo, adiciona uma linha na tabela pra cada equipe
            lines_table+=open_line_table;
            lines_table+= "              <td class=\"team-name\">"+copia_nomes.get(0)+"</td>\n";
            copia_nomes.remove(0); //a equipe que já esta em um grupo é removida da copia da lista de equipes
            lines_table+=close_line_table;
        }
        tabelas_grupos++; //variável que controla quantos grupos já foram formados
       
        return begin + open_table + lines_table + close_table + end;
    }

    //método para impressão do <body> do arquivo html
    public String body_html(){
        String begin = "        <div class=\"tournament-row vertical-divider\">\n";
        String end = "      </div>\n";
        String grid = "	 <div class=\"grid-container\">\n";
        String table = "  <div class=\"tournament-table left central\">\n";
        
        String tabela_pontos = "";
       
        //Gerar grupos que vão dipustar pontos antes do mata-mata
        if(pontos){
            if(!equipe_vantagem.equals("")){ //caso tenha uma equipe declarada com vantagem, ela avança direto pro mata-mata
                copia_nomes.remove(equipe_vantagem);
                nmr_equipes--;
            }
            
            tabela_pontos+= table;
            tabela_pontos+= begin;
            tabela_pontos+= dividir_grupos_recursivo(nmr_equipes,"","");
            tabela_pontos+= end;
            tabela_pontos+= end;
            if(tabelas_grupos==1){ //se for apenas 1 grupo, avançam 4
                nmr_equipes=4;
            }else{
                nmr_equipes = tabelas_grupos*2; //2 equipes por grupo avançam pro mata-mata
            }
            nome_equipes = new ArrayList<>();
            for(int i=1; i<=tabelas_grupos; i++){ //gera os confrontos entre os classificados de cada grupo, sempre o 1º vs 2º do grupo seguinte
                if(i==tabelas_grupos){ //o 1º do último grupo enfrenta o 2º do primeiro grupo
                    if(tabelas_grupos==1){ 
                        nome_equipes.add("1º colocado");
                        nome_equipes.add("4º colocado");
                        nome_equipes.add("2º colocado");
                        nome_equipes.add("3º colocado");
                    }else if(!equipe_vantagem.equals("")){ //se tem equipe com vatagem é colocada direto no mata-mata
                        nome_equipes.add(equipe_vantagem);
                        nome_equipes.add("2º colocado GRUPO 1");
                    }else{
                        nome_equipes.add("1º colocado GRUPO "+i);
                        nome_equipes.add("2º colocado GRUPO 1");
                    }
                }
                nome_equipes.add("1º colocado GRUPO "+i);
                nome_equipes.add("2º colocado GRUPO "+(i+1));
            }
        }

        String clashes = "";
        if(repescagem) clashes+=grid;
        clashes+=table;
        String aux= "";
        int copia_nmr_equipes = nmr_equipes;

        boolean pre_eliminar = false; 
        ArrayList<String> nome_equipes_loser = new ArrayList<>(); //array necessario caso a característica 'repescagem' seja sim

        if(!equipe_vantagem.equals("")){ //dessa vez a equipe é removida da lista, mas o nmr_equipes deve permancer o mesmo
            nome_equipes.remove(equipe_vantagem);
        }
       
        while(!eh_potencia_de_2(copia_nmr_equipes)){ //se o número de equipes não for uma potencia de 2, gera confrontos introdutórios eliminando equipes ate chegar em um número potencia de 2
            
            if(!pre_eliminar){  //garante que o título seja escrito penas uma vez
                aux+= "       <h2><center>Fase Pré-Eliminar</center></h2>\n";
                aux+=begin;
                pre_eliminar = true;
            }
            //adiciona um confronto introdutorio
            aux+= "         <div class=\"tournament-cell\">\n";
            aux+= "             <div class=\"team-name\">JOGO "+(cont_jogos)+"</div>\n";
            aux+= "             <div class=\"team-name\">--------</div>\n";
            aux+= "             <div class=\"team-name\">"+nome_equipes.get(0)+"</div>\n";
            nome_equipes.remove(0);
            aux+= "             <div class=\"team-name\">VS</div>\n";
            aux+= "             <div class=\"team-name\">"+nome_equipes.get(0)+"</div>\n";
            nome_equipes.remove(0);
            nome_equipes.add("Vencedor jogo "+cont_jogos);
            nome_equipes_loser.add("Derrotado jogo "+cont_jogos); //controle para caso de repescagem
            cont_jogos++;
            aux+= "         </div>\n";
            copia_nmr_equipes-=1;
        }
        clashes+=aux;
        if(pre_eliminar) clashes+=end; 
     
        aux="";
       
        clashes+=eliminatorias(begin, end, copia_nmr_equipes,nome_equipes_loser); //número de equipes chegou em uma potencia de 2

        //Final entre chaves superior e inferior no caso de repescagem
        if(repescagem){ 
            clashes+=body_loser_html(nome_equipes_loser);
            clashes+= "  <div class=\"tournament-table footer central\">\n";
            clashes+=begin;
            clashes+= "         <div class=\"tournament-cell winner\">\n";
            clashes+= "             <div class=\"team-name\">Final</div>\n";
            clashes+= "             <div class=\"team-name\">--------</div>\n";
            clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
            cont_vencedor++;
            clashes+= "             <div class=\"team-name\">VS</div>\n";
            clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
            cont_vencedor++;
            clashes+= "         </div>\n";
            clashes+= end;
            cont_jogos++;
        }

        //campeão
        if(!repescagem) clashes+= "  <div class=\"tournament-table footer central\">\n";
        clashes+=begin;
        clashes+= "         <div class=\"tournament-cell winner\">\n";
        clashes+= "             <div class=\"team-name\">CAMEPÃO</div>\n";
        clashes+= "             <div class=\"team-name\">--------</div>\n";
        clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
        cont_vencedor++;
        clashes+= "         </div>\n";
        clashes+= end;

        return tabela_pontos + clashes + end;
    }

    //função auxiliar para verificar se um inteiro é potência de 2
    public static boolean eh_potencia_de_2(int n) {
        //Verificar se o número é maior que 1 e se tem exatamente um bit definido como 1 (toda potencia de 2 tem esse formato em binário)
        return (n > 0) && ((n & (n - 1)) == 0);
    }
    

    //método para organizar torneio com número de equipes sendo uma potência de 2
    //usado como método base para torneios com número de equipes diferente de uma potência de 2, que precisarão de fases introdutórias
    //EX. 
        //em um torneio com 10 equipes, 5 equipes avançam da primeira etapa, porém com 5 equipes não é possível realizar outra etapa de eliminatórias (1x1), fica sobrando uma equipe
    //
    //por isso a necessidade de garantir que o número de equipes seja uma potencia de 2 antes de chamar esse método
    public String eliminatorias(String begin, String end, int copia_nmr_equipes, ArrayList<String> nome_equipes_loser){
        boolean titulo1=false;
        boolean titulo2=false;
        String clashes="";
       
        for(int i=0; i<copia_nmr_equipes/2; i++){
            
            while(!titulo1){
                switch(copia_nmr_equipes){ //adiciona titulo da fase de confrontos
                    case 4:
                        clashes+= "       <h2><center>Semifinal</center></h2>\n";
                        clashes+=begin;
                        break;
                    case 8:
                        clashes+= "         <h2><center>Quartas de Final</center></h2>\n";
                        clashes+=begin;
                        break;
                    case 16:
                        clashes+= "         <h2><center>Oitavas de Final</center></h2>\n";
                        clashes+=begin;
                        break;
                    case 32:
                        clashes+= "         <h2><center>1º rodada de Eliminatórias</center></h2>\n";
                        clashes+=begin;
                        break;
                }
                titulo1=true;
                
            }
            //adiciona confronto 
            clashes+= "         <div class=\"tournament-cell\">\n";
            clashes+= "             <div class=\"team-name\">JOGO "+(cont_jogos)+"</div>\n";
            nome_equipes_loser.add("Derrotado jogo "+cont_jogos);
            cont_jogos++;
            clashes+= "             <div class=\"team-name\">--------</div>\n";
            if(!equipe_vantagem.equals("")){ //equipe com vantagem é adicionada logo no primeiro confronto
                clashes+= "             <div class=\"team-name\">"+equipe_vantagem+"</div>\n";
                equipe_vantagem = "";
            }else{
                clashes+= "             <div class=\"team-name\">"+nome_equipes.get(cont_equipes)+"</div>\n";
                if(nome_equipes.get(cont_equipes).contains("Vencedor jogo")) cont_vencedor++; //casso a equipe venha da fase pré-eliminar, incrementar o contador de 'vencedor jogo x'
                cont_equipes++;
            }
            clashes+= "             <div class=\"team-name\">VS</div>\n";
            clashes+= "             <div class=\"team-name\">"+nome_equipes.get(cont_equipes)+"</div>\n";
            if(nome_equipes.get(cont_equipes).contains("Vencedor jogo")) cont_vencedor++;
            cont_equipes++;
            clashes+= "         </div>\n";
            
        }
        clashes+= end;
        for(int i=copia_nmr_equipes/4; i>0; i/=2){
            for(int j=1; j<=i; j++){
                while(!titulo2){
                    switch(i){
                        case 1:
                            if(repescagem)
                                clashes+= "         <h2><center>Final Superior</center></h2>\n";
                            else
                                clashes+= "         <h2><center>Final</center></h2>\n";
                            clashes+=begin;
                            break;
                        case 2:
                            clashes+= "         <h2><center>Semifinal</center></h2>\n";
                            clashes+=begin;
                            break;
                        case 4:
                            clashes+= "         <h2><center>Quartas de Final</center></h2>\n";
                            clashes+=begin;
                            break;
                        case 8:
                            clashes+= "         <h2><center>Oitavas de Final</center></h2>\n";
                            clashes+=begin;
                            break;
                        case 16:
                            clashes+= "         <h2><center>1º rodada de Eliminatórias</center></h2>\n";
                            clashes+=begin;
                            break;
                    }
                    titulo2=true;
                }
                //adiciona futuros confrontos entre os vencedores de confrontos anteriores
                clashes+= "         <div class=\"tournament-cell winner\">\n";
                clashes+= "             <div class=\"team-name\">JOGO "+cont_jogos+"</div>\n";
                nome_equipes_loser.add("Derrotado jogo "+cont_jogos);
                cont_jogos++;
                clashes+= "             <div class=\"team-name\">--------</div>\n";
                clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
                cont_vencedor++;
                clashes+= "             <div class=\"team-name\">VS</div>\n";
                clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
                cont_vencedor++;
                clashes+= "         </div>\n";
                
            }
            clashes+= end;
            titulo2=false;
        }
       clashes+= end;
        return clashes;
    }


    //método para impressão do corpo da repescagem do torneio, quando há 
    //poucas diferenças com o método anterior para a chave superior do torneio
    public String body_loser_html(ArrayList<String> nome_equipes_loser){
        cont_equipes=0;
        String begin = "      <div class=\"tournament-row vertical-divider\">\n";
        String end = "      </div>\n";
        String grid = "	 <div class=\"grid-container\">\n";
        String table = "  <div class=\"tournament-table right central\">\n"; //mudança na posição dos confrontos na tela (repescagem sempre à direita)
        String clashes = "";
        
        //clashes+=grid;
        clashes+=table;
        String aux= "";
        
        int copia_nmr_equipes = cont_jogos-1; //número de equipes na repescagem é o número de confrontos na chave superior (menos 1 pq o contador sempre termina 'avaçado')

        boolean pre_eliminar = false;
        int cont_fases_inferior=1; //contador que contrala qual a fase da repescagem
        
        while(!eh_potencia_de_2(copia_nmr_equipes)){ 
            
            if(!pre_eliminar){
                aux+= "       <h2><center>"+cont_fases_inferior+"º Fase - Inferior</center></h2>\n";
                aux+=begin;
                pre_eliminar = true;
                cont_fases_inferior++;
            }
            aux+= "         <div class=\"tournament-cell\">\n";
            aux+= "             <div class=\"team-name\">JOGO "+(cont_jogos)+"</div>\n";
            aux+= "             <div class=\"team-name\">--------</div>\n";
            aux+= "             <div class=\"team-name\">"+nome_equipes_loser.get(0)+"</div>\n";
            nome_equipes_loser.remove(0);
            aux+= "             <div class=\"team-name\">VS</div>\n";
            aux+= "             <div class=\"team-name\">"+nome_equipes_loser.get(0)+"</div>\n";
            nome_equipes_loser.remove(0);
            nome_equipes_loser.add("Vencedor jogo "+cont_jogos);
            cont_jogos++;
            aux+= "         </div>\n";
            copia_nmr_equipes-=1;
        }
      
        clashes+=aux;
        clashes+=end;
     
        aux="";
       
        clashes+=eliminatorias_loser(begin, end, copia_nmr_equipes, nome_equipes_loser, cont_fases_inferior);

        return clashes+end;
    }
    
    
    public String eliminatorias_loser(String begin, String end, int copia_nmr_equipes, ArrayList<String> nome_equipes_loser, int cont_fases_inferior){
        boolean titulo1=false;
        boolean titulo2=false;
        String clashes="";
       
        for(int i=0; i<copia_nmr_equipes/2; i++){
            while(!titulo1){
                if(copia_nmr_equipes==2)
                    clashes+= "         <h2><center>Final Inferior</center></h2>\n";
                else
                    clashes+= "         <h2><center>"+cont_fases_inferior+"º Fase - Inferior</center></h2>\n";
                clashes+=begin;
                titulo1=true;
            }
            clashes+= "         <div class=\"tournament-cell\">\n";
            clashes+= "             <div class=\"team-name\">JOGO "+(cont_jogos)+"</div>\n";
            nome_equipes_loser.add("Vencedor jogo "+cont_jogos);
            cont_jogos++;
            clashes+= "             <div class=\"team-name\">--------</div>\n";
            
            clashes+= "             <div class=\"team-name\">"+nome_equipes_loser.get(cont_equipes)+"</div>\n";
            if(nome_equipes_loser.get(cont_equipes).contains("Vencedor jogo")) cont_vencedor++; //casso a equipe venha da fase pré-eliminar, incrementar o contador de 'vencedor jogo x'
            cont_equipes++;
            
            clashes+= "             <div class=\"team-name\">VS</div>\n";
            clashes+= "             <div class=\"team-name\">"+nome_equipes_loser.get(cont_equipes)+"</div>\n";
            if(nome_equipes_loser.get(cont_equipes).contains("Vencedor jogo")) cont_vencedor++;
            cont_equipes++;
            clashes+= "         </div>\n";
           
        }
        clashes+= end;
        
        for(int i=copia_nmr_equipes/4; i>0; i/=2){
            for(int j=1; j<=i; j++){
                while(!titulo2){
                    //System.out.println(i);
                    switch(i){
                        case 1:
                            clashes+= "         <h2><center>Final Inferior</center></h2>\n";
                            clashes+=begin;
                            break;
                        default:
                            clashes+= "         <h2><center>"+cont_fases_inferior+"º Fase - Inferior</center></h2>\n";
                            clashes+=begin;
                            break;
                        
                    }
                    titulo2=true;
                   
                }
                clashes+= "         <div class=\"tournament-cell winner\">\n";
                clashes+= "             <div class=\"team-name\">JOGO "+cont_jogos+"</div>\n";
                nome_equipes_loser.add("Vencedor jogo "+cont_jogos);
                cont_jogos++;
                clashes+= "             <div class=\"team-name\">--------</div>\n";
                clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
                cont_vencedor++;
                clashes+= "             <div class=\"team-name\">VS</div>\n";
                clashes+= "             <div class=\"team-name\">Vencedor jogo "+cont_vencedor+"</div>\n";
                cont_vencedor++;
                clashes+= "         </div>\n";
            }
            clashes+= end;
            titulo2=false;
        }
       
        return clashes;
    }

}
