package university.registration;
import university.UniversityException;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import university.Student;
import university.Subject;

public class Registrar {
	static Registrar registrar=null;
	int c = 1;
	
	private Registrar(){
	}
	
	public static Registrar getRegistrar(){
		if(registrar==null) return new Registrar();
		return registrar;
	}
	
	public void registerStudent(Student student) throws RegistrationException{
		Validator validator=Validator.getValidator();
		try{
			if(validator.validateStudentDetails(student)) {
				String admId = "STD" + String.format("%03d", c);
				student.setAdmissionId(admId);
				}
				c++;
		}
		catch(UniversityException e){
			System.out.println(e.toString());
		}
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
