package Automacao.Pages.Register;

import Automacao.Pages.Envelope.EnvelopeActions;
import Automacao.Pages.Login.LoginActions;
import Automacao.Pages.Login.LoginElementsMap;

import static org.junit.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automacao.Setup.Utils;
import io.netty.util.internal.ThreadLocalRandom;

public class RegisterActions {

    private static WebDriver driver;
    private static RegisterElementsMap registerElementsMap;
    private static LoginElementsMap loginElementsMap;
    private Utils utils;
    public static String ValueEmailTemp;
    private LoginActions loginActions;
    public static EnvelopeActions envelopeActions;

    public RegisterActions(WebDriver _driver) {
        driver = _driver;
        registerElementsMap = new RegisterElementsMap(_driver);
        loginElementsMap = new LoginElementsMap(_driver);
        loginActions = new LoginActions(_driver);
        utils = new Utils(_driver);
        envelopeActions = new EnvelopeActions(_driver);
    }

    public boolean setFullName(String name) {
        try {
            this.utils.isDisplayed(registerElementsMap.InputFullName);
            this.utils.SetValue(registerElementsMap.InputFullName, name);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setPhone(String phone) {
        try {
            this.utils.isDisplayed(registerElementsMap.InputPhone);
            this.utils.SetValue(registerElementsMap.InputPhone, phone);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetAletoryPhoneNumber(String phone) {
        try {
            String phoneNumber = phone + ThreadLocalRandom.current().nextInt(10000000, 99999999);
            this.utils.isDisplayed(registerElementsMap.InputPhone);
            this.utils.SetValue(registerElementsMap.InputPhone, phoneNumber);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setEmail() {
        try {
            this.utils.isDisplayed(registerElementsMap.InputEmail);
            this.utils.SetValue(registerElementsMap.InputEmail, ValueEmailTemp);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setSegment(String segment) {
        try {
            this.utils.SelectOptions(By.xpath("//select[@formcontrolname='segment']"), segment);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setPassword(String password) {
        try {
            this.utils.isDisplayed(registerElementsMap.InputPassword);
            this.utils.SetValue(registerElementsMap.InputPassword, password);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean OpenTempMail() {
        try {
            this.utils.OpenTempMail();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean OpenAssine() {
        try {

            this.utils.OpenAssine();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean OpenMailCatcher() {
        try {
            driver.get("http://testing-mail.assine.online/");
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean setValidMail(String validMail) {
        try {
            this.utils.isDisplayed(registerElementsMap.InputEmail);
            this.utils.SetValue(registerElementsMap.InputEmail, validMail);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setInvalidMail(String invalidMail) {
        try {
            this.utils.isDisplayed(registerElementsMap.InputEmail);
            this.utils.SetValue(registerElementsMap.InputEmail, invalidMail);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CreatAccountMail7() {
        try {
            String fullName = "Leonardo Raupp Rodrigues";
            String phone = "51 9";
            String password = "Testing123";
            String nameMail7 = "leonardoraupp";

            envelopeActions.OpenMail7OtherGuide();
            envelopeActions.SetNameInMail7(nameMail7);
            envelopeActions.ClickOnButtonGoInbox();
            envelopeActions.CopyMail7();
            envelopeActions.LeaveMail7();
            loginActions.ClickOnBtnRegister();
            this.setFullName(fullName);
            envelopeActions.setEmailFromMail7();
            this.SetAletoryPhoneNumber(phone);
            this.setPassword(password);
            this.AcceptTerms();
            envelopeActions.clickOnButton("Cadastrar");
            loginActions.WaitLoading();
            this.WaitRegisterSuccesMessage();
            envelopeActions.LeaveAssineOnline();
            this.AcessInboxMail7ByText("Bem-vindo(a) ao Assine.Online! Confirme seu email");
            this.ConfirmReceiptMail7ByText("Confirmar");
            loginActions.CheckLogOnUser();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CreatACcountMailCatcher() {
        try {
            String fullName = "Leonardo Raupp Rodrigues";
            String phone = "51 9";
            String password = "Testing123";
            String nameMail7 = "leonardoraupp";

            envelopeActions.OpenMail7OtherGuide();
            envelopeActions.SetNameInMail7(nameMail7);
            envelopeActions.ClickOnButtonGoInbox();
            envelopeActions.CopyMail7();
            envelopeActions.LeaveMail7();
            loginActions.ClickOnBtnRegister();
            this.setFullName(fullName);
            envelopeActions.setEmailFromMail7();
            this.SetAletoryPhoneNumber(phone);
            this.setPassword(password);
            this.AcceptTerms();
            envelopeActions.clickOnButton("Cadastrar");
            loginActions.WaitLoading();
            this.WaitRegisterSuccesMessage();
            envelopeActions.LeaveAssineOnline();
            this.OpenMailCatcher();
            this.AcessInboxMailCatcherByText("Bem-vindo(a) ao Assine.Online! Confirme seu email");
            this.ClickOnBtnOnMailCatcherInbox("Confirmar");
            loginActions.WaitLoading();
            loginActions.CheckLogOnUser();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CreatAccountValidMail() {
        try {
            String name = "Leonardo Leonardo";
            String phone = "51997265069";
            String validMail = "leonardoraupprodrigues@hotmail.com";
            String segment = "Tecnologia";
            String password = "Testingcompany123";

            this.loginActions.ClickOnBtnRegister();
            this.setFullName(name);
            this.setPhone(phone);
            this.setValidMail(validMail);
            this.setSegment(segment);
            this.setPassword(password);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean AcessInboxMail7ByText(String text) {
        try {

            this.utils.WaitingForDisappear(By.xpath("//div[@class='spinner-border text-custom m-2']")); 

            this.utils.ClickOnElement(By.xpath("//div[@class='input-group emaiid-box']/button"));                          
            this.utils.WaitingForDisappear(By.xpath("i//[@class='mdi mdi-reload mr-1 mdi-spin']"));
            this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)), 10);            
            this.utils.Refresh();

            this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)), 60);          
            this.utils.ScrollToElement(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)));
            this.utils.ClickOnElement(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)));
            
            return true;
            
        } catch (Exception e) {
            
            return false;
        }
    }

    public boolean AcessInboxMailCatcherByText(String text) {
            try {
                this.utils.Sleep(2000);     
                this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//td[contains(.,'%s')]", text)), 30);                
                this.utils.ScrollToElement(By.xpath(String.format("//td[contains(.,'%s')]", text)));
                this.utils.ClickOnElement(By.xpath(String.format("//td[contains(.,'%s')]", text))); 
                                               
                return true;
                
            } catch (Exception e) {
                
                return false;
            }

    }
    public boolean ClickOnBtnOnMailCatcherInbox(String text) {
        try {   
            driver.switchTo().frame(0);
            this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//p/a[contains(.,'%s')]", text)), 30);   
            this.utils.ScrollToElement(By.xpath(String.format("//p/a[contains(.,'%s')]", text)));             
            String urlConfirmAccount = driver.findElement(By.xpath(String.format("//p/a[contains(.,'%s')]", text))).getAttribute("href");
            driver.get(urlConfirmAccount);
                                           
            return true;
            
        } catch (Exception e) {
            
            return false;
        }

}

    public boolean isElementPresent(By element, int timeout) throws Exception {
        try {
            this.utils.WaitingForElementToBeClickable(element, timeout);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }  

    public boolean ConfirmReceiptMail7ByText(String text) {
        try {
            Thread.sleep(3000);
            driver.switchTo().frame(0);
            this.utils.isDisplayed(By.xpath(String.format("//p/a[contains(.,'%s')]", text)));
            this.utils.ScrollToElement(By.xpath(String.format("//p/a[contains(.,'%s')]", text)));
            
            String urlConfirmAccount = driver.findElement(By.xpath(String.format("//p/a[contains(.,'%s')]", text))).getAttribute("href");
            driver.get(urlConfirmAccount);
            // Thread.sleep(5000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean AcceptTerms() {
        try {
            this.utils.ClickOnElement(registerElementsMap.InputTerms);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickOnTerms() {
        try {
            String url = driver.findElement(By.xpath("//a[@href='/terms']")).getAttribute("href");
            driver.get(url);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickOnPrivacy() {
        try {
            String url = driver.findElement(By.xpath("//a[@href='/privacy']")).getAttribute("href");
            driver.get(url);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickOnEnter() {
        try {
            this.utils.WaitingForElementToBeClickable(By.xpath("//a[@href='/login']"), 30);
            this.utils.ClickOnElement(By.xpath("//a[@href='/login']"));
          
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckTermsAcessed() {
        try {
            String termsTitle = driver.getTitle();
            assertEquals("Termos - Assine Online", termsTitle);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckPrivacyAcessed() {
        try {
            String termsTitle = driver.getTitle();
            assertEquals("Privacidade - Assine Online", termsTitle);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckLoginAcessed() {
        try {
            String loginTitle = driver.getTitle();
            assertEquals("Login - Assine Online", loginTitle);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckRegister(String text) {
        try {
            this.loginActions.WaitLoading();
            this.utils.WaitingForElement(By.xpath(String.format("//h3[contains(.,'%s')]", text)), 5000);
            this.utils.isDisplayed(By.xpath(String.format("//h3[contains(.,'%s')]", text)));

            String currentMessageSucess = this.utils.GetValue(registerElementsMap.RegisterSucessMessage);
            assertEquals(text, currentMessageSucess);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean ResendConfirmationEmail() {
        try {
            this.utils.ClickOnElement(By.xpath("//a[text()='Reenviar confirmação']"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckEmailResend() {
        try {
            System.out.println("Passei por aqui!");
            this.utils.WaitingForElement(registerElementsMap.MessageSucessEmailResend, 60);
            String currentMessageSucces = driver.findElement(By.xpath("//div[@role='alert']")).getText();
            assertEquals("E-mail enviado com sucesso.", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckEmailRegistered() {
        try {
            String currentMessageSucces = driver.findElement(By.xpath("//div[@class='invalid-feedback from-server']"))
                    .getText();
            assertEquals("Este e-mail já está sendo utilizado.", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckInvalidEmail() {
        try {
            String currentMessageInvalid = driver
                    .findElement(By.xpath("//div[@class='form-group'][2]//div[@class='invalid-feedback']")).getText();
            assertEquals("É necessário inserir um e-mail válido", currentMessageInvalid);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetPhoneNumberRegistered(String phone) {
        try {
            this.utils.isDisplayed(registerElementsMap.InputPhone);
            this.utils.SetValue(registerElementsMap.InputPhone, phone);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckPhoneNumberRegistered() {
        try {
            String currentMessageSucces = driver.findElement(By.xpath("//div[@class='invalid-feedback from-server']"))
                    .getText();
            assertEquals("Este telefone já está sendo utilizado.", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckInputNameNull() {
        try {

            this.utils.WaitingForElement(By.xpath("//div[@class='invalid-feedback']"), 5000);
            String currentMessageSucces = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
            assertEquals("É necessário inserir um nome", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckInputEmailNull() {
        try {
            this.utils.WaitingForElement(By.xpath("//div[@class='form-group'][2]//div/div"), 5000);
            String currentMessageSucces = driver.findElement(By.xpath("//div[@class='form-group'][2]//div/div"))
                    .getText();
            assertEquals("É necessário inserir um e-mail válido", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckErrorNullInputPassword() {
        try {
            this.utils.WaitingForElement(By.xpath("//input[@id='password']"), 5000);
            String currentMessageSucces = driver.findElement(By.xpath("//input[@id='password']")).getText();
            assertEquals("", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckAcessRegisterPage() {
        try {
            String currentMessageSucces = driver.getTitle();
            assertEquals("Cadastro - Assine Online", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckAccountNotCreated() {
        try {
            this.CheckAcessRegisterPage();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckRegisterBtnDisable() {
        try {
            String currentMessageSucces = driver.findElement(By.xpath("//button[text()='Cadastrar']")).getAttribute("class");
            assertEquals("mt-2 btn btn-form-submit disabled-style", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean WaitRegisterSuccesMessage() {
        try {
            this.utils.WaitingForDisappear(By.xpath("//title[text()='Carregando...']"));
            this.utils.WaitingForElement(By.xpath("//h3[text()='Cadastro realizado com sucesso!']"), 30);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckAODashboardAcessed() {
        try {
            this.utils.isDisplayed(By.xpath("//img[@class='logo']"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
