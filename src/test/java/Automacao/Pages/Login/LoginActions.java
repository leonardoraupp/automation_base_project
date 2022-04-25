package Automacao.Pages.Login;

import static Automacao.Pages.Envelope.EnvelopeActions.ValueMail7;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Automacao.Setup.Utils;

public class LoginActions {

    private static WebDriver driver;
    private static LoginElementsMap loginElementsMap;
    private final String EmailUsuarioPadrao = "leonardo.rodrigues@testingcompany.com.br";
    private final String EmailUsuarioAuxiliar = "leonardo.rodrigues@soluti.com.br";
    private final String Password = "Testing123";
    private final String UserName = "Leonardo Raupp Rodrigues";
    private Utils utils;

    public LoginActions(WebDriver _driver) {
        driver = _driver;
        loginElementsMap = new LoginElementsMap(_driver);
        utils = new Utils(_driver);
    }

    public boolean CheckLoginAccessed() {
        try {
            this.utils.Sleep(1000);
            String currentPageTitle = driver.getTitle();
            assertEquals("Login - Assine Online", currentPageTitle);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean CheckForgotPasswordAccessed() {
        try {
            String currentPageTitle = driver.getTitle();
            assertEquals("Redefinição de Senha - Assine Online", currentPageTitle);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean SetEmail(String user) {
        try {
            switch (user) {
                case "padrao":
                    this.utils.SetValue(loginElementsMap.InputEmail, EmailUsuarioPadrao);
                    break;
                case "auxiliar":
                    this.utils.SetValue(loginElementsMap.InputEmail, EmailUsuarioAuxiliar);
                    break;

                default:
                    break;
            }

            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean SetPassword() {
        try {
            this.utils.SetValue(loginElementsMap.InputPassword, Password);

            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean ClickOnBtnLogin() {
        try {
            this.utils.ClickOnElement(loginElementsMap.BtnLogin);

            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean ClickOnBtnRegister() {
        try {
            this.utils.WaitingForElementToBeClickable(By.xpath("//a[text()='Criar conta']"), 30);
            this.utils.ClickOnElement(loginElementsMap.BtnRegister);

            return true;
        } catch (Exception e) {

            return false;
        }

    }

    public boolean Login(String user) {
        try {

            // this.CheckLoginAccessed();
            this.SetEmail(user);
            this.SetPassword();
            this.ClickOnBtnLogin();
            this.CheckLogOnUser();

            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean CheckLogOnUser() {
        try {
            this.WaitLoading();
            this.utils.isDisplayed(By.xpath(String.format("//span[text()='%s']", UserName)));
            // this.CloseChatWidget();
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean WaitLoading() {
        try {
            if (this.utils.isDisplayed(loginElementsMap.LoadingIcon)) {
                this.utils.WaitingForDisappear(By.xpath("//div[@class='loading-circle']"));
            }

            return true;
        } catch (Exception e) {

            return false;
        }
    }

    private void CloseChatWidget() {
        try {
            if (this.utils.isDisplayed(loginElementsMap.IFrameWidget)) {
                this.utils.SwitchIframe(loginElementsMap.IFrameWidget, loginElementsMap.BtnCloseChatWidget);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // Esqueci senha
    public boolean clickOnLink(String name) {
        try {
            this.utils.ScrollToElement(By.xpath(String.format("//a[contains(.,'%s')]", name)));
            this.utils.ClickOnElement(By.xpath(String.format("//a[contains(.,'%s')]", name)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setEmailRecoverPassword() {
        try {
            this.utils.isDisplayed(loginElementsMap.InputRecoverPassword);
            this.utils.SetValue(loginElementsMap.InputRecoverPassword, ValueMail7);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setValidEmailRecoverPassword(String mailValid) {
        try {
            this.utils.isDisplayed(loginElementsMap.InputRecoverPassword);
            this.utils.SetValue(loginElementsMap.InputRecoverPassword, mailValid);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean WaitSendEmailSuccesMessage() {
        try {
            this.utils.WaitingForDisappear(By.xpath("//title[text()='Carregando...']"));
            this.utils.WaitingForElement(By.xpath("//h3[text()='Enviamos um e-mail para você!']"), 30);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckInvalidLoginErrorMessage(String expectedMessage) {
        try {
            this.utils.ScrollToElement(By.xpath("//span[@class='px-3']"));
            String currentMessageInvalid = driver.findElement(By.xpath("//span[@class='px-3']")).getText();    
            assertEquals(expectedMessage, currentMessageInvalid);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckNullLoginErrorMessage() {
        try {
            String emailExpectedMessage = "Digite seu email";
            String passwordExpectedMessage = "Digite sua senha";

            this.utils.WaitingForElement(By.xpath("//div[@class='invalid-feedback']"), 10);
            String emailCurrentErrorMessage = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();

            this.utils.WaitingForElement(By.xpath("//div[@class='card-body']//div[2]//div[@class='invalid-feedback']"), 10);
            String passwordCurrentErrorMessage = driver.findElement(By.xpath("//div[@class='card-body']//div[2]//div[@class='invalid-feedback']")).getText();

            assertEquals(emailExpectedMessage, emailCurrentErrorMessage);
            assertEquals(passwordExpectedMessage, passwordCurrentErrorMessage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
