package Automacao.Pages.Dashboard;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

import Automacao.Setup.Utils;

public class DashboardActions {

    private static WebDriver driver;
    private static DashboardElementsMap dashboardElementsMap;
    private  Utils utils;  
    private final String PathPdf = new File("Documents/soluti/anexo/file-upload.pdf").getAbsolutePath();
  
    public DashboardActions(WebDriver _driver) {
        driver = _driver;
        dashboardElementsMap = new DashboardElementsMap(_driver);
        utils = new Utils(_driver);
    }

    public boolean uploadFile(String type) {
        try {
            switch (type) {
                case "pdf":
                this.utils.UploadFile(dashboardElementsMap.InputFile, PathPdf);
                this.utils.WaitingForElement(dashboardElementsMap.FilePresent, 20);                    
                break;               
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DragDocumentForUpload() {
        try {
            // locate the drop area
            WebElement  droparea = driver.findElement(By.xpath("//button[text()='Buscar em']"));
            this.utils.DropFile(new File("C:/Users/Testing Company/Desktop/assine_online_novo_selenium_tests/Documents/soluti/anexo/file-upload.pdf"), droparea, 0, 0);                               
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckDocumentOnDropzone() {
        try {
            this.utils.isDisplayed(dashboardElementsMap.FilePresent);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    



}
