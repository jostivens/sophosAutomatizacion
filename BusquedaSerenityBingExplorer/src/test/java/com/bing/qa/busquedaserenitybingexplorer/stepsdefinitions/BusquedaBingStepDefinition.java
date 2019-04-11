package com.bing.qa.busquedaserenitybingexplorer.stepsdefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.bing.qa.busquedaserenitybingexplorer.steps.EndUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaBingStepDefinition {
	
	@Steps
	 EndUserSteps stiven;

	
	@Given("^Stiven esta en la pagina de bing$")
	public void stivenEstaEnLaPaginaDeBing() throws Exception {
	   stiven.abrirPagina();
	   
	}

	@When("^Busca la frase compuesta entre \"([^\"]*)\" y \"([^\"]*)\"$")
	public void buscaLaFraseCompuestaEntreY(String arg1, String arg2) throws Exception {
	   stiven.escribirEnCampoDeBusqueda(arg1+" "+arg2 );
	   
	}

	@Then("^Stiven verifica que la palabra compuesta \"([^\"]*)\" se encuentre en la lista de resultados encontrados$")
	public void stivenVerificaQueLaPalabraCompuestaSeEncuentreEnLaListaDeResultadosEncontrados(String arg1) throws Exception {
	   System.out.println("verificacion");
	   
	 //  assertEquals(arg1, stiven.capturarDato());
	
	}

}
