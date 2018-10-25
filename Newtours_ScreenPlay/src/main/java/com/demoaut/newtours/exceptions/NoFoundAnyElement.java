package com.demoaut.newtours.exceptions;


/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Esta es una excepción llamada NoFoundAnyElement que es llamada cuando la aplicación no tiene 
 * internet, es decir, no se puede inicializar la apliación por falta de internet o red wifi.
 */

public class NoFoundAnyElement extends AssertionError{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public NoFoundAnyElement(String message, Throwable cause) {       
        super(message, cause);
    }
	


	public static String getmessagestart() {
		// TODO Auto-generated method stub
		return String.format("No Hay Conexión A La Red");
	}
}
