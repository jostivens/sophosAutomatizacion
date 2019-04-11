package co.com.google.certificacion.miprimerproyectoserenity.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        ) 

public class BusquedaEnGoogleRunner {

}
