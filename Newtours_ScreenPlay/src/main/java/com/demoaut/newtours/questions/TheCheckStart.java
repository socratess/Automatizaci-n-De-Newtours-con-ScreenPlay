package com.demoaut.newtours.questions;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Esta es una Question la cual se verifica 
 * si la aplicación inicia su procesos con internet, si este no la inicia el resultado es un 0
 * pero si la inicia sera un 1 , estos valores de respuesta son enteros.
 */
import com.demoaut.newtours.userinterface.Login.NewTours_Logs_In_Page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheCheckStart implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		 int sizes= Text.of(NewTours_Logs_In_Page.USER_NAME)
				.viewedBy(actor)                        
	            .asList().size();
		 if(sizes>0) {
			 return 1;
		 }
		 else {
			 return 0;
		 }
	}

	public static TheCheckStart displayed() {
		// TODO Auto-generated method stub
		return new TheCheckStart();
	}

}
