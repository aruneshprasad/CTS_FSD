package university.registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import university.Student;
import university.Subject;

public class Registrar{
	int c = 1;
	static Registrar registrar=null;
	
	private Registrar(){
	}
	
	public static Registrar getRegistrar(){
		if(registrar==null) return new Registrar();
		return registrar;
	}
	
	public String registerStudent(Student student) {
		String admId = null;
		Validator validator = Validator.getValidator();
		
		if(validator.validateStudentDetails(student)) {
			admId = "STD" + String.format("%03d", c);
		}
		c++;
		return admId;
	}
	
	public void addSubject() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the subject code: ");
		String code = br.readLine();
		System.out.println("Enter the subject name: ");
		String name = br.readLine();
		Subject.getSubjectList().put(code, name);
	}

	public void removeSubject() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the subject code: ");
		String code = br.readLine();
		Subject.getSubjectList().remove(code);
	}


}
