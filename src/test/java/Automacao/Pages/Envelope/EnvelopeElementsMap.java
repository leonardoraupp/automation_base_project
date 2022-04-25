package Automacao.Pages.Envelope;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EnvelopeElementsMap {

    public EnvelopeElementsMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//button[text()='Selecionar arquivos']")
    public WebElement ButtonFile;

    @FindBy(how = How.XPATH, using = "//div[@class='loaded-files-list__item']")
    public WebElement FilePresent;

    @FindBy(how = How.XPATH, using = "(//li[@class='nav-item'])[1]")
    public WebElement MenuPainel;

    @FindBy(how = How.XPATH, using = "(//li[@class='nav-item'])[2]")
    public WebElement MenuIniciar;

    @FindBy(how = How.XPATH, using = "(//li[@class='nav-item'])[3]")
    public WebElement MenuFilesAndFolders;

    @FindBy(how = How.XPATH, using = "(//li[@class='nav-item'])[4]")
    public WebElement MenuVerificador;

    @FindBy(how = How.XPATH, using = "//div[@class='tools-block']")
    public WebElement ListSignatures;

    @FindBy(how = How.XPATH, using = "//li[@title='Assinatura eletrônica selada pelo Assine Online']")
    public WebElement AssinaturaEletronica;
    @FindBy(how = How.XPATH, using = "//li[@title='Assinatura digital com certificado BirdID']")
    public WebElement AssinaturaBirdID;
    @FindBy(how = How.XPATH, using = "//li[@title='Assinatura presencial feita pelo aplicativo para Smartphones']")
    public WebElement AssinaturaPresencial;
    @FindBy(how = How.XPATH, using = "//li[@title='Nome do contato']")
    public WebElement Nome;
    @FindBy(how = How.XPATH, using = "//li[@title='E-mail do contato']")
    public WebElement Email;
    @FindBy(how = How.XPATH, using = "//li[@title='Mensagem em texto que o contato possa preencher']")
    public WebElement Texto;
    @FindBy(how = How.XPATH, using = "//li[@title='Data em que o documento foi assinado']")
    public WebElement DataAssinatura;
    @FindBy(how = How.XPATH, using = "//li[@title='QR Code de validação de integridade do documento']")
    public WebElement QRCode;
    @FindBy(how = How.XPATH, using = "c//li[@title='QR Code de validação de integridade do documento que permite fazer o download no formato digital']")
    public WebElement QRCodeAndDownload;

    @FindBy(how = How.XPATH, using = "//div[@class='item-draggable-handle cdk-drag-handle']")
    public WebElement ItemDoc;

    @FindBy(how = How.ID, using = "page1")
    public WebElement PDF;

    @FindBy(how = How.XPATH, using = "//span[@class='icon']")
    public WebElement LoadingIcon;

    @FindBy(how = How.XPATH, using = "//p[text()='Baixando dados do documento...']")
    public WebElement LoadingDatasDoc;

    @FindBy(how = How.XPATH, using = "//p[text()='Verificando perfis de assinatura...']")
    public WebElement LoadingVerifySignature;

    @FindBy(how = How.XPATH, using = "//p[text()='Processando assinatura...']")
    public WebElement loadingProcessSignature;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Assinar')]")
    public WebElement BtnAssinar;
    @FindBy(how = How.XPATH, using = "//button[contains(.,'Rejeitar')]")
    public WebElement BtnRejeitar;

    @FindBy(how = How.XPATH, using = "//div[@class='document-tools current-signed']")
    public WebElement DocProntoParaAssinar;

    @FindBy(how = How.XPATH, using = "//h2[text()]")
    public WebElement GetIdDoc;

    @FindBy(how = How.XPATH, using = "//h2[text()='Assinatura enviada com sucesso.']")
    public WebElement TitleProcessando;

    @FindBy(how = How.XPATH, using = "//a[text()='Assine Online']")
    public WebElement LinkHome;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Digite aqui']")
    public WebElement InputText;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Nome completo do assinante']")
    public WebElement InputNomeAssinante;

    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    public WebElement InputEmailAssinante;

    @FindBy(how = How.ID, using = "avatarMenuDropdown")
    public WebElement ButtonUser;

    @FindBy(how = How.XPATH, using = "//header//span[text()='Sair']")
    public WebElement LinkSair;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Por favor, descreva aqui o motivo da sua rejeição...']")
    public WebElement InputReasonReject;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-danger']")
    public WebElement BtnCancelSignature;

    // Edit Signature
    @FindBy(how = How.XPATH, using = "//i[@class='fas fa-pen']")
    public WebElement IconEditEmail;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='name']")
    public WebElement InputNameSubscriber;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']")
    public WebElement InputEmailSubscriber;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']")
    public WebElement BtnChangeSubscriber;

    @FindBy(how = How.XPATH, using = "//div[@class='message']/p")
    public WebElement MessageSucessChangeSubscriber;

    //TempMail
    @FindBy(how = How.XPATH, using = "//li[2]//span[@class='inboxSenderEmail inboxSenderEllipsis']")
    public WebElement InboxTempMail;

    @FindBy(how = How.XPATH, using = "//div[@class='inbox-data-content-intro']//p")
    public WebElement InboxContent;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement InputEmail;


}
