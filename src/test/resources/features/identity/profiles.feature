#language:pt
@profiles
  Funcionalidade: Profiles
    Contexto:
      Dado que tenha realizado login com dados validos
    Cenario: Cadastro profile
      Dado que esteja na pagina de profile
      Quando altero a empresa para "Empresa Teste"
      E cadastro um novo profile com os dados
        |sistema|Identity |
        |profile|teste[data]   |
