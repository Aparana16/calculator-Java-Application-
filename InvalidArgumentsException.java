package com.Aparana;

public class InvalidArgumentsException extends Exception{
	InvalidArgumentsException(){
		super("Invalid Number");
	}
	InvalidArgumentsException(String message){
		super("Invalid digit");
	}
}
