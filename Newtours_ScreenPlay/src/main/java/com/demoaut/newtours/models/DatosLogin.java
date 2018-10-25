package com.demoaut.newtours.models;
/**
 * @author Socrates Palacios Moreno
 * @email  socratespalaciosmoreno@gmail.com
 * Esta es un modelo en el cual se guardan los datos
 * obtenidos en el scenario outline, el cual se tiene los datos
 * en una tabla para su posterior uso en la aplicación,Ademas este modelo
 * es relacionado con el login de Newtours.
 */
public class DatosLogin {

	private String userName;
	private String password;
	//private String status;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	/*public DatosLogin(String username,String password) {
		this.username=username;
		this.password=password;
	}*/
	

	 
//	 public String getstatus() {
//		 return status;
//	 }
	/* public void setusername(String username) {
	        this.username = username;
	    }
	 public void setpassword(String password) {
	        this.password = password;
	    }*/
}
