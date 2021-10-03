#language:pt
@boletaRendaFixa
Funcionalidade: Boleta Renda Fixa

  Contexto:
    Dado que tenha realizado login de front com dados validos

  Cenario: Boleta renda fixa
    Dado que esteja na pagina front renda fixa
    Quando realizo a requisicao de uma boleta de renda fixa com os valores
      | carteira        | Fundo MADA - Teste Nova Futura |
      | tipo            | Compra                         |
      | titulo          | PETR16                         |
      | contraparte     | XP INVESTIMENTOS CCTVM S.A.    |
      | txOperacao      | 100                            |
      | quantidade      | 1000                           |
      | tipoLiquidacao  | Selic                          |
      | localNegociacao | Brasil                         |
      | valor           | 100000                         |
    Entao valido que foi gerada uma boleta de renda fixa