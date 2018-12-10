package university;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import university.registration.RegistrationException;

public class Main {

	public static void main(String[] args) throws IOException, RegistrationException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name = br.readLine();
		System.out.println("Enter your marital status: ");
		String maritalStatus = br.readLine();
		System.out.println("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter your sex: ");
		String sex = br.readLine();
		System.out.println("Enter your date of birth: ");
		String dob = br.readLine();
		System.out.println("Enter your address: ");
		String address = br.readLine();
		System.out.println("Enter your primary email id: ");
		String primaryEmailId = br.readLine();
		System.out.println("Enter your secondary email id: ");
		String secondaryEmailId = br.readLine();
		System.out.println("Enter your phone: ");
		String phoneNumber = br.readLine();
		System.out.println("Enter your highest educational qualification: ");
		String highestEduQualification = br.readLine();
		System.out.println("Enter your nationality: ");
		String nationality = br.readLine();
		
		Student s = new Student(name, maritalStatus, age, sex, dob, address, primaryEmailId, secondaryEmailId,phoneNumber, highestEduQualification, nationality);
		
		Subject.populateList();
		System.out.println("Choose your subject of specialization: ");
		Subject.viewSubject();
		System.out.println("Enter the subject code: ");
		String subCode = br.readLine();
		System.out.println("Enter the subject name: ");
		String subName = br.readLine();
		s.setSubject(new Subject(subCode, subName));
		
		s.registerStudent();
		s.registerForExam();
		s.appearForExam();

	}

}
