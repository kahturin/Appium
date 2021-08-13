# language: pt

Funcionalidade: Testar opcoes da tela principal do app

  Cenario: Clicar com sucesso no botao de interrogacao

    Dado que estou na tela principal
    Quando clico no botao de interrogacao
    Entao valido a pagina de resultado



  Cenario: Validar Acesso ao menu Ajustes

    Dado que estou na tela principal
    Quando clico no menu ajustes
    Entao valido a pagina de ajustes



  Cenario: Validar Acesso ao menu Historico

    Dado que estou na tela principal
    Quando clico no menu historico
    Entao valido a pagina de historico



  Cenario: Validar Acesso ao menu Resumo

    Dado que estou na tela principal
    Quando clico no menu Resumo
    Entao valido a pagina de Resumo



  Cenario: Primeira iniciacao

    Dado que estou na tela principal
    Quando clico em iniciar teste
    E espero o teste finalizar
    Entao valido se o teste foi concluido



  Cenario: Cancelamento de Teste no APP

    Dado que estou na tela principal
    Quando clico em iniciar teste
    E clico em cancelar teste
    Entao valido se o teste foi cancelado