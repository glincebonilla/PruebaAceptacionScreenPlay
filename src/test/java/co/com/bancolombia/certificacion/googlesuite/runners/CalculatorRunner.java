package co.com.bancolombia.certificacion.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/addnumbers.feature" , 
		glue = "co.com.bancolombia.certificacion.addnumbers.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class CalculatorRunner {}
