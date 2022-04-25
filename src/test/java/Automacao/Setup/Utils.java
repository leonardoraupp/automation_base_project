package Automacao.Setup;

import java.lang.reflect.Type;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import Automacao.Pages.Register.RegisterElementsMap;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.*;
import java.io.File;



import java.util.Random;

import static Automacao.Setup.SetUp.Base_Url;

public class Utils {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static JavascriptExecutor js;
    private static Actions actions;
    private static RegisterElementsMap registerElementsMap;
    public static String EmailTemp;
    public static String Mail7Copied;

    public Utils(WebDriver _driver) {
        driver = _driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        actions = new Actions(SetUp.getDriver());
        registerElementsMap = new RegisterElementsMap(_driver);
    }

    public boolean OpenTempMail() throws Exception {
        try {
            this.driver.get("https://temp-mail.org/en/");
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean CloseTempMail() throws Exception {
        try {
            this.driver.quit();
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean OpenAssine() throws Exception {
        try {
            String base_url = Base_Url;
            this.driver.get(base_url);

            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public String CopyMail7() throws Exception {
        try {
            this.highlight(driver.findElement(By.id("deusername")));
            this.Mail7Copied = driver.findElement(By.id("deusername")).getAttribute("value");
            return Mail7Copied;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ScrollDown(int scroll) throws Exception {
        try {
            js.executeScript("window.scrollBy(0," + scroll + ")", "");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean WaitingForElement(WebElement element, int timeout) throws Exception {
        try {

            wait.withTimeout(Duration.ofSeconds(timeout));
            WebElement el = wait.until(ExpectedConditions.visibilityOf(element));

            this.highlight(el);
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean WaitingForDisappear(By locator) throws Exception {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try {
            WebElement el = wait.until(ExpectedConditions.visibilityOf(element));
            this.highlight(el);
            return element.isDisplayed();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            wait.withTimeout(Duration.ofSeconds(5));
            WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(element));
            wait.until(ExpectedConditions.visibilityOf(el));
            this.highlight(el);
            return el.isDisplayed();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean WaitingForElement(By element, int timeout) throws Exception {
        try {
            wait.withTimeout(Duration.ofSeconds(timeout));
            WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(element));
            wait.until(ExpectedConditions.visibilityOf(el));

            this.highlight(el);
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean WaitingForElementToBeClickable(By element, int timeout) throws Exception {
        try {
            wait.withTimeout(Duration.ofSeconds(timeout));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(el));

            this.highlight(el);
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ClickOnElement(By element) throws Exception {
        try {
            wait.withTimeout(Duration.ofSeconds(5));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(element));
            this.highlight(el);
            el.click();

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ClickOnElement(WebElement element) throws Exception {
        try {
            wait.withTimeout(Duration.ofMillis(7000));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            this.highlight(element);
            element.click();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ClickOnElement(WebElement element, WebElement element2) throws Exception {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            this.highlight(element);
            element.click();
        } catch (TimeoutException e) {
            wait.withTimeout(Duration.ofMillis(500));
            wait.until(ExpectedConditions.elementToBeClickable(element2));
            this.highlight(element2);
            element2.click();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void SetValue(WebElement element, String value) throws Exception {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            this.highlight(element);

            if (element.getText() != "" || element.getAttribute("value") != "") {
                element.sendKeys(Keys.CONTROL, "a");
                element.sendKeys(Keys.DELETE);
                element.clear();
            }

            element.sendKeys(value);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public String GetValue(WebElement element) throws Exception {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            this.highlight(element);
            return element.getAttribute("innerHTML");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void Refresh() throws Exception {
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void UploadFile(WebElement element, String value) throws Exception {
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
            this.highlight(element);
            element.sendKeys(value);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void UploadFile(By element, String value) throws Exception {
        try {
            WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(element));
            this.highlight(el);
            this.ClickOnElement(element);
            el.sendKeys(value);

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void DragAndDrop(WebElement element, WebElement to) throws Exception {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.elementToBeClickable(to));

            this.highlight(element);
            this.highlight(to);
            actions.moveToElement(to).build().perform();
            actions.clickAndHold(element).moveToElement(to).pause(Duration.ofSeconds(1)).click(to).release().build()
                    .perform();

        } catch (Exception e) {

            System.out.println(e.getMessage());
            throw new Exception(e);
        }
    }

    public String GetTextAlert() throws Exception {
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String text = alert.getText();
            alert.accept();
            return text;

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ScrollToElement(By element) throws Exception {
        try {
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(element));
            js.executeScript("arguments[0].scrollIntoView(true);", el);
            this.highlight(el);
            Thread.sleep(500);

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void SwitchWindow(int window) throws Exception {
        try {
            List<String> abas = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(abas.get(window));

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void SwitchIframe(WebElement element, WebElement act) throws Exception {
        try {
            driver.switchTo().frame(element);
            wait.until(ExpectedConditions.elementToBeClickable(act));
            act.click();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public boolean SelectOptions(By locator, String option) throws Exception {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            Select selectObject = new Select(element);
            selectObject.selectByVisibleText(option);
            return true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void SetValue(WebElement element, WebElement element2, String value) throws Exception {
        try {

            wait.until(ExpectedConditions.elementToBeClickable(element));
            this.highlight(element);

            if (element.getText() != "" || element.getAttribute("value") != "") {
                element.sendKeys(Keys.CONTROL, "a");
                element.sendKeys(Keys.DELETE);
                element.clear();
            }

            element.sendKeys(value);
        } catch (TimeoutException e) {
            wait.withTimeout(Duration.ofMillis(500));
            wait.until(ExpectedConditions.elementToBeClickable(element2));
            this.highlight(element2);

            if (element2.getText() != "" || element2.getAttribute("value") != "") {
                element2.sendKeys(Keys.CONTROL, "a");
                element2.sendKeys(Keys.DELETE);
                element2.clear();
            }

            element2.sendKeys(value);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<WebElement> WaitingForElements(List<WebElement> elements, int timeout) throws Exception {
        try {
            List<WebElement> elementsVisibles = new ArrayList<WebElement>();
            for (WebElement el : elements) {
                WebElement elDisplayed = wait.until(ExpectedConditions.elementToBeClickable(el));

                this.highlight(el);

                elementsVisibles.add(elDisplayed);
            }

            return elementsVisibles;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private void highlight(WebElement locator) throws Exception {

        try {
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
                    locator, "outline: 4px solid #00FF00;");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void Sleep(int timeout) throws Exception {
        try {
            Thread.sleep(timeout);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ClickJS(WebElement element) throws Exception {
        try {
            this.WaitingForElement(element, 10);
            js.executeScript("arguments[0].click()", element);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void ClickJSWithoutWait(WebElement element) throws Exception {
        try {
            js.executeScript("arguments[0].click()", element);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void KeyboardActions(String action) throws Exception {
        try {
            switch (action) {
                case "Set":
                    actions.sendKeys(Keys.ENTER);
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public String geraCPF() throws Exception {

        try {
            int digito1 = 0, digito2 = 0, resto = 0;
            String nDigResult;
            String numerosContatenados;
            String numeroGerado;

            Random numeroAleatorio = new Random();

            // numeros gerados
            int n1 = numeroAleatorio.nextInt(10);
            int n2 = numeroAleatorio.nextInt(10);
            int n3 = numeroAleatorio.nextInt(10);
            int n4 = numeroAleatorio.nextInt(10);
            int n5 = numeroAleatorio.nextInt(10);
            int n6 = numeroAleatorio.nextInt(10);
            int n7 = numeroAleatorio.nextInt(10);
            int n8 = numeroAleatorio.nextInt(10);
            int n9 = numeroAleatorio.nextInt(10);

            int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

            int valor = (soma / 11) * 11;

            digito1 = soma - valor;

            // Primeiro resto da divisão por 11.
            resto = (digito1 % 11);

            if (digito1 < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }

            int soma2 = digito1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

            int valor2 = (soma2 / 11) * 11;

            digito2 = soma2 - valor2;

            // Primeiro resto da divisão por 11.
            resto = (digito2 % 11);

            if (digito2 < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }

            // Conctenando os numeros
            numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + "."
                    + String.valueOf(n4) +
                    String.valueOf(n5) + String.valueOf(n6) + "." + String.valueOf(n7) + String.valueOf(n8) +
                    String.valueOf(n9) + "-";

            // Concatenando o primeiro resto com o segundo.
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

            numeroGerado = numerosContatenados + nDigResult;

            return numeroGerado;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    // drop the file
    public void DropFile(File filePath, WebElement target, int offsetX, int offsetY) {
        if(!filePath.exists())
            throw new WebDriverException("File not found: " + filePath.toString());

        WebDriver driver = ((RemoteWebElement)target).getWrappedDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebDriverWait wait = new WebDriverWait(driver, 30);

        String JS_DROP_FILE =
            "var target = arguments[0]," +
            "    offsetX = arguments[1]," +
            "    offsetY = arguments[2]," +
            "    document = target.ownerDocument || document," +
            "    window = document.defaultView || window;" +
            "" +
            "var input = document.createElement('INPUT');" +
            "input.type = 'file';" +
            "input.style.display = 'none';" +
            "input.onchange = function () {" +
            "  var rect = target.getBoundingClientRect()," +
            "      x = rect.left + (offsetX || (rect.width >> 1))," +
            "      y = rect.top + (offsetY || (rect.height >> 1))," +
            "      dataTransfer = { files: this.files };" +
            "" +
            "  ['dragenter', 'dragover', 'drop'].forEach(function (name) {" +
            "    var evt = document.createEvent('MouseEvent');" +
            "    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);" +
            "    evt.dataTransfer = dataTransfer;" +
            "    target.dispatchEvent(evt);" +
            "  });" +
            "" +
            "  setTimeout(function () { document.body.removeChild(input); }, 25);" +
            "};" +
            "document.body.appendChild(input);" +
            "return input;";

        WebElement input =  (WebElement)jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY);
        input.sendKeys(filePath.getAbsoluteFile().toString());
        wait.until(ExpectedConditions.stalenessOf(input));
    }

}