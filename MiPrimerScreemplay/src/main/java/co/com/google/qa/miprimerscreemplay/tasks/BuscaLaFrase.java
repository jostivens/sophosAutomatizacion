package co.com.google.qa.miprimerscreemplay.tasks;

import static co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleHomePage.SEARCH_BAR;
import static co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleHomePage.SEARCH_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscaLaFrase implements Task {
	
	private String frase;
	
	public BuscaLaFrase (String frase) {
		this.frase = frase;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(frase).into(SEARCH_BAR),
				Click.on(SEARCH_BUTTON)
				);
		
	}
	
	public static BuscaLaFrase composedOfTheWords(String palabraUno, String palabraDos) {
		
		return instrumented(BuscaLaFrase.class, palabraUno +" "+ palabraDos);
			
	}
	

}
