#language:pt
  @companies
Funcionalidade: Companies

  Contexto:
    Dado que tenha realizado login com dados validos

  Cenario: Cadastro Empresas
    Dado que esteja na pagina companies
    Quando realizo um cadastro de uma nova empresa com os dados
      | name | teste[data]   |
      | type | Internal |
    Entao o cadastro foi realizado
