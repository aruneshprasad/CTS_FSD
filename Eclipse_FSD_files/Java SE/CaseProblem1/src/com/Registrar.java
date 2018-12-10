package com;

public class Registrar {
	private static Registrar registrar = null;
	private Registrar() {}
	
	public static Registrar getRegistrar(){
		if(registrar == null) registrar = new Registrar();
		return registrar;
	}
	
	public String registerStudent(Student student) {
		String admId = null;
		Validator validator = Validator.getValidator();
		
		if(validator.validateStudentDetails(student)) {
			admId = "STD001";
		}
		return admId;
	}

}
