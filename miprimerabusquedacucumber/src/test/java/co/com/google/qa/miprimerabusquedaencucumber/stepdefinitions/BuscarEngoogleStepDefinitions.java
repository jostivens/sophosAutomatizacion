package co.com.google.qa.miprimerabusquedaencucumber.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEngoogleStepDefinitions {
	@Given("stiven is on google homepage")
	public void stiven_is_on_google_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Stiven abre su navegador");
		System.out.println("Stiven abre la pagina de inicio");
	    
	}

	@When("he does the search")
	public void he_does_the_search() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Stiven escribe una palabra en la barra de busqueda");
	    System.out.println("Stiven da clic en el boton buscar");
	}

	@Then("he validates that de result is success")
	public void he_validates_that_de_result_is_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Stiven captura los resultados de la busqueda");
		System.out.println("Stiven verifica que la busqueda sea exitosa");
	    
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
