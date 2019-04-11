package co.com.google.qa.miprimerscreemplay.stepsdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.WebDriver;

import co.com.google.qa.miprimerscreemplay.questions.LaFrase;
import co.com.google.qa.miprimerscreemplay.tasks.BuscaLaFrase;
import co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class BusquedaEnGoogleStepssDefinitions {
	GoogleHomePage googleHomePage;
	
	@Managed
	    private WebDriver hisBrowser;
	    private Actor stiven = Actor.named("Estiven");
	    
	@Before
	 public void actorCanBrowseTheWeb() {
		stiven.can(BrowseTheWeb.with(hisBrowser));
	   }
	
	@Given("^Stiven esta en el sitio de google$")
	public void arthurEstaEnElSitioDeGoogle()  {
		stiven.wasAbleTo(Open.browserOn().the(googleHomePage));
	  
	}

	@When("^Stiven busca la frase \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void elBuscaLaFraseCompuesta(String palabraUno, String palabraDos)  {
		stiven.attemptsTo(BuscaLaFrase.composedOfTheWords(palabraUno, palabraDos));
	}

	@Then("^Stiven verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado)  {
	    
		stiven.should(seeThat(LaFrase.searched(), is(resultadoEsperado))); 
	}



}
