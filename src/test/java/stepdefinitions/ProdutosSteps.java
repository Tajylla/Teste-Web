package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.ProdutosPage;

public class ProdutosSteps {
	
	@Quando("^que o usuario adicionou produtos$")
	public void que_o_usuario_adicionou_produtos() throws Exception {
		LoginSteps lp = new LoginSteps();
		lp.que_o_usuario_fez_login();
		this.clicar_no_botao_add_primeiro_produto();
		this.clicar_no_botao_add_segundo_produto();
		this.o_sistema_devera_clicar_no_botao_carrinho();
	}

	@Quando("^clicar no botao add primeiro produto$")
	public void clicar_no_botao_add_primeiro_produto() throws Exception {
		ProdutosPage pp = new ProdutosPage(Hooks.getDriver());
		pp.clicarBotaoAdicionarPrimeiroProduto();
		Thread.sleep(1000);
	}
	
	@E("^clicar no botao add segundo produto$")
	public void clicar_no_botao_add_segundo_produto() throws Exception {
		ProdutosPage pp = new ProdutosPage(Hooks.getDriver());
		pp.clicarBotaoAdicionarSegundoProduto();
		Thread.sleep(1000);
	}
	
	@Entao("^o sistema devera clicar no botao carrinho$")
	public void o_sistema_devera_clicar_no_botao_carrinho() throws Exception {
		ProdutosPage pp = new ProdutosPage(Hooks.getDriver());
		pp.clicarBotaoCarrinho();
		Thread.sleep(2000);
	}


}
