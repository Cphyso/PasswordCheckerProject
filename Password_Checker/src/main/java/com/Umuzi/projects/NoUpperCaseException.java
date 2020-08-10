package com.Umuzi.projects;

public class NoUpperCaseException extends Exception {
	 public NoUpperCaseException(){
	        System.out.println("Error occurred : password should have at least one uppercase letter");
	    }
}
