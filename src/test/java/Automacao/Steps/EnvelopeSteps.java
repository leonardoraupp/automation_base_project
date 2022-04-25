package Automacao.Steps;

import static org.junit.Assert.assertTrue;

import Automacao.Pages.Envelope.EnvelopeActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnvelopeSteps {
    private EnvelopeActions envelopeActions = new EnvelopeActions(SetUp.getDriver());

    @Given("anexo um documento para assinar: {string}")
    public void Anexo_Documento_Assinar(String file) {
        assertTrue("Documento não anexado.", envelopeActions.uploadFile(file));
    }

    @Given("clico no menu superior: {string}")
    public void Clico_Menu_Superior(String menu) {
        assertTrue("Menu não selecionado.", envelopeActions.ClickOnMenu(menu));
    }

    @Given("abrir Mail7 em outra guia")
    public void Abrir_Mail7_Outra_Guia() {
        assertTrue("Mail7 não aberto.", envelopeActions.OpenMail7OtherGuide());
    }

    @Given("clico no botão: {string}")
    public void Clico_Botao(String text) {
        assertTrue("Botão não clicado.", envelopeActions.clickOnButton(text));
    }

    @And("arrasto para o documento a opção: {string}, X: {string}, Y: {string}")
    public void Arrasto_Assinatira_Para_Documento(String element, String x, String y) {
        assertTrue("Botão não clicado.", envelopeActions.DragAndDropElement(element, x, y));
    }

    @Given("preencho o campo texto com: {string}")
    public void Preencho_Campo_Texto(String text) {
        assertTrue("Campo texto não preenchido.", envelopeActions.FillTextField(text));
    }

    @Given("valido Alert com a mensagem: {string}")
    public void Valido_Mensagem_Alert(String msg) {
        assertTrue("Campo texto não preenchido.", envelopeActions.CheckAlertMessage(msg));
    }

    @Given("informo um usuario para assinar")
    public void Informo_Usuario_Para_Assinar() {
        assertTrue("Campo texto não preenchido.", envelopeActions.SetNewUserSignature());
    }

    @Given("faço o logoff do perfil")
    public void LogOff_User() {
        assertTrue("Campo texto não preenchido.", envelopeActions.LogOffUser());
    }

    @Given("seleciono no documento, a opção: {string}")
    public void Seleciono_Opcao_Documento(String opcao) {
        assertTrue("Campo texto não preenchido.", envelopeActions.SelectOptionDoc(opcao));
    }

    @And("espero o documento carregar")
    public void Espero_Carregamento_Documento() {
        assertTrue("espera falhou.", envelopeActions.LoadingDocument());
    }

    @And("Assino o Documento")
    public void Assino_Documento() {
        assertTrue("Documento não foi assinado.", envelopeActions.LoadingSignatureComplete());
    }

    @And("vou para a home")
    public void Go_To_Home() {
        assertTrue("Home não foi acessada.", envelopeActions.GoToHome());
    }

    @And("valido documento com o status: {string}")
    public void Arrasto_Assinatira_Para_Documento(String status) {
        assertTrue("documento não foi validado.", envelopeActions.CheckSignedDocument(status));
    }

    @And("verifico o ID do documento")
    public void Verifico_Id_Documento() {
        assertTrue("ID do documento não verificado.", envelopeActions.CheckIdDoc());
    }

    @And("Rejeito o Documento")
    public void Rejeito_Documento() {
        assertTrue("Documento não foi assinado.", envelopeActions.RejectSignatureDoc());
    }

    @And("informo o motico da rejeição")
    public void Informo_Motivo_Rejeicao() {
        assertTrue("Documento não foi assinado.", envelopeActions.InformRejection());
    }

    @And("cancelo a assinatura do documento")
    public void Cancelo_Assinatura() {
        assertTrue("Cancelamento não efetuado.", envelopeActions.CancelSignature());
    }

    @And("seleciono: {string}")
    public void Seleciono_Detalhes(String text) {
        assertTrue("Detalhes não clicado.", envelopeActions.setDetails(text));
    }

    @And("clico na coluna: {string}")
    public void Clico_Coluna(String text) {
        assertTrue("Coluna não clicada.", envelopeActions.ClickOnColumn(text));
    }

    @And("clico no icone editar")
    public void Clico_Editar() {
        assertTrue("Editar nõ clicado.", envelopeActions.ClickOnIconEdit());
    }

    @And("troco para o nome: {string}")
    public void Troco_Nome_Assinatura(String text) {
        assertTrue("Nome não trocado.", envelopeActions.ChangeSubscriberName(text));
    }

    @And("troco para o email: {string}")
    public void Troco_Email_Assinatura(String text) {
        assertTrue("Email não trocado.", envelopeActions.ChangeSubscriberEmail(text));
    }

    @Then("valido destinatário alterado com sucesso")
    public void Valido_Troca_Destinatário() {
        assertTrue("Destinário não trocado.", envelopeActions.CheckChangeSubscriber());
    }

    @Then("valido documento sem opção de alteração")
    public void Valido_Documento_Já_Assinado() {
        assertTrue("Documento não assinado", envelopeActions.NoOptionChangeSubscriber());
    }

    @Then("insiro o nome completo do assinante: {string}")
    public void Insiro_Nome_Completo_Assinante(String nome) {
        assertTrue("Nome completo não inserido", envelopeActions.SetFullNameSubscriber(nome));
    }

    @Then("acesso o inbox TempMail")
    public void Acesso_Inbox_TempMail() {
        assertTrue("Nome completo não inserido", envelopeActions.AcessInboxTempMail());
    }

    @Then("fecho o Assine Online")
    public void Fecho_Assine_Online() {
        assertTrue("Assine Online não fechado.", envelopeActions.CloseAssineOnline());
    }

    @Then("saio do TempMail")
    public void Saio_TempMail() {
        assertTrue("Falha ao sair do TempMail", envelopeActions.LeaveTempMail());
    }

    @Then("saio do site Mail7")
    public void Saio_Mail7() {
        assertTrue("Falha ao sair do site Mail7", envelopeActions.LeaveMail7());
    }

    @Then("saio do Assine Online")
    public void Saio_Assine_Online() {
        assertTrue("Falha ao sair do AssineOnline", envelopeActions.LeaveAssineOnline());
    }

    @Then("informo um nome para um email temporário: {string}")
    public void Informe_Nome_Mail7(String name) {
        assertTrue("Nome não inserido", envelopeActions.SetNameInMail7(name));
    }

    @Then("clico no botão ir para o inbox")
    public void Clico_Botao_Para_Inbox() {
        assertTrue("Botão não clicado", envelopeActions.ClickOnButtonGoInbox());
    }

    @Then("copio o email do Mail7")
    public void Copio_Email_Mail7() {
        assertTrue("Email não copiado", envelopeActions.CopyMail7());
    }

    @Then("valido conta ativada com sucesso")
    public void Valido_Conta_Ativada() {
        assertTrue("Conta não ativada.", envelopeActions.ValidatesAccountActivated());
    }

    @When("informo o email do Mail7")
    public void Informo_Email_Mail() {
        assertTrue("Email não informado.", envelopeActions.setEmailFromMail7());
    }

    @When("clico para confirmar o recebimento")
    public void Confirmo_Recebimento() {
        assertTrue("Não confirmado.", envelopeActions.ClickToConfirmReceipt());
    }

    @When("acesso o inbox do Mail7")
    public void Acesso_Inbox_Mail7() {
        assertTrue("Inbox não acessado.", envelopeActions.AcessInboxMessageMail7());
    }

    @When("aguardo o documento")
    public void Aguardo_Documeto() {
        assertTrue("Não aguardado.", envelopeActions.WaitDocument());
    }    
}
