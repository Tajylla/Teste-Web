#language: pt
@Checkout @End2End
Funcionalidade: Checkout

  Contexto: 
    Dado que o usuario adicionou produtos

  @RealizarCheckout @SmokeTest
  Esquema do Cenario: Clicar no botao checkout confirmar e finalizar
  	Quando clicar remover primeiro produto
    Entao clicar no botao checkout
    Entao o sistema devera preencher o nome "<nome>"
    E o sistema devera preencher o sobrenome "<sobrenome>"
    E o sistema devera preencher o cep "<cep>"
    Entao confirmar a compra
    E finalizar
    Entao volta para o inicio
    E abre o menu
    E faz logout
    Exemplos: 
      |nome|sobrenome|cep|
      |Tajylla|Yonara|72000000|
