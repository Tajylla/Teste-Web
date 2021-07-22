#language: pt
@Login @End2End
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na tela de login

  @RealizarLogin @SmokeTest
  Esquema do Cenario: Realizar Login com Sucesso
    Quando informar o campo Username como "<usuario>"
    E informar o campo Password como "<senha>"
    E clicar no botao Login
    Entao o sistema devera autorizar o login e exibir os produtos disponiveis
    Exemplos: 
      |usuario|senha|
      |standard_user|secret_sauce|
