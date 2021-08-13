#language: pt

Funcionalidade: Testar funcionalidades da pagina de permissoes

  Cenario: Aceitar as permissoes do usuario
    Dado que estou na tela de termos e condicoes
    Quando clico em aceitar os termos
    Entao valido se passei para a tela de permissoes


  Cenario: Acesso a tela de permissoes
    Dado que estou na tela de termos e condicoes
    Quando clico em aceitar os termos
    Entao valido se passei para a tela de permissoes


  Cenario: Aceitar os Termos e Condições do App
    Dado que estou na tela de termos e condicoes
    Quando clico em aceitar os termos
    Entao valido se passei para a tela de permissoes


  Cenario: Clicar sobre o botao fechar na tela de permissoes
    Dado que aceitei os termos e condicoes
    Quando clico em fechar na tela de permissoes
    Entao valido se passei para a tela principal


  Cenario: Iniciar um teste apos fechar a tela de permissoes sem aceitar as permissoes
    Dado que estou na tela de permissoes
    Quando clico em conceder permissoes
    E nego todas as permissoes
    Entao inicio um teste na tela principal