package Automacao.Runner;


import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/java/Automacao/Features"},
	glue= {"Automacao"},
	tags = "@test"
)

public class  RunnerTest {

	
	@AfterClass
    public static void abrirRelatorio() {
		try {
			java.awt.Desktop.getDesktop().open( new File("./src/test/java/relatorio.html"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
}