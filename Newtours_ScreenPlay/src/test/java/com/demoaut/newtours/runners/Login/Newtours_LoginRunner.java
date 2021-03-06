package com.demoaut.newtours.runners.Login;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Este es el runner de todo lo relacionado con el registro en Newtour, 
 * se tiene features es igual a la ruta donde va el punto feature, ademas, 
 * en el glue se tiene el nombre del paquete del StepDefinitions
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(
		features="src/test/resources/com/demoaut/newtours/Newtours_Log_In.feature",
		glue="com.demoaut.newtours.stepdefinitions.Login",
		snippets=SnippetType.CAMELCASE
	)
public class Newtours_LoginRunner {

}
