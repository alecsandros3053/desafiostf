#language:pt
@aprovacaoRendaFixa
Funcionalidade: Aprovacao Renda Fixa

  Contexto:
    Dado que tenha realizado login de front com dados validos

  Cenario: Aprovacao renda fixa
    Dado que esteja na pagina aprovacao renda fixa
    Quando realizo a aprovacao de uma boleta com os valores
      | codigo | 28           |
      | tipo   | Compra       |
      | status | Em Aprovação |
    Entao confirmo a aprovacao da boleta