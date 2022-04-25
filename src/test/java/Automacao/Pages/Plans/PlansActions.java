package Automacao.Pages.Plans;
import static org.junit.Assert.assertEquals;

import java.nio.file.Path;

import static java.nio.file.FileSystems.getDefault;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automacao.Pages.Envelope.EnvelopeActions;
import Automacao.Setup.Utils;
import net.bytebuddy.asm.Advice.This;


public class PlansActions {
    private static WebDriver driver;
    private static PlansElementsMap plansElementsMap;
    private Utils utils;
    private String plano;
    
    public PlansActions(WebDriver _driver) {
        driver = _driver;
        plansElementsMap = new PlansElementsMap(_driver);
        utils = new Utils(_driver);
    }

    public boolean AcessPerfilUser() {
        try {
            this.utils.ClickOnElement(plansElementsMap.LinkUser);
            this.utils.ClickOnElement(plansElementsMap.LinkPerfil);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
    public boolean SelectPlan(String Plano) {
        try {
            this.plano = Plano;
            this.utils.ScrollToElement(By.xpath(String.format("//span[contains(.,'%s')]/ parent :: node ()/ parent :: node ()//div/button", Plano)));
            this.utils.ClickOnElement(By.xpath(String.format("//span[contains(.,'%s')]/ parent :: node ()/ parent :: node ()//div/button", Plano)));
            this.utils.ScrollToElement(By.xpath(String.format("//span[contains(.,'%s')]",Plano)));
            this.utils.WaitingForElement(By.xpath(String.format("//span[contains(.,'%s')]",Plano)), 5);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetCPF(String cpf) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputCPF);
            this.utils.SetValue(plansElementsMap.InputCPF, cpf);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetCep(String cep) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputCEP);
            this.utils.SetValue(plansElementsMap.InputCEP, cep);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetAddress(String endereco) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputEndereco);
            this.utils.SetValue(plansElementsMap.InputEndereco, endereco);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetCity(String cidade) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputCidade);
            this.utils.SetValue(plansElementsMap.InputCidade, cidade);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetState(String state) {
        try {
            this.utils.SelectOptions(By.xpath("//select[@formcontrolname='state']"), state);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetCountry(String country) {
        try {
            this.utils.SelectOptions(By.xpath("//select[@formcontrolname='country']"), country);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetNumberCard(String numero) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputNumCard);
            this.utils.SetValue(plansElementsMap.InputNumCard, numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetMouthCard(String mes) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputMesCard);
            this.utils.SetValue(plansElementsMap.InputMesCard, mes);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetYearCard(String ano) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputAnoCard);
            this.utils.SetValue(plansElementsMap.InputAnoCard, ano);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetNameCard(String nome) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputNameCard);
            this.utils.SetValue(plansElementsMap.InputNameCard, nome);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SetCVV(String cvv) {
        try {
            this.utils.isDisplayed(plansElementsMap.InputCVV);
            this.utils.SetValue(plansElementsMap.InputCVV, cvv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
    public boolean ValidatesPlanContract(String text) {
        try {
            this.Loading();
            this.utils.isDisplayed(By.xpath(String.format("//p[contains(.,'%s')]", text)));
            this.utils.ClickOnElement(plansElementsMap.btnOk);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void Loading() {
        try {
            if (this.utils.isDisplayed(plansElementsMap.LoadingIcon)) {
                this.utils.WaitingForDisappear(By.xpath("//span[@class='icon']"));
            }
        } catch (Exception e) {
        }
    }

    public boolean ValidatesCancelPlan() {
        try {
            this.Loading();
            this.utils.isDisplayed(plansElementsMap.MessageCancelPlan);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean ConfirmCancelPlan() {
        try {
            this.utils.ClickOnElement(By.xpath("(//button[contains(.,'Cancelar')])[2]"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ValidContractedPlan() {
        try {
            this.utils.ScrollToElement(By.xpath(String.format("//*[text()='Plano atual']/ parent :: node ()//*[text()='%s']", plano)));
            this.utils.ClickOnElement(By.xpath(String.format("//*[text()='Plano atual']/ parent :: node ()//*[text()='%s']", plano)));
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean ValidFieldNotFilled(String campo) {
        try {
            this.utils.ClickOnElement(plansElementsMap.BtnPagar);
            switch (campo) {
                case "Estado":
                    this.utils.isDisplayed(plansElementsMap.SelectEstadoSemOpcao);
                    break;
                case "País":
                    this.utils.isDisplayed(plansElementsMap.SelectPaisSemOpcao);
                    break;
                default:
                this.utils.isDisplayed(By.xpath(String.format("//input[@placeholder='%s' and contains(@class,'ng-invalid') and contains(@class,'is-invalid')]", campo)));
                    break;
            }
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
