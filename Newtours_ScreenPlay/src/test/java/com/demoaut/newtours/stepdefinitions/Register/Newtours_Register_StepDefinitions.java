package com.demoaut.newtours.stepdefinitions.Register;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Este es el stepDefinitions que esta relacionado con el 
 * Registro de Newtour, donde se usan los 
 * metodos que arroja el .feature.
 */
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.exceptions.NoFoundAnyElement;
import com.demoaut.newtours.exceptions.NoFoundTheOption;
import com.demoaut.newtours.models.DatosRegister;
import com.demoaut.newtours.questions.TheAnswerLogin;
import com.demoaut.newtours.questions.TheCheckStart;
import com.demoaut.newtours.tasks.Register.EnterValueNew;
import com.demoaut.newtours.tasks.Register.OpenThePageRegister;
import com.demoaut.newtours.userinterface.Register.NewToursHomePageRegister;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class Newtours_Register_StepDefinitions {

	@Managed(driver="chrome") // se administra el driver
	private WebDriver hisbrowser;
	
	private Actor soc= Actor.named("soc");// se crea el actor
	
	private NewToursHomePageRegister NewToursHomePageRegister; 
	
//	private DatosRegister DatosRegister;
	
	@Before
	public void setUp() {
		soc.can(BrowseTheWeb.with(hisbrowser)); //se abre browser
	}
	
	

	/**
	 * En este modulo van todas las precondiciones 
	 * de que se usaran
	 * Se ingresa a la pagina Registrar de nuewtours y se comprueba si la aplicación funciona sin internet
	
	 */
	@Given("^that soc wants to enter values in Register page$")
	public void thatSocWantsToEnterValuesInRegisterPage() {
	    // Write code here that turns the phrase above into concrete actions
		soc.wasAbleTo(OpenThePageRegister.on(NewToursHomePageRegister));
		soc.should(seeThat(TheCheckStart.displayed(),greaterThan(0)).orComplainWith(NoFoundAnyElement.class, NoFoundAnyElement.getmessagestart()));
		
	}

	/**
	 * En este modulo van todas las condiciones 
	 * de que se usaran, se obtienen los datos del feature
	 */
	@When("^he enter the dates$")
	public void heEnterTheAnd(List<DatosRegister> datos) {
	    // Write code here that turns the phrase above into concrete actions
		soc.attemptsTo(EnterValueNew.in(datos.get(0)));
	}

	/**
	 * En este modulo van todas las poscondiciones 
	 * de que se usaran, se comprueba que el usuario se registre, en caso contrario se llama
	 * una excepción
	 */
	@Then("^he should see a new pages \"([^\"]*)\"$")
	public void heShouldSeeANewPages(String estatus) {
	    // Write code here that turns the phrase above into concrete actions
	soc.should(seeThat(TheAnswerLogin.displayed(), hasItem(estatus)).orComplainWith(NoFoundTheOption.class, NoFoundTheOption.getMissingMessage1()));
	//soc.should(seeThat(TheAnswerRegister.displayed(), contains(DatosRegister.getFirstName())).orComplainWith(NoFoundTheOption.class, NoFoundTheOption.getMissingMessage1()));	    
	}
		    
	}
	

