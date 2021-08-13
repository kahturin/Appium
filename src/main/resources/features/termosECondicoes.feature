# language: pt

Funcionalidade: Testar tela de termos e condicoes

  Cenario: Abrir o Termos e Condições do App
    Dado que inicio o aplicativo
    Quando espero a tela de termos aparecer
    Entao valido se estou na tela correta


  Cenario: Aceitar os Termos e Condições do App
    Dado que estou no final da tela de termos e condicoes
    Quando clico em aceitar os termos
    Entao valido se passei para a proxima tela


  Cenario: Fechar o App sem aceitar os Termos e Condições do App
    Dado que estou no final da tela de termos e condicoes
    Quando valido se ha botao de aceitar termos
    Entao fecho o aplicativo