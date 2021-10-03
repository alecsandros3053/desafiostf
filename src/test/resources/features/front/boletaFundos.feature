#language:pt
@boletaFundos
Funcionalidade: Boleta Fundos

  Contexto:
    Dado que tenha realizado login de front com dados validos

  Cenario: Boleta fundos
    Dado que esteja na pagina front fundos
    Quando realizo a requisicao de uma boleta de fundos com os valores
      | cliente         | Fundo MADA - Teste Nova Futura |
      | tipo            | Aplicação                      |
      | carteira        | Fundo MADA                     |
      | valor           | 100000                         |
      | tipoLiquidacao  | Selic                          |
    Entao valido que foi gerada uma boleta de fundos