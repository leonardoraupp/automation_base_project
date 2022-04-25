package Automacao.Pages.Envelope;

import static java.nio.file.FileSystems.getDefault;
import java.time.Instant;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Automacao.Setup.Utils;
import org.openqa.selenium.WindowType;
import java.util.ArrayList;

public class EnvelopeActions {
    private static WebDriver driver;
    private static EnvelopeElementsMap envelopeElementsMap;
    private Utils utils;
    private final String PathPdf = getDefault().getPath(System.getProperty("user.dir"), "Documents")
            + getDefault().getSeparator() + "soluti" + getDefault().getSeparator() + "anexo"
            + getDefault().getSeparator() + "file-upload.pdf";
    private final String PathDocx = getDefault().getPath(System.getProperty("user.dir"), "Documents")
            + getDefault().getSeparator() + "soluti" + getDefault().getSeparator() + "anexo"
            + getDefault().getSeparator() + "wordDocx.docx";
    private final String PathDoc = getDefault().getPath(System.getProperty("user.dir"), "Documents")
            + getDefault().getSeparator() + "soluti" + getDefault().getSeparator() + "anexo"
            + getDefault().getSeparator() + "wordDoc.doc";

    private final String EmailUsuarioAuxiliar = "leonardo.rodrigues@soluti.com.br";
    private final String UserName = "Leonardo Raupp Rodrigues";
    private String IdAssinatura;
    public static String ValueMail7;

    public EnvelopeActions(WebDriver _driver) {
        driver = _driver;
        envelopeElementsMap = new EnvelopeElementsMap(_driver);
        utils = new Utils(_driver);
    }

    private void Loading() {
        try {
            if (this.utils.isDisplayed(envelopeElementsMap.LoadingIcon)) {
                this.utils.WaitingForDisappear(By.xpath("//span[@class='icon']"));
            }
        } catch (Exception e) {
            System.out.print("Erro");
        }
    }

    public boolean clickOnButton(String name) {
        try {
            this.utils.isDisplayed(By.xpath(String.format("//button[contains(.,'%s')]", name)));
            this.utils.ScrollToElement(By.xpath(String.format("//button[contains(.,'%s')]", name)));
            this.utils.ClickOnElement(By.xpath(String.format("//button[contains(.,'%s')]", name)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean uploadFile(String type) {
        try {
            switch (type) {
                case "pdf":
                    this.utils.UploadFile(envelopeElementsMap.ButtonFile, PathPdf);
                    this.utils.WaitingForElement(envelopeElementsMap.FilePresent, 20);
                    break;
                case "docx":
                    this.utils.UploadFile(envelopeElementsMap.ButtonFile, PathDocx);
                    this.utils.WaitingForElement(envelopeElementsMap.FilePresent, 20);
                    break;
                case "doc":
                    this.utils.UploadFile(envelopeElementsMap.ButtonFile, PathDoc);
                    this.utils.WaitingForElement(envelopeElementsMap.FilePresent, 20);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickOnMenu(String menu) {
        try {
            switch (menu) {
                case "Iniciar":
                    this.utils.ClickOnElement(envelopeElementsMap.MenuIniciar);
                    this.Loading();
                    break;
                case "Documentos e Pastas":
                    this.utils.ClickOnElement(envelopeElementsMap.MenuFilesAndFolders);
                    this.Loading();
                    break;
                default:
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean DragAndDropElement(String element, String x, String y) {
        try {
            int X_target = Integer.parseInt(x);
            int Y_target = Integer.parseInt(y);
            this.utils.ScrollDown(300);

            this.utils.isDisplayed(envelopeElementsMap.ListSignatures);

            switch (element) {
                case "Assinatura Eletrônica":
                    this.utils.DragAndDrop(envelopeElementsMap.AssinaturaEletronica, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "Assinatura com BirdID":
                    this.utils.DragAndDrop(envelopeElementsMap.AssinaturaBirdID, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "Assinatura Presencial":
                    this.utils.DragAndDrop(envelopeElementsMap.AssinaturaPresencial, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "Nome":
                    this.utils.DragAndDrop(envelopeElementsMap.Nome, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "E-mail":
                    this.utils.DragAndDrop(envelopeElementsMap.Email, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "Texto":
                    this.utils.DragAndDrop(envelopeElementsMap.Texto, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "Data da Assinatura":
                    this.utils.DragAndDrop(envelopeElementsMap.DataAssinatura, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "QR Code":
                    this.utils.DragAndDrop(envelopeElementsMap.QRCode, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                case "QR Code + Download":
                    this.utils.DragAndDrop(envelopeElementsMap.QRCodeAndDownload, envelopeElementsMap.PDF);
                    this.utils.isDisplayed(envelopeElementsMap.ItemDoc);
                    break;
                default:
                    break;
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean LoadingDocument() {
        try {
            this.Loading();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean LoadingSignatureComplete() {
        try {
            this.utils.isDisplayed(envelopeElementsMap.DocProntoParaAssinar);
            this.utils.ClickJS(envelopeElementsMap.BtnAssinar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckIdDoc() {
        try {
            this.Loading();
            this.AtualizaPagina();
            this.getIdDocumento();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void AtualizaPagina() {
        try {
            while (this.utils.isDisplayed(envelopeElementsMap.TitleProcessando)) {
                this.utils.Refresh();

            }
        } catch (Exception e) {
            System.out.print("Erro");

        }
    }

    private boolean getIdDocumento() {
        try {
            this.IdAssinatura = this.utils.GetValue(envelopeElementsMap.GetIdDoc).replaceAll("[^0-9]", "");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean GoToHome() {
        try {
            this.utils.ClickOnElement(envelopeElementsMap.LinkHome);
            this.utils.WaitingForElement(envelopeElementsMap.LinkHome, 5);
            this.Loading();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckSignedDocument(String status) {
        try {
            String xpath = String.format("//span[contains(text(),'%s')]", IdAssinatura);
            this.utils.WaitingForElement(By.xpath(xpath), 4);
            this.utils.isDisplayed(By.xpath(String
                    .format("%s/parent :: node ()/ parent :: node ()/td/span[contains(text(),'%s')]", xpath, status)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean FillTextField(String text) {
        try {
            this.utils.SetValue(envelopeElementsMap.InputText, text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckAlertMessage(String message) {
        try {
            Assert.assertEquals(message, this.utils.GetTextAlert());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetNewUserSignature() {
        try {
            this.utils.SetValue(envelopeElementsMap.InputNomeAssinante, UserName);
            this.utils.SetValue(envelopeElementsMap.InputEmailAssinante, EmailUsuarioAuxiliar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean LogOffUser() {
        try {
            this.utils.ClickOnElement(envelopeElementsMap.ButtonUser);
            this.utils.ClickOnElement(envelopeElementsMap.LinkSair);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SelectOptionDoc(String option) {
        try {
            String xpath = String.format("//span[contains(text(),'%s')]/parent :: node ()/parent :: node ()/td//select",
                    IdAssinatura);
            this.utils.SelectOptions(By.xpath(xpath), option);
            this.utils.SwitchWindow(1);
            this.utils.Sleep(20000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean RejectSignatureDoc() {
        try {
            this.utils.isDisplayed(envelopeElementsMap.DocProntoParaAssinar);
            this.utils.ClickJS(envelopeElementsMap.BtnRejeitar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean InformRejection() {
        try {
            String text = String.format("Teste automatizado. Rejeitando assinatudo do documento com id %s",
                    IdAssinatura);
            this.utils.SetValue(envelopeElementsMap.InputReasonReject, text);
            this.clickOnButton("Enviar");
            this.Loading();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CancelSignature() {
        try {
            this.utils.ClickOnElement(envelopeElementsMap.BtnCancelSignature);
            this.utils.Sleep(500);
            this.clickOnButton("Sim");
            this.Loading();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setDetails(String text) {
        try {
            this.utils.SelectOptions(By.xpath("//select[@class='custom']"), text);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickOnColumn(String text) {
        try {
            this.utils.ClickOnElement(By.xpath(String.format("//div/a[contains(.,'%s')]", text)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickOnIconEdit() {
        try {
            this.utils.ScrollToElement(By.xpath("//i[@class='fas fa-pen']"));
            this.utils.ClickOnElement(envelopeElementsMap.IconEditEmail);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ChangeSubscriberName(String name) {
        try {
            this.utils.SetValue(envelopeElementsMap.InputNameSubscriber, name);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ChangeSubscriberEmail(String mail) {
        try {
            this.utils.SetValue(envelopeElementsMap.InputEmailSubscriber, mail);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckChangeSubscriber() {
        try {
            this.utils.WaitingForElement(envelopeElementsMap.MessageSucessChangeSubscriber, 1000);
            this.utils.isDisplayed(envelopeElementsMap.MessageSucessChangeSubscriber);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean NoOptionChangeSubscriber() {
        try {
            this.utils.isDisplayed(By.xpath("//span[@class='email']"));
            this.utils.isDisplayed(By.xpath("//span[contains(.,'Assinado')]"));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetFullNameSubscriber(String name) {
        try {
            this.utils.SetValue(envelopeElementsMap.InputNameSubscriber, name);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean AcessInboxTempMail() {
        try {
            this.utils.isDisplayed(envelopeElementsMap.InboxTempMail);
            this.utils.ScrollToElement(By.xpath("//li[2]//span[@class='inboxSenderEmail inboxSenderEllipsis']"));
            this.utils.ClickOnElement(envelopeElementsMap.InboxTempMail);
            Thread.sleep(3000);
            // this.utils.isDisplayed(envelopeElementsMap.InboxContent);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CloseAssineOnline() {
        try {
            this.driver.quit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean OpenMail7OtherGuide() {
        try {
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://mail7.io/");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean LeaveTempMail() {

        try {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            driver.switchTo().window(tabs2.get(0));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean LeaveMail7() {

        try {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            driver.switchTo().window(tabs2.get(0));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean LeaveAssineOnline() {

        try {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));
            driver.switchTo().window(tabs2.get(1));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetNameInMail7(String name) {
        try {
            String valueAleatory = GenerateRandomValue() + "";
            name = name + valueAleatory;
            driver.findElement(By.name("username")).sendKeys(name);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public long GenerateRandomValue() {
        long aleatory = Instant.now().toEpochMilli();
        return aleatory;

    }

    public boolean ClickOnButtonGoInbox() {
        try {
            this.utils.ClickOnElement(By.xpath("//input[@type='submit']"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CopyMail7() {
        try {
            Thread.sleep(1000);
            EnvelopeActions.ValueMail7 = this.utils.CopyMail7();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setEmailFromMail7() {
        try {
            this.utils.isDisplayed(envelopeElementsMap.InputEmail);
            this.utils.SetValue(envelopeElementsMap.InputEmail, ValueMail7);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean AcessInboxMessageMail7() {
        try {
            this.utils.isDisplayed(By.xpath("//i[@class='mdi mdi-reload mr-1']"));
            this.utils.ClickOnElement(By.xpath("//i[@class='mdi mdi-reload mr-1']"));
            this.utils.WaitingForElement(By.xpath("//ul[@id='depublicemailinbox']//b[text()=('Convite para contato')]"),
                    1000);
            this.utils.isDisplayed(By.xpath("//ul[@id='depublicemailinbox']//b[text()=('Convite para contato')]"));
            this.utils.ClickOnElement(By.xpath("//ul[@id='depublicemailinbox']//b[text()=('Convite para contato')]"));

            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean ClickToConfirmReceipt() {
        try {
            Thread.sleep(3000);
            this.driver.switchTo().frame(0);

            this.utils.isDisplayed(By.xpath("//p/a[text()='Clique aqui para confirmar o recebimento']"));
            String urlConfirmAccount = driver
                    .findElement(By.xpath("//p/a[text()='Clique aqui para confirmar o recebimento']"))
                    .getAttribute("href");
            driver.get(urlConfirmAccount);
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean WaitDocument() {
        try {
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean ValidatesAccountActivated() {
        try {
            // String ActualMessage =
            // this.driver.findElement(By.xpath("//ngb-alert[@role='alert']")).getAttribute("value");
            // String ExpectedMessage = "Conta ativada com sucesso!";
            // System.out.println(ActualMessage + ExpectedMessage);
            // Assert.assertEquals(ExpectedMessage, ActualMessage);
            this.utils.isDisplayed(By.xpath("//ngb-alert[@role='alert']"));

            return true;

        } catch (Exception e) {
            return false;
        }

    }
}
