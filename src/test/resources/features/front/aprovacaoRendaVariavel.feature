#language:pt
@aprovacaoRendaVariavel
Funcionalidade: Aprovacao Renda Variável

  Contexto:
    Dado que tenha realizado login de front com dados validos

  Cenario: Aprovacao renda variavel
    Dado que esteja na pagina aprovacao renda variavel
    Quando realizo a aprovacao de uma boleta com os valores
      | codigo | 23           |
      | tipo   | Compra       |
      | status | Em Aprovação |
    Entao confirmo a aprovacao da boleta