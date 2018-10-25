package com.demoaut.newtours.userinterface.Register;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * En esta userinterface se mapean los elementos para usar en el registrar
 * */
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class NewTours_Register_Page {

	public static Target FIRST_NAME= Target.the("FirstName TextArea").located(By.name("firstName"));
	public static Target LAST_NAME= Target.the("LastName TextArea").located(By.name("lastName"));
	public static Target PHONE= Target.the("Phone TextArea").located(By.name("phone"));
	public static Target USERNAME= Target.the("Username TextArea").located(By.name("userName"));
	public static Target ADDRESS1= Target.the("Address TextArea").located(By.name("address1"));
	public static Target ADDRESS2= Target.the("Address TextArea").located(By.name("address2"));
	public static Target CITY= Target.the("City TextArea").located(By.name("city"));
	public static Target STATE= Target.the("State TextArea").located(By.name("state"));
	public static Target POSTALCODE= Target.the("Postalcode TextArea").located(By.name("postalCode"));
	public static Target EMAIL= Target.the("UserName TextArea").located(By.name("email"));
	public static Target PASSWORD= Target.the("Password TextArea").located(By.name("password"));
	public static Target CONFIR_PASSWORD= Target.the("Password TextArea").located(By.name("confirmPassword"));
	public static Target COUNTRY= Target.the("Country select").located(By.name("country"));
	public static Target SUBMIT= Target.the("Register Button").located(By.name("register"));
	
	public static Target user_name_register=Target.the("Nombre del usuario registrado").locatedBy("//table/tbody/tr/td/p/font/b/font//font[contains(text(),' Querido')]");
	
	public static Target SIGN_OFF= Target.the("Opcion De Salida").located(By.linkText("SIGN-OFF"));
	
	
}
