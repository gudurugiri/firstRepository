/**
 * 
 */
package com.test.impl;

/**
 * @author dguduru
 *
 */
public class DrivenTestImpl {
	
	public String isValiedUser(String userName,String password){
		return validateUser(userName, password);
	}

	private String validateUser(String userName,String password) {
		if(userName.equalsIgnoreCase("guduru")&&password.equalsIgnoreCase("1234")){
			return "valid";
		}else{
			return "invalid";
		}
	}
}
