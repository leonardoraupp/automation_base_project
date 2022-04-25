package Automacao.Pages.Global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GlobalElementsMap {
    
    public GlobalElementsMap(WebDriver _driver) {
        PageFactory.initElements(_driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[@role='alert']")
    public WebElement Notif;

    @FindBy(how = How.ID, using = "@chooseStore-select-selectStore")
    public WebElement InputLoja;
    
    @FindBy(how = How.XPATH, using = "//span[text()='Continuar']/..")
    public WebElement BtnContinuar;
}
