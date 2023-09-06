# Construção de Compiladores T6
## Implementação do compilador completo para linguagem TATO, um gerador de tabelas de torneio

## Informações do Aluno
- Nome: Enio Martinelli
- RA: 790891

## Linguagem TATO
É uma linguagem que gera tabelas de torneios em html:

```
{equipes:5 }

nome_torneio: "Copa do Mundo"

quantidade_equipes: 5

"Brasil" 
"Alemanha"
"Italia"
"Belgica"
"EUA"


caracteristicas: 
    repescagem: sim
    pontos: sim

fim_torneio
{pode declarar outro torneio aqui}
fim_algoritmo
```

Como utilizar a linguagem TATO:
1. Sempre comece com o identificador 'nome_torneio:" (não esqueça dos ':') seguido do nome que deseja para seu torneio entre aspas duplas

   . Não é permitido 2 ou mais torneios com mesmo nome

2. Em seguida, use o identificador 'quantidade_equipes:' para indicar quantas equipes farão parte do torneio

   . O mínimo de equipes são 4 e o máximo 32

   . Não são aceitos números reais

3. Após a quantidade de equipes, declare o nome das equipes, um por vez entre aspas duplas

   . Não é permitido 2 ou mais equipes com mesmo nome no torneio, mas é permitido em torneios diferentes

   . Unicamente em torneios com quantidade de equipes ímpar, é possível declarar uma única equipe como tendo vantagem. Faz-se isso colocando ':' apos o nome da equipe (depois das aspas), seguido do identificador 'vantagem'. Isso garante que essa equipe inicie na segunda fase do torneio

   . O número de nomes de equipes deve coincidir com a quantidade de equipes declarada anteriormente, caso contrário o algoritmo não será compilado

4. Depois tem a declaração das caracteristicas. Esta é uma declaração OPCIONAL. Comece com o identificador 'caracteristicas:' seguidos dos atributos 'repescagem:' e 'pontos:', ambos podendo assumir valores 'sim' ou 'nao'. Você pode declarar ambos os atributos, ou apenas 1, caso opte por não declarar nenhum não inclua o identificador 'caracteristicas:'

   .'repescagem:' caso 'sim' irá colocar todos os derrotados do torneio (exceção dos eliminados na fase de grupos) em uma chave inferior que se rencontra com a chave superior em uma grande final, dando as todas as equipes uma segunda chance

   .'pontos:' caso 'sim' irá criar um fase de grupos por pontos. O número de grupos é máximizado, contendo de 4 a 7 equipes. 2 equipes de cada grupo avançam para o mata-mata, ou 4 equipes caso tenha um único grupo.

   . o valor default para ambos os atributos é 'nao' e não é permitido dupla declaração desses

5. O identificador 'fim_torneio' indica o fim do torneio. OPCIONALMENTE você  pode inicar a declaração de outro torneio, seguindo todas as intruções acima

6. Caso não queira mais declarar torneios, o algoritmo encerra com o identificador 'fim_algoritmo'

7. Tudo colocado entre {}, sem quebra de linha, é considerado comentário, não interferindo na compilação


O compilador então irá gerar um arquivo `.html` com a tabela completa completa do torneio, com confrontos aleatórios na primeira fase.

Ainda tem dúvidas? Veja esse vídeo com alguns exemplos: "em breve vídeo"



## Compilação do Projeto
Para compilar o projeto, é necessário ter o Maven instalado. Em seguida, execute o seguinte comando na raiz do projeto:  
```
mvn package
```  
Isso criará um arquivo JAR executável na pasta `target` com as dependências necessárias.


## Execução do Programa
Após a compilação, para executar o programa, utilize o seguinte comando:  
```
java -jar target/TATO-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo_de_entrada.txt] [arquivo_de_saida.txt]
```  

Para testes do gerador de codigo html, coloque o arquivo de saída como `.html`
```
java -jar target/TATO-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo_de_entrada.txt] [arquivo_de_saida.html]
```

Dentro da pasta `teste` você encontrará casos de testes e a saída espera para análises léxicas, sintáticas e semânticas, e para o gerador do código html da tabela

Dentro da pasta `teste\gerador-saida` tem um arquivo `gerador.css`, responsável por estilizar a tabela. Você alterá-lo caso queira para deixar a tabela do seu gosto.








