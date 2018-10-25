package com.demoaut.newtours.exceptions;


/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Esta es una excepci�n llamada NoFoundAnyElement que es llamada cuando la aplicaci�n no tiene 
 * internet, es decir, no se puede inicializar la apliaci�n por falta de internet o red wifi.
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
		return String.format("No Hay Conexi�n A La Red");
	}
}
