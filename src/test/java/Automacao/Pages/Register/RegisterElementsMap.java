package Automacao.Pages.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterElementsMap {

    public RegisterElementsMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@id='name']")
    public WebElement InputFullName;

    @FindBy(how = How.XPATH, using = "//input[@id='phone_raw']")
    public WebElement InputPhone;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement InputEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    public WebElement InputPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='terms']")
    public WebElement InputTerms;

    
    @FindBy(how = How.XPATH, using = "//h3[contains(.,'Cadastro realizado com sucesso!')]")
    public WebElement RegisterSucessMessage;

    @FindBy(how = How.XPATH, using = "//div[@role='alert']")
    public WebElement MessageSucessEmailResend;


}
