package Automacao.Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Automacao.Pages.Global.GlobalActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GlobalSteps {
    
    private GlobalActions globalActions = new GlobalActions(SetUp.getDriver());

    @Then("sistema deve exibir um alerta com a mensagem: {string}")
    public void Sistema_Exibir_Alerta(String message) {
        assertEquals("Alerta não exibido.", message, globalActions.GetNotifMessage());
    }
    
    @And("seleciono a loja {string}")
    public void Seleciono_loja(String name) {
        assertTrue("Loja não exibido.", globalActions.SetLoja(name));
    }
}
