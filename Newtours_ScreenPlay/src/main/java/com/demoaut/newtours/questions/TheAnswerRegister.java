package com.demoaut.newtours.questions;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Esta es una Question la cual se verifica 
 * si el usuario logra tener un registro valido, en caso de el registro devuelve
 * una lista de string con un elemento antes enviado dentro de esa lista
 * para su posterior comprobación con un elemento esperado.
 */
import java.util.List;


import com.demoaut.newtours.userinterface.Register.NewTours_Register_Page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerRegister implements  Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		
		return Text.of(NewTours_Register_Page.user_name_register)
				.viewedBy(actor)                        
	            .asList();
	}

	public static TheAnswerRegister displayed() {
		// TODO Auto-generated method stub
		return new TheAnswerRegister();
	}

}
