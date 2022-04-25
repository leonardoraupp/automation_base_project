package Automacao.Steps;

import Automacao.Pages.Register.RegisterActions;
import Automacao.Pages.Login.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

import Automacao.Setup.SetUp;

public class RegisterSteps {

    private LoginActions loginActions = new LoginActions(SetUp.getDriver());
    private RegisterActions registerActions = new RegisterActions(SetUp.getDriver());

    @Given("clico no botão criar conta")
    public void Clico_Botao_Criar_Conta() {
        assertTrue("Botão criar conta não clicado.", loginActions.ClickOnBtnRegister());
    }

    @Given("abrir TempEmail")
    public void Abro_TempMail() {
        assertTrue("TempMail não aberto.", registerActions.OpenTempMail());
    }

    @Given("abro o Assine Online")
    public void Abro_Assine_Online() {
        assertTrue("Abro o Assine Online.", registerActions.OpenAssine());
    }

    
    @Given("abro o Mail Catcher")
    public void Abro_Mail_Catcher() {
        assertTrue("Abro o Mail Catcher.", registerActions.OpenMailCatcher());
    }

    @Given("informo o E-mail válido: {string}")
    public void Informo_Email_Valido(String text) {
        assertTrue("Email válido não informado.", registerActions.setValidMail(text));
    }
    @Given("informo o E-mail inválido: {string}")
    public void Informo_Email_Invalido(String text) {
        assertTrue("Email inválido não informado.", registerActions.setInvalidMail(text));
    }

    @Given("acesso o inbox do Mail7: {string}")
    public void Acesso_Inbox_Mail7(String text) {
        assertTrue("Inbox não acessado", registerActions.AcessInboxMail7ByText(text));
    }

    @Given("criar uma conta com o MailCatcher")
    public void Crio_Conta_Com_MailCatcher() {
        assertTrue("Conta não criada", registerActions.CreatACcountMailCatcher());
    }

    @Then("acesso o inbox do Mail Catcher: {string}")
    public void Acesso_Inbox_MailCatcher(String text) {
        assertTrue("Inbox não acessado", registerActions.AcessInboxMailCatcherByText(text));
    }

    @Then("clico no botão do inbox MailCatcher: {string}")
    public void Acesso_Botão_Inbox_MailCatcher(String text) {
        assertTrue("Botão do inbox não acessado", registerActions.ClickOnBtnOnMailCatcherInbox(text));
    }

    @When("informo nome completo: {string}")
    public void Informo_Nome_Completo(String nome) {
        assertTrue("Nome completo não informado.", registerActions.setFullName(nome));
    }

    @When("informo celular: {string}")
    public void Informo_Celular(String celular) {
        assertTrue("Celular não informado.", registerActions.SetAletoryPhoneNumber(celular));
    }

    @When("informo o TempMail")
    public void Informo_Email() {
        assertTrue("Email não informado.", registerActions.setEmail());
    }

    @When("informo segmento: {string}")
    public void Informo_Segmento(String segmento) {
        assertTrue("Segmento não informado.", registerActions.setSegment(segmento));
    }

    @When("informo senha: {string}")
    public void Informo_Senha(String senha) {
        assertTrue("Senha não informada.", registerActions.setPassword(senha));
    }

    @When("clico no botão inbox para validar: {string}")
    public void Clico_Botao_Inbox_Mail7(String text) {
        assertTrue("Botão não clicado.", registerActions.ConfirmReceiptMail7ByText(text));
    }

    @When("aceito os termos")
    public void Aceito_Termos_Uso() {
        assertTrue("Botão não clicado", registerActions.AcceptTerms());
    }

    @When("clico em termos de uso")
    public void Clico_Termos_Uso() {
        assertTrue("Botão não clicado", registerActions.ClickOnTerms());
    }

    @When("clico em políticas de privacidade")
    public void Clico_Politicas_Privacidade() {
        assertTrue("Botão não clicado", registerActions.ClickOnPrivacy());
    }

    @When("clico no link Entrar")
    public void Clico_Entrar() {
        assertTrue("Link entrar não clicado", registerActions.ClickOnEnter());
    }

    @When("valido mensagem de cadastro: {string}")
    public void Valido_Mensagem_Cadastro(String text) {
        assertTrue("Cadastro não efetuado", registerActions.CheckRegister(text));
    }

    @When("clico no botão reenviar confirmação")
    public void Clico_Botao_Reenviar_Email() {
        assertTrue("Email não enviado", registerActions.ResendConfirmationEmail());
    }

    @When("aguardo o carregamento")
    public void Aguardo_Carregamento() {
        assertTrue("Não aguardado", loginActions.WaitLoading());
    }

    @When("informo telefone já cadastrado: {string}")
    public void Informo_Telefone_Cadastrado(String celular) {
        assertTrue("Celular não informado", registerActions.SetPhoneNumberRegistered(celular));
    }

    @When("aguardo a mensagem de cadastro realizado")
    public void Aguardo_Mensagem_Sucesso_Cadastro() {
        assertTrue("Mensagem de sucesso não validada", registerActions.WaitRegisterSuccesMessage());
    }

    @Then("valido email enviado com sucesso")
    public void VerificoEmailReenviado() {
        assertTrue("Email não enviado", registerActions.CheckEmailResend());
    }

    @Then("valido email já cadastrado")
    public void Verifico_Email_Cadastrado() {
        assertTrue("Email não verificado", registerActions.CheckEmailRegistered());
    }

    @Then("valido email inválido")
    public void Verifico_Email_Invalido() {
        assertTrue("Email inválido não verificado", registerActions.CheckInvalidEmail());

    }

    @Then("valido telefone já cadastrado")
    public void Verifico_Telefone_Cadastrado() {
        assertTrue("Email não verifacado", registerActions.CheckPhoneNumberRegistered());

    }

    @Then("valido a mensagem de erro do campo nome nulo")
    public void Valido_Mensagem_Erro_Nome_Nulo() {
        assertTrue("Não validado campo nome", registerActions.CheckInputNameNull());

    }

    @Then("valido a mensagem de erro do campo email nulo")
    public void Valido_Mensagem_Erro_Email_Nulo() {
        assertTrue("Não validado campo email", registerActions.CheckInputEmailNull());

    }

    @Then("valido a mensagem de erro do campo senha nulo")
    public void Valido_Mensagem_Erro_Senha_Nulo() {
        assertTrue("Não validado campo senha", registerActions.CheckErrorNullInputPassword());

    }

    @Then("valido acesso à tela de cadastro")
    public void Valido_Acesso_Tela_Cadastro() {
        assertTrue("Não validado acesso à tela de cadastro", registerActions.CheckAcessRegisterPage());

    }

    @Then("valido conta não criada")
    public void Valido_Conta_Nao_Criada() {
        assertTrue("Não validado conta não criada", registerActions.CheckAccountNotCreated());
    }

    @Then("valido botão Cadastrar desabilitado")
    public void Valido_Botao_Cadastar_Desabilitado() {
        assertTrue("Botão Cadastrar não validado", registerActions.CheckRegisterBtnDisable());
    }

    @Then("valido Termos de Uso aberto")
    public void Valido_Termos_Uso_Aberto() {
        assertTrue("Termos de Uso não aberta", registerActions.CheckTermsAcessed());
    }

    @Then("valido Políticas de privacidade aberta")
    public void Valido_Politica_Privacidade_Aberta() {
        assertTrue("Políticas de privacidade não aberta", registerActions.CheckPrivacyAcessed());
    }

    @Then("valido página Login acessada")
    public void Valido_Pagina_Login_Aberta() {
        assertTrue("Login não aberto", registerActions.CheckLoginAcessed());
    }
    
    @Then("valido acesso ao Dashboard do Assine Online")
    public void Valido_Acesso_Dashboard_AO() {
        assertTrue("Assine Online não acessado", registerActions.CheckAODashboardAcessed());
    }
    

}
