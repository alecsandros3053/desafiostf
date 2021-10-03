#language:pt
@settings
Funcionalidade: Settings

  Contexto:
    Dado que tenha realizado login com dados validos

  Cenario: Alteracao Settings
    Dado que esteja na pagina de settings com a empresa "Empresa Teste"
    Quando realizo a alteracao dos dados por
      | blockUsers      | 5  |
      | dontReuse       | 7  |
      | expirePass      | 90 |
      | expireSession   | 90 |
      | expireEvitation | 90 |
      | passMustHave    | 4  |
    Entao dados de settings sao alterados
