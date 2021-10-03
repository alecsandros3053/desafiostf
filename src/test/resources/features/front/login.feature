#language:pt
  @loginFront
  Funcionalidade: Login Front
    Contexto:
      Dado que esteja na pagina front "https://qa-hm.britech.com.br/BLOTTER_FRONT"

    Cenario: Login realizado
      Quando realizo login de front com dados validos
      Entao a pagina inicial de front exibe com sucesso