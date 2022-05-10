# language: pt


  Funcionalidade: Login na plataforma
    Eu como usuário da plataforma SwagLabs
    Quero tentar me logar diferentes usuários existentes ou não
    Para saber se os meus dados na plataforma são protegidos

    Contexto:
      Dado que eu tenha acessado a plataforma

    Cenario: Login com sucesso
      Quando eu preencher os dados de usuário existentes
      E tentar acessar com os dados corretos
      Entao eu devo me logar sem problemas na plataforma

    Cenario: Login sem inserir usuário
      Quando eu preencher somente a senha
      E tentar acessar a plataforma sem inserir um usuário
      Entao eu devo ver uma mensagem de usuário requerido em tela

    Cenario: Login sem inserir senha
      Quando eu preencher o usuário
      E tentar me logar sem digitar a senha
      Entao eu devo ver uma mensagem de senha requerida em tela

    Cenario: Login sem inserir dados
      Quando eu tentar entrar na plataforma sem inserir dados
      Entao eu devo ver uma mensagem de usuário requerido em tela