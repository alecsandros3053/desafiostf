#language:pt
@stefanini
  Funcionalidade: Login Identity Cadastro Stefanini

  Contexto:

    Dado que esteja na pagina "http://prova.stefanini-jgr.com.br/teste/qa/"

    Cenario: Cadastro com sucesso
      Quando realizo login com dados validos
      Entao a pagina inicial exibe com sucesso