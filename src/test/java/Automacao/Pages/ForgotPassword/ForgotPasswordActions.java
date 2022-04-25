package Automacao.Pages.ForgotPassword;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automacao.Pages.Envelope.EnvelopeActions;
import Automacao.Setup.Utils;

public class ForgotPasswordActions {

    private static WebDriver driver;
    private static ForgotPasswordElementsMap forgotPasswordElementsMap;
    private Utils utils;

    public ForgotPasswordActions(WebDriver _driver) {
        driver = _driver;
        forgotPasswordElementsMap = new ForgotPasswordElementsMap(_driver);
        utils = new Utils(_driver);

    }

    public boolean CheckInputEmailNull() {
        try {

            this.utils.WaitingForElement(By.xpath("//div[@class='invalid-feedback']"), 10);
            String currentMessageSucces = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
            assertEquals("É necessário inserir um e-mail válido", currentMessageSucces);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckMessageSuccessForgotPassword(String text) {
        try {
            this.utils.isDisplayed(By.xpath("//h3[@class='card-title card-title--gray text-center']"));
            String currentMessageSuccess = driver.findElement(By.xpath("//h3[@class='card-title card-title--gray text-center']")).getText();
            assertEquals(text, currentMessageSuccess);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckChangeEmailInput() {
        try {
            String valueInputEmail = driver.findElement(By.xpath("//input[@id='email']")).getText();
            assertEquals("", valueInputEmail);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckPasswordResetPage() {
        try {
            String currentValueTitle = driver.getTitle();
            assertEquals("Redefinição de Senha - Assine Online", currentValueTitle);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean AcessCreatedMail7Email() {
        String email = EnvelopeActions.ValueMail7;
        try {          
            driver.findElement(By.name("username")).sendKeys(email);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckSuccessChangePassword() {
        try { 
            this.utils.ScrollToElement(By.xpath("//span[text()='Sua senha foi alterada!']"));         
            String currentSuccessMessage = driver.findElement(By.xpath("//span[text()='Sua senha foi alterada!']")).getText();
            
            assertEquals("Sua senha foi alterada!", currentSuccessMessage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean AcessInboxMail7ByText(String text) {
        try {
            // this.utils.WaitingForDisappear(By.xpath("//div[@class='spinner-border text-custom m-2']")); 
            // this.utils.ClickOnElement(By.xpath("//div[@class='input-group emaiid-box']/button"));                          
            // this.utils.WaitingForDisappear(By.xpath("i//[@class='mdi mdi-reload mr-1 mdi-spin']"));
            // this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)), 10);            
            // this.utils.Refresh();

            // this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)), 60);          
            // this.utils.Refresh();
            // this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)), 10);          
            // this.utils.ScrollToElement(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text)));
            // this.utils.ClickOnElement(By.xpath(String.format("//ul[@id='depublicemailinbox']//b[contains(.,'%s')]", text))); 
            
            this.utils.Refresh();            
            this.utils.WaitingForElementToBeClickable(By.xpath(String.format("//td[contains(.,'%s')]", text)), 10);                
            this.utils.ScrollToElement(By.xpath(String.format("//td[contains(.,'%s')]", text)));
            this.utils.ClickOnElement(By.xpath(String.format("//td[contains(.,'%s')]", text))); 
            
            driver.switchTo().frame(0);
            this.utils.WaitingForElementToBeClickable(By.xpath("//p/a[contains(.,'Redefinir senha')]"), 10);
            this.utils.ScrollToElement(By.xpath("//p/a[contains(.,'Redefinir senha')]"));                
            String urlConfirmAccount = driver.findElement(By.xpath("//p/a[contains(.,'Redefinir senha')]")).getAttribute("href");
            driver.get(urlConfirmAccount);

            this.utils.WaitingForDisappear(By.xpath("//title[text()='Carregando...']"));

            
            return true;

        } catch (Exception e) {
            
            return false;
        }

    }


}
