#language:pt
  @users
Funcionalidade: Users

  Contexto:
    Dado que tenha realizado login com dados validos

  Cenario: cadastro usuario
    Dado que esteja na pagina de usuarios com a empresa "Empresa Teste"
    Quando realizo um cadastro de uma novo usuario com os dados
      | name    | teste[data]         |
      | email   | teste[data]@teste.com.br |
      | profile | teste               |
    Entao usuario cadastrado com sucesso
