package Automacao.Pages.ForgotPassword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordElementsMap {

    public ForgotPasswordElementsMap(WebDriver _driver) {
    }
    
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement InputEmail;
    
}
