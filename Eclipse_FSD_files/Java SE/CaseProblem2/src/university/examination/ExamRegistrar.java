package university.examination;

import university.Student;

public class ExamRegistrar {
	private static ExamRegistrar examRegistrar=null;
	private ExamRegistrar(){
		
	}
	public static ExamRegistrar getExamregistrar(){
		if(examRegistrar==null) return new ExamRegistrar();
		return examRegistrar;
	}
	public Exam registeringStudentForExamination(Student student){
		Paper paper=new Paper();
		Exam exam=new Exam(paper);
		return exam;
	}
}
