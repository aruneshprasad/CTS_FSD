package com;

public class ExamRegistrar {
	
	private static ExamRegistrar examRegistrar = null;
	private ExamRegistrar() {}
	
	public static ExamRegistrar getExamRegistrar() {
		if(examRegistrar == null) examRegistrar = new ExamRegistrar();
		return examRegistrar;
	}
	
	public Exam registeringStudentForExamination(Student student) {
		Paper paper = new Paper();
		Exam exam = new Exam(paper);
		return exam;
	}

}
