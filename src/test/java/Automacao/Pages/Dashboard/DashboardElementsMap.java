package Automacao.Pages.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardElementsMap {
    
    public DashboardElementsMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(how = How.XPATH, using = "//div[@class='text-center pt-3']/input[@type='file']")
    public WebElement InputFile;

    @FindBy(how = How.XPATH, using = "//div[@class='loaded-files-list__item']")
    public WebElement FilePresent;
}
