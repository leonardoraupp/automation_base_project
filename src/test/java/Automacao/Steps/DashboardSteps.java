package Automacao.Steps;

import static org.junit.Assert.assertTrue;

import Automacao.Pages.Dashboard.DashboardActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps {    
    private DashboardActions dashboardActions = new DashboardActions(SetUp.getDriver());

    @Then("anexo um documento para assinar em Dashboard: {string}")
    public void Anexo_Documento(String file) {
    assertTrue("Documento não anexado.", dashboardActions.uploadFile(file));
    }  
    
    @When("arrasto um documento para upload")
    public void Arrasto_Documento_Upload() {
    assertTrue("Documento não arrastado.", dashboardActions.DragDocumentForUpload());
    }  
    @When("verifico documento na Dropzone")
    public void Verifico_Documento_Dropzone() {
    assertTrue("Documento não verificado.", dashboardActions.CheckDocumentOnDropzone());
    }     
}
