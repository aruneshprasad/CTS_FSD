package com;

public class Validator {
	
	private static Validator validator = null;
	private Validator() {}
	
	public static Validator getValidator() {
		if(validator == null) validator = new Validator();
		
		return validator;
	}
	
	public boolean validateStudentDetails(Student student) {
		return true;
	}

}
