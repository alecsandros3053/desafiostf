#language:pt
@boletaRendaVariavel
Funcionalidade: Boleta Renda Variavel

  Contexto:
    Dado que tenha realizado login de front com dados validos

  Cenario: Boleta Renda Variavel
    Dado que esteja na pagina front renda variavel
    Quando realizo a requisicao de uma boleta de renda variavel com os valores
      | carteira       | Fundo MADA - Teste Nova Futura  |
      | tipo           | Compra                          |
      | ativo          | movi3                           |
      | tipoMercado    | Mercado à vista                 |
      | conta          | 1105 / N/C - N/C - 102-N/C(102) |
      | corretora      | XP INVESTIMENTOS CCTVM S.A.     |
      | txOperacao     | 100                             |
      | quantidade     | 1000                            |
      | tipoLiquidacao | Selic                           |
      | valor          | 1000000                          |
    Entao valido que foi gerada uma boleta de renda variavel