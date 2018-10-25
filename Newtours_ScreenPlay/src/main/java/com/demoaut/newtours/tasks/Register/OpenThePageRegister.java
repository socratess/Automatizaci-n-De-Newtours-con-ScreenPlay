package com.demoaut.newtours.tasks.Register;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * En esta task se envian la peticion para el inicio de la pagina newtours desde el la pagina registrar
 * */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThePageRegister implements Task{
	 
	private PageObject pages;
		
		public OpenThePageRegister(PageObject pages) {
			this.pages=pages;
		}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(pages));
	}
	public static OpenThePageRegister on(PageObject pages) {
		// TODO Auto-generated method stub
		return instrumented(OpenThePageRegister.class,pages);
	}
	
	

}
