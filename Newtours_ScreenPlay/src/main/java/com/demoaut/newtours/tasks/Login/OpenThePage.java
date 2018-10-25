package com.demoaut.newtours.tasks.Login;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * En esta task se envian la peticion para el inicio de la pagina newtours desde el la pagina login
 * */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenThePage implements Task {

     private PageObject page;
	
	public OpenThePage(PageObject page) {
		this.page=page;
	}
	
	
	@Override
	@Step("{0} opens the browser on Newtours Home Page Login")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static OpenThePage on(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(OpenThePage.class,page);
	}

}
