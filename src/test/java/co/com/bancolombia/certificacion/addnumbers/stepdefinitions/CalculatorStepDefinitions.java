package co.com.bancolombia.certificacion.addnumbers.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.addnumbers.tasks.Add;
import co.com.bancolombia.certificacion.addnumbers.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.addnumbers.tasks.Sum;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.SumHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CalculatorStepDefinitions {
	

	@Managed(driver = "chrome")
	private WebDriver  herBrowser;
	
	private Actor Guillermo = Actor.named("Guillermo");
	
	private SumHomePage sumaHomePage;

	
	@Before 
	public void setUp() {
	  
		Guillermo.can(BrowseTheWeb.with(herBrowser));
	  
	}
	
	
	@Given("^that Guillermo wants to add two numbers$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		Guillermo.wasAbleTo(OpenTheBrowser.on(sumaHomePage));
	}

	@When("^he enters the number five  and the numbers seven$")
	public void sheTranslateTheWordCheseFromEnglishToSpanish() throws Exception {
		Guillermo.wasAbleTo(Sum.theNumbers());
	}

	@Then("^he should see the number twelve in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
        Guillermo.attemptsTo(Add.viewResult());
	}



}
