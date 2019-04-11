package com.bing.qa.busquedaserenitybingexplorer.steps;

import com.bing.qa.busquedaserenitybingexplorer.pages.BingHomePage;

import net.thucydides.core.annotations.Step;

public class EndUserSteps {

	BingHomePage paginadebusqueda;

	@Step
	public void escribirEnCampoDeBusqueda(String palabras) {
		paginadebusqueda.escribirEnCajaDeText(palabras);
	}

	@Step
	public void clickBuscar() {
		paginadebusqueda.clickBuscar();
	}

	@Step
	public void abrirPagina() {
		paginadebusqueda.open();
	}



	/*@Step
	public String capturarDato() {
		return paginadebusqueda.capturaDatoBusqueda();
	}*/

}
