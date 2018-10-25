package com.demoaut.newtours.userinterface.Login;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * En esta userinterface se mapean los elementos para usar en el login
 * */
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class NewTours_Logs_In_Page {

	public static Target USER_NAME= Target.the("UserName TextArea").located(By.name("userName"));
	public static Target PASS_WORD= Target.the("PassWord TextArea").located(By.name("password"));
	public static Target SING_IN= Target.the("Log-In Button").located(By.name("login"));
	public static Target SIGN_OFF= Target.the("Opcion De Salida").located(By.linkText("SIGN-OFF"));
}
