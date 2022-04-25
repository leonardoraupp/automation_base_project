package Automacao.Setup;

import java.io.FileReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetUp {

    public static WebDriver driver;
    public static String Base_Url;
    public static String plataforma;
    public static Boolean headless;
    public static Boolean docker;
    public String tag;

    public static void createDriver() {

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("./src/test/java/conf.json"));

            // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
            JSONObject jsonObject = (JSONObject) obj;
            plataforma = (String) jsonObject.get("plataforma");
            Base_Url = (String) jsonObject.get("urlTesting");
            headless = (Boolean) jsonObject.get("headless");
            docker = (Boolean) jsonObject.get("docker");

        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (plataforma) {
            case "Linux":
                System.setProperty("webdriver.chrome.driver", "./src/test/java/Drivers/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless == true) {
                    chromeOptions.addArguments("--headless", "--window-size=1920,1200");
                }
                chromeOptions.addArguments("disable-infobars");

                if (docker == true) {

                    URL driverUrl = null;
                    try {
                        driverUrl = new URL("http://selenium_server_firefox:4444");///hub
                    } catch (Exception ex) {
                        System.out.print(ex.getMessage());
                    }
                    SetUp.driver = new RemoteWebDriver(driverUrl, chromeOptions);
                    SetUp.driver = new RemoteWebDriver(driverUrl, new FirefoxOptions());
                } else {

                    SetUp.driver = new ChromeDriver(chromeOptions);
                    SetUp.driver.get(SetUp.Base_Url);
                    SetUp.driver.manage().window().maximize();
                }
                break;
            case "Windows":
                System.setProperty("webdriver.chrome.driver", ".\\src\\test\\java\\Drivers\\chromedriver.exe");
                ChromeOptions chromeOptionsWin = new ChromeOptions();
                if (headless == true) {
                    chromeOptionsWin.addArguments("--headless", "--window-size=1920,1200");
                }
                chromeOptionsWin.addArguments("--disable-infobars");
                chromeOptionsWin.addArguments("--disable-gpu");
                SetUp.driver = new ChromeDriver(chromeOptionsWin);
                SetUp.driver.get(SetUp.Base_Url);
                SetUp.driver.manage().window().maximize();
                break;
        }

    }

    // destruir navegador
    public static void tearDown() {
        try {
            SetUp.driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // obter driver
    public static WebDriver getDriver() {
        return SetUp.driver;
    }

    // Definir driver
    public static void setDriver(WebDriver driver) {
        SetUp.driver = driver;
    }
}
