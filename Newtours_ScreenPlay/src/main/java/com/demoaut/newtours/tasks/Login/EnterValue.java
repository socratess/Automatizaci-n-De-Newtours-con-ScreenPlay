package com.demoaut.newtours.tasks.Login;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * En esta task se envian los valores a los text area del login para que 
 * estos se ingresen en dichos text areas y posterior verificacion al darle click en el boton
 * que permite el logeo de los datos ingresados
 * */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.models.DatosLogin;
import com.demoaut.newtours.userinterface.Login.NewTours_Logs_In_Page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterValue implements Task{

	private DatosLogin dates;
	//private String password;
	
	public EnterValue(DatosLogin dates) {
		this.dates=dates;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(dates.getUserName()).into(NewTours_Logs_In_Page.USER_NAME));
		actor.attemptsTo(Enter.theValue(dates.getPassword()).into(NewTours_Logs_In_Page.PASS_WORD));
		actor.attemptsTo(Click.on(NewTours_Logs_In_Page.SING_IN));	
	}

	public static EnterValue in(DatosLogin dates) {
		// TODO Auto-generated method stub
		return instrumented(EnterValue.class, dates);
	}
	
	

}
