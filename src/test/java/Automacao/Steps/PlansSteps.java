package Automacao.Steps;

import static org.junit.Assert.assertTrue;

import Automacao.Pages.Plans.PlansActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class PlansSteps {
    
	private PlansActions PlansActions = new PlansActions(SetUp.getDriver());

    @Given("acessei o perfil do usuario")
	public void Acesso_Perfil_De_Usuario() {
		assertTrue("Perfil de usuario não foi acessado.", PlansActions.AcessPerfilUser());
	}    
	
    @Given("informo o CPF-CNPJ com: {string}")
	public void Informo_CPF_CNPJ(String numDoc) {
		assertTrue("Documento não informado.", PlansActions.SetCPF(numDoc));
	}
	
	@And("escolho o plano: {string}")
	public void Escolho_Plano(String Plan) {
		assertTrue("Plano não foi selecionado.", PlansActions.SelectPlan(Plan));
	}
    @And("informo o CEP com: {string}")
	public void Informo_CEP(String cep) {
		assertTrue("Documento não informado.", PlansActions.SetCep(cep));
	}
    
    @And("informo o Endereço com: {string}")
	public void Informo_Endereco(String text) {
		assertTrue("Documento não informado.", PlansActions.SetAddress(text));
	}
    
    @And("informo a Cidade com: {string}")
	public void Informo_Cidade(String cidade) {
		assertTrue("Documento não informado.", PlansActions.SetCity(cidade));
	}
    
    @And("informo o Estado com: {string}")
	public void Informo_Estado(String estado) {
		assertTrue("Documento não informado.", PlansActions.SetState(estado));
	}
    
    @And("informo o Pais com: {string}")
	public void Informo_Pais(String pais) {
		assertTrue("Documento não informado.", PlansActions.SetCountry(pais));
	}
    
    @And("informo o Numero do cartão com: {string}")
	public void Informo_Numero_Do_Cartao(String numCard) {
		assertTrue("Documento não informado.", PlansActions.SetNumberCard(numCard));
	}
    
    @And("informo o Mês de vencimento do cartão com: {string}")
	public void Informo_Mes_Vencimento_Cartao(String mesVenc) {
		assertTrue("Documento não informado.", PlansActions.SetMouthCard(mesVenc));
	}
    
    @And("informo o Ano de vencimento do cartão com: {string}")
	public void Informo_Ano_Vencimento_Do_Cartao(String anoVenc) {
		assertTrue("Documento não informado.", PlansActions.SetYearCard(anoVenc));
	}
    
    @And("informo o Nome no cartão com: {string}")
	public void Informo_Nome_Cartao(String nome) {
		assertTrue("Documento não informado.", PlansActions.SetNameCard(nome));
	}
    
    @And("informo o CVV do cartão com: {string}")
	public void Informo_CVV_Cartao(String cvv) {
		assertTrue("Documento não informado.", PlansActions.SetCVV(cvv));
	}

    @Then("confirmo contratação concluida com: {string}")
	public void Valido_Contratacao_Plano(String text) {
		assertTrue("Documento não informado.", PlansActions.ValidatesPlanContract(text));
	}

	@Then("valido mensagem de cancelamento do plano")
	public void Valido_Cancelamento_Plano() {
		assertTrue("Documento não informado.", PlansActions.ValidatesCancelPlan());
	}

	@Then("confirmo o cancelamento")
	public void Confirmo_cancelamento_Plano() {
		assertTrue("Documento não informado.", PlansActions.ConfirmCancelPlan());
	}

	@Then("valido plano contratado")
	public void Valido_Plano_Contratado() {
		assertTrue("Documento não informado.", PlansActions.ValidContractedPlan());
	}

	@Then("valida campo: {string} não preenchido")
	public void Valido_Campo_Nao_Preenchido(String campo) {
		assertTrue("Documento não informado.", PlansActions.ValidFieldNotFilled(campo));
	}
}
