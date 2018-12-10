package university.registration;

import university.Student;

public class Validator {
	private static Validator validator=null;
	private Validator(){
		
	}
	
	static Validator getValidator(){
		if(validator==null) return new Validator();
		return validator;
	}
	
	public boolean validateStudentDetails(Student student){
		return true;
	}
}
