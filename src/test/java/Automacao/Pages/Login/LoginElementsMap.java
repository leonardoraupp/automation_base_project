package Automacao.Pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginElementsMap {

    public LoginElementsMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement InputEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    public WebElement InputPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement BtnLogin;

    @FindBy(how = How.XPATH, using = "//p[@text='Carregando dados...']")
    public WebElement Loading;

    @FindBy(how = How.XPATH, using = "//div[@class='loading-circle']")
    public WebElement LoadingIcon;

    @FindBy(how = How.XPATH, using = "//iframe[@title='chat widget']")
    public WebElement IFrameWidget;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Descartar']")
    public WebElement BtnCloseChatWidget;

    @FindBy(how = How.XPATH, using = "//a[text()='Criar conta']")
    public WebElement BtnRegister;

    @FindBy(how = How.XPATH, using = "//a[text()='Esqueceu sua senha?']")
    public WebElement BtnForgotPassword;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email ou Celular']")
    public WebElement InputRecoverPassword;

    @FindBy(how = How.XPATH, using = "//span[text()='Recuperar senha']")
    public WebElement BtnRecoverPassword;
}
