package Automacao.Setup;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	static WebDriver driver;
	
	// MÉTODO QUE IRÁ INICIALIZAR O DRIVER DESEJADO ANTES DE CADA CENÁRIO//
	@Before
	public void inicializaDriver() {
		// ESTE MÉTODO DA CLASSE SETUP CRIA O DRIVER PARA O NAVEGADOR PASSADO COMO PARÂMETRO
		SetUp.createDriver();
		System.out.println("Driver Criado Com sucesso"); 

	}
	
	// RELATÓRIOS DOS PASSOS EXECUTADOS
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest feature;
	
	@Before
	public void beforeScenario(Scenario cenario) {
		if(extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("./src/test/java/relatorio.html");
			extentReport.attachReporter(htmlReporter);
		}
		
		feature = extentReport.createTest(cenario.getName());
	}
	
	// FIM GERAR RELATÓRIO COM EXTENT REPORT
	@After
	public void afterCenario(Scenario cenario) {
							
		if(cenario.getStatus() ==  io.cucumber.java.Status.FAILED) {
			feature.log(Status.FAIL, "Cenario: " + cenario.getName() + " FALHOU, ANALISAR!");	
		}else if(cenario.getStatus() == io.cucumber.java.Status.SKIPPED) {
			feature.log(Status.SKIP, "Cenario: " + cenario.getName() + " FOI PULADO, ANALISAR MOTIVO!");
		}else if(cenario.getStatus() ==  io.cucumber.java.Status.PASSED){
			feature.log(Status.PASS, "Cenario: " + cenario.getName() + " EXECUTADO COM SUCESSO!");
		}else if (cenario.getStatus() == io.cucumber.java.Status.UNDEFINED) {
			feature.log(Status.INFO, "Cenario:"  +  cenario.getName() + " ALGUNS PASSOS FORAM IGNORADOS, VERIFICAR CAUSA!");
		}
			extentReport.flush();
	}
	
	@After
	public void encerrarDriver() {
		SetUp.tearDown();
	}
	
}
