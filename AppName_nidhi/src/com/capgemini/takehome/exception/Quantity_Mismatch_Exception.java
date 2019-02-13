package com.capgemini.takehome.exception;

public class Quantity_Mismatch_Exception extends Exception {
	
	public Quantity_Mismatch_Exception () {
		
		super("***quantity should not be less than or equal to zero"+"ProductCode should be of 4 digit");
	}
	

}
