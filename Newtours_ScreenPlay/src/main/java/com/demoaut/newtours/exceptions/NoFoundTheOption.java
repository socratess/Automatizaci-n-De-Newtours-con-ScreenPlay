package com.demoaut.newtours.exceptions;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Esta es una excepción llamada NoFoundTheOption que es
 * llamada cuando la aplicación al logearse no es posible el acceso
 * por los datos incorrecots.
 */
public class NoFoundTheOption extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public NoFoundTheOption(String message, Throwable cause) {       
        super(message, cause);
    }
	
	public static String getMissingMessage() {
	    return String.format("Los Datos Ingresados En El Login No Son Correctos Para Ingresar A La Página Principal");
}
	public static String getMissingMessage1() {
	    return String.format("Los Datos Ingresados Para El Registro No Son Correctos, Dado Esto No Es Posible Ingresar A La Página Principal");
}
}