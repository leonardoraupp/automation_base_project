package Automacao.Steps;

import static org.junit.Assert.assertTrue;

import Automacao.Pages.Login.LoginActions;
import Automacao.Pages.Register.RegisterActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {
	
	private LoginActions loginActions = new LoginActions(SetUp.getDriver());
	private RegisterActions registerActions = new RegisterActions(SetUp.getDriver());

	@Given("acesso o sistema com usuario: {string}")
	public void Acesso_Sistema(String user) {
		assertTrue("Sistema não acessado.", loginActions.Login(user));
	}

	@Given("informo o E-mail do usuario: {string}")
	public void Informo_Email_Usuario(String user) {
		assertTrue("E-mail do usuario não informado.", loginActions.SetEmail(user));
	}

	@Given("informo a Senha do usuario")
	public void Informo_Senha_Usuario() {
		assertTrue("Senha do usuario não informado.", loginActions.SetPassword());
	}
	
	@Given("clico no botão Entrar")
	public void Clico_Botao_Entrar() {
		assertTrue("Botão não clicado.", loginActions.ClickOnBtnLogin());
	}

	@Given("verifico usuario logado")
	public void Verifico_Usuario_Logado() {
		assertTrue("Usuario não logado.", loginActions.CheckLogOnUser());
	}
	
	@Then("verifico tela login")
	public void Verifico_Tela_Login() {
		assertTrue("Tela login não verificada.", loginActions.CheckLoginAccessed());
	}
	
	@Then("verifico tela Esqueci minha senha")
	public void Verifico_Tela_Esqueci_Senha() {
		assertTrue("Tela Esqueci minha senha não verificada.", loginActions.CheckForgotPasswordAccessed());
	}
	
	@When("acesso email de redefinição da senha:{string}")
	public void Acesso_Email_Redefinição_Senha(String text) {
		assertTrue("Email de redefinição da senha não acessado.", registerActions.AcessInboxMailCatcherByText(text));
	}

	@When("verifico a mensagem de erro de login inválido: {string}")
	public void Verifico_Messagem_Erro_Login_Invalido(String text) {
		assertTrue("Mensagem de erro não vefificada.", loginActions.CheckInvalidLoginErrorMessage(text));
	}

	@When("verifico a mensagem de erro de login nulo")
	public void Verifico_Messagem_Erro_Login_Nulo() {
		assertTrue("Mensagem de erro não vefificada.", loginActions.CheckNullLoginErrorMessage());
	}

}
