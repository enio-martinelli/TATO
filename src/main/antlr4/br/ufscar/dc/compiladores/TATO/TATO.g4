grammar TATO; //(TAbelas para TOrneio)

//ANALISADOR LEXICO

//Palavras reservadas
NOME_TORNEIO: 'nome_torneio';
QUANTIDADE_EQUIPES: 'quantidade_equipes';
VANTAGEM: 'vantagem';
CARACTERISTICAS: 'caracteristicas';
REPESCAGEM: 'repescagem';
PONTOS: 'pontos';
SIM: 'sim';
NAO: 'nao';
FIM_TORNEIO: 'fim_torneio';
FIM_ALGORITMO: 'fim_algoritmo';


NMR_EQP: ('0'..'9')+; // Inteiros (utilzado para declarar o número de equipes)

WS: ( ' ' | '\t' | '\r' | '\n') {skip();}; //itens a serem ignorados

CADEIA: '"' (~('\n'))*? '"'; //Strings usandas para declaração dos nomes das equipes e torneios

ERRO_CADEIA: '"' (~('\n'|'"'))*? '\n'; //Cadeias devem começar e terminar com aspas, caso contrário será indicado erro

COMENTARIO:   '{' ~('\n'|'\r')*? '}' {skip();}; //Comentários são ignorados pelo compilador

ERRO_COMENTARIO: '{' ~('\n'|'}')*? '\n'; //Comentários devem começar com '{' e terminar com '}', caso contrário será indicado erro, e não podem possuir quebra de linha

DELIM: ':';

ERRO: .; //tudo que não foi declarado na gramática será considerado erro


//ANALISADOR SINTATICO

programa: corpo FIM_ALGORITMO;

corpo: (nome_torneio equipes propriedades FIM_TORNEIO)+; //o algoritmo pode possuir 1 ou mais corpo

nome_torneio: NOME_TORNEIO ':' CADEIA;

equipes: nmr_equipes (nome_equipes)+; //o algoritmo pode possuir 1 ou mais nome_equipes

nmr_equipes: QUANTIDADE_EQUIPES ':' NMR_EQP;

nome_equipes: CADEIA | equipe_vantagem;
equipe_vantagem: CADEIA ':' VANTAGEM;

propriedades: (CARACTERISTICAS ':' caract)?; //o algoritmo pode possuir 0 ou 1 propriedades

caract: rep |  pts; //nao importa a ordem em que 'repescagem' ou 'pontos' são declarados

rep: REPESCAGEM ':' sn  (pts )?; //repescagem pode ser seguida 0 ou 1 vez por pontos

pts: PONTOS ':' sn  (rep )?; //pontos pode ser seguido 0 ou 1 vez por repescagem

sn: SIM | NAO;