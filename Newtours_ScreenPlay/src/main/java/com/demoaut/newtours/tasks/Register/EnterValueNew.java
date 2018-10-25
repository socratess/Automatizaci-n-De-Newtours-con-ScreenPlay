package com.demoaut.newtours.tasks.Register;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * En esta task se envian los valores a los text area del registro para que 
 * estos se ingresen en dichos text areas,selects y posterior verificacion al darle click en el boton
 * que permite el registro de los datos ingresados
 * */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.models.DatosRegister;
import com.demoaut.newtours.userinterface.Register.NewTours_Register_Page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterValueNew implements Task {

	
	DatosRegister datos;
	public EnterValueNew(DatosRegister datos) {
		this.datos=datos;
	}
	
	/*private String firstName;
	private String lastName; 
	private String phone;
	private String email;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String userName; 
	private String password; 
*/
	/*public EnterValueNew(String firstName, String lastName, 
			String phone, String email, 
			String address,String city, 
			String state, String postalCode,
			String country, String userName, String password) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.phone=phone;
		this.email=email;
		this.address=address;
		this.city=city;
		this.state=state;
		this.postalCode=postalCode;
		this.country=country;
		this.userName=userName;
		this.password=password;
}*/
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(datos.getFirstName()).into(NewTours_Register_Page.FIRST_NAME));
		actor.attemptsTo(Enter.theValue(datos.getLastName()).into(NewTours_Register_Page.LAST_NAME));
		actor.attemptsTo(Enter.theValue(datos.getPhone()).into(NewTours_Register_Page.PHONE));
		actor.attemptsTo(Enter.theValue(datos.getUserName()).into(NewTours_Register_Page.USERNAME));
		actor.attemptsTo(Enter.theValue(datos.getAddress1()).into(NewTours_Register_Page.ADDRESS1));
		actor.attemptsTo(Enter.theValue(datos.getAddress2()).into(NewTours_Register_Page.ADDRESS2));
		
		actor.attemptsTo(Enter.theValue(datos.getCity()).into(NewTours_Register_Page.CITY));
		actor.attemptsTo(Enter.theValue(datos.getState()).into(NewTours_Register_Page.STATE));
		actor.attemptsTo(Enter.theValue(datos.getPostalCode()).into(NewTours_Register_Page.POSTALCODE));
		
		actor.attemptsTo(Enter.theValue(datos.getEmail()).into(NewTours_Register_Page.EMAIL));
		actor.attemptsTo(Enter.theValue(datos.getPassword()).into(NewTours_Register_Page.PASSWORD));
		actor.attemptsTo(Enter.theValue(datos.getPassword()).into(NewTours_Register_Page.CONFIR_PASSWORD));
		actor.attemptsTo(SelectFromOptions.byValue(datos.getCountry()).from(NewTours_Register_Page.COUNTRY));
				//(Enter.theValue(country).into(NewTours_Register_Page.COUNTRY));
		
		actor.attemptsTo(Click.on(NewTours_Register_Page.SUBMIT));	
	
	}

	public static EnterValueNew in(DatosRegister datos) {
		// TODO Auto-generated method stub
		return instrumented(EnterValueNew.class,datos);
	}
}
