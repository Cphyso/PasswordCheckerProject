package com.Umuzi.projects;

public class NoDigitException extends Exception{
	public NoDigitException(){
        System.out.println("Error occurred : password should have at least one digit");
    }
}
