package Automacao.Pages.Global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automacao.Setup.Utils;

public class GlobalActions {
    
    private static WebDriver driver;
    private static GlobalElementsMap globalElementsMap;
    private Utils utils;

    public GlobalActions(WebDriver _driver) {
        driver = _driver;
        globalElementsMap = new GlobalElementsMap(_driver);
        this.utils = new Utils(_driver);
    }

    public String GetNotifMessage() {
        try {
            this.utils.WaitingForElement(globalElementsMap.Notif, 10);

            return globalElementsMap.Notif.getText();
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean OpenOption() {
        try {
            this.utils.ClickOnElement(globalElementsMap.InputLoja);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean SetLoja(String loja) {
        try {
            this.OpenOption();
            this.utils.Sleep(1000);
            if(loja.equals("Testing Company")){
                this.utils.ClickOnElement(By.xpath("//li[text()='Testing Company']"));
            }else if(loja.equals("Loja")){
                this.utils.ClickOnElement(By.xpath("//li[text()='Loja']"));
            }
            
            this.utils.ClickOnElement(globalElementsMap.BtnContinuar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    

}
