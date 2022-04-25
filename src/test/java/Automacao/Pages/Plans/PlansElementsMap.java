package Automacao.Pages.Plans;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PlansElementsMap {
    public PlansElementsMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "dropdownOptions")
    public WebElement LinkUser;
    
    @FindBy(how = How.XPATH, using = "//span[@class='icon']")
    public WebElement LoadingIcon;
    
    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'dropdown-item')])[1]")
    public WebElement LinkPerfil;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='CPF/CNPJ']")
    public WebElement InputCPF;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='CEP']")
    public WebElement InputCEP;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Endereço']")
    public WebElement InputEndereco;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Cidade']")
    public WebElement InputCidade;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Número do cartão']")
    public WebElement InputNumCard;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Mês']")
    public WebElement InputMesCard;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Ano']")
    public WebElement InputAnoCard;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='CVV']")
    public WebElement InputCVV;
    
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Nome no cartão']")
    public WebElement InputNameCard;
    
    @FindBy(how = How.XPATH, using = "//p[contains(.,'Você está inscrito no plano gratuito. Aproveite!')]")
    public WebElement MessageCancelPlan;
    
    @FindBy(how = How.XPATH, using = "//button[text()='Ok']")
    public WebElement btnOk;
    
    @FindBy(how = How.XPATH, using = "//button/span[text()='Pagar']")
    public WebElement BtnPagar;
    
    @FindBy(how = How.XPATH, using = "//select[@formcontrolname='state' and contains(@class,'ng-invalid') and contains(@class,'is-invalid')]")
    public WebElement SelectEstadoSemOpcao;
    
    @FindBy(how = How.XPATH, using = "//select[@formcontrolname='country' and contains(@class,'ng-invalid') and contains(@class,'is-invalid')]")
    public WebElement SelectPaisSemOpcao;
    
}
