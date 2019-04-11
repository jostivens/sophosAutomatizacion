package com.bing.qa.busquedaserenitybingexplorer.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bing.com")
public class BingHomePage extends PageObject {

	@FindBy(name = "q")
	private WebElementFacade searchTerms;

	@FindBy(name = "go")
	private WebElementFacade lookupButton;

	public void escribirEnCajaDeText(String textodebusqueda) {

		searchTerms.waitUntilVisible().sendKeys(textodebusqueda);

	}

	public void clickBuscar() {

		lookupButton.waitUntilClickable().click();

	}

	public String capturaDatoBusqueda() {

		return searchTerms.waitUntilVisible().getText();

	}
}