package com.Umuzi.projects;

public class NoLowerCaseException extends Exception {
	 public NoLowerCaseException(){
	        System.out.println("Error occurred : password should have at least one lowercase letter");
	    }
}
