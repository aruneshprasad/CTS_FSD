package university;

import university.examination.Exam;
import university.examination.ExamRegistrar;
import university.examination.Paper;
import university.registration.Registrar;
import university.registration.RegistrationException;

public class Student {
	
	private String name;
	private String maritalStatus;
	private int age;
	private String sex;
	private String dob;
	private String address;
	private String primaryEmailId;
	private String secondaryEmailId;
	private String phoneNumber;
	private String highestEduQualification;
	private String nationality;
	
	private String admissionId;
	private String result;
	private Exam exam;
	private Registrar registrar;
	private Subject subject;
	
	
	
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	public String getPrimaryEmailId() {
		return primaryEmailId;
	}
	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getHighestEduQualification() {
		return highestEduQualification;
	}
	public String getNationality() {
		return nationality;
	}
	public String getAdmissionId() {
		return admissionId;
	}
	public String getResult() {
		return result;
	}
	public Exam getExam() {
		return exam;
	}
	
	public Registrar getRegistrar() {
		return registrar;
	}
	
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	
	public Student(String name, String maritalStatus, int age, String sex, String dob, String address,
			String primaryEmailId, String secondaryEmailId, String phoneNumber, String highestEduQualification,
			String nationality) {
		super();
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.sex = sex;
		this.dob = dob;
		this.address = address;
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.phoneNumber = phoneNumber;
		this.highestEduQualification = highestEduQualification;
		this.nationality = nationality;
	}
	
	public void registerStudent() throws RegistrationException {
		registrar = Registrar.getRegistrar();
		registrar.registerStudent(this);
		System.out.println(name+" is registered with admission number "+admissionId);
		
	}
	
	public void registerForExam() {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamregistrar();
		exam = examRegistrar.registeringStudentForExamination(this);
		System.out.println(name+" is registered for "+ this.getSubject().getSubName()+" examination.");
	}
	
	public void appearForExam() {
		Paper paper = exam.getPaper();
		result = paper.submit();
		System.out.println(name+" has passed the exam and has been admitted to the university");
	}
}