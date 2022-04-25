package Automacao.Steps;

import Automacao.Pages.Login.LoginActions;
import Automacao.Pages.Register.RegisterActions;
import Automacao.Pages.ForgotPassword.ForgotPasswordActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class ForgotPasswordSteps {
    private LoginActions loginActions = new LoginActions(SetUp.getDriver());
    private RegisterActions registerActions = new RegisterActions(SetUp.getDriver());
    private ForgotPasswordActions forgotPasswordActions = new ForgotPasswordActions(SetUp.getDriver());

    @Given("clico no link: {string}")
    public void Clico_No_Link(String nome) {
        assertTrue("Link não clicado.", loginActions.clickOnLink(nome));
    }

    @Given("criar conta com a ferramenta Mail7")
    public void Criar_Conta_TempMail() {
        assertTrue("Conta não criada.", registerActions.CreatAccountMail7());
    }

    @When("informo email da conta")
    public void Informo_Email_Conta() {
        assertTrue("Email não informado.", loginActions.setEmailRecoverPassword());
    }

    @When("informo o E-mail válido da conta: {string}")
    public void Informo_Email_Valido_Cadastrado(String text) {
        assertTrue("Email não informado.", loginActions.setValidEmailRecoverPassword(text));
    }

    @Then("valido erro ao deixar campo email nulo")
    public void Valido_Mensagem_Erro_Campo_Nulo() {
        assertTrue("Mensagem de erro não validada.", forgotPasswordActions.CheckInputEmailNull());
    }

    @Then("valido erro ao deixar campo email inválido")
    public void Valido_Mensagem_Erro_Campo_Invalido() {
        assertTrue("Mensagem de erro não validada.", forgotPasswordActions.CheckInputEmailNull());
    }

    @Then("valido mensagem de successo ao informar email válido: {string}")
    public void Valido_Mensagem_Sucesso_Email_Valido(String text) {
        assertTrue("Mensagem de sucesso não validada.", forgotPasswordActions.CheckMessageSuccessForgotPassword(text));
    }

    @Then("valido mensagem de successo ao reenviar confirmação: {string}")
    public void Valido_Mensagem_Sucesso_Reenviar_Confirmacao(String text) {
        assertTrue("Mensagem de sucesso não validada.", forgotPasswordActions.CheckMessageSuccessForgotPassword(text));
    }

    @Then("valido campo email vazio na tela de redefinição de senha")
    public void Valido_Campo_Email_Vazio() {
        assertTrue("Campo email não validado", forgotPasswordActions.CheckChangeEmailInput());
    }

    @Then("valido a tela de Redefinição de senha")
    public void Valido_Tela_Redefinição_Senha() {
        assertTrue("Tela redefinição de senha não acessada", forgotPasswordActions.CheckPasswordResetPage());
    }
    @Then("acesso o email criado no Mail7")
    public void Acesso_Email_Criado_Mail7() {
        assertTrue("Inbox não acessado", forgotPasswordActions.AcessCreatedMail7Email());
    }
    
    @Then("valido senha alterada com sucesso")
    public void Valido_Senha_Altereda_Sucesso() {
        assertTrue("Senha alterada não validada.", forgotPasswordActions.CheckSuccessChangePassword());
    }
    @Given("acesso a mensagem de redefinição da senha no inbox do MailCatcher: {string}")
    public void Acesso_Mensagem_Esqueceu_Senha_MailCatcher(String text) {
        assertTrue("Inbox não acessado", forgotPasswordActions.AcessInboxMail7ByText(text));
    }

    @Given("acesso o inboxx do Mail7: {string}")
    public void Acesso_Inbox_Mail7(String text) {
        assertTrue("Inbox não acessado", forgotPasswordActions.AcessInboxMail7ByText(text));
    }
}
