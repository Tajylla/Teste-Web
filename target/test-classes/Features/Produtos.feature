#language: pt
@Produtos @End2End
Funcionalidade: AdicionarCarrinho

  Contexto: 
    Dado que o usuario fez login

  @AdicionarCarrinho @SmokeTest
  Esquema do Cenario: Adicionar um produto ao carrinho
    Quando clicar no botao add primeiro produto
    E clicar no botao add segundo produto
    Entao o sistema devera clicar no botao carrinho
    Exemplos: 
      |produto|nome|
      |1|Sauce Labs Backpack|
