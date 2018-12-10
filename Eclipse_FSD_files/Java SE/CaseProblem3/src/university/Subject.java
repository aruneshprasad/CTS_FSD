package university;

import java.util.Map;
import java.util.TreeMap;


public class Subject{
	
	private String subName;
	private String subCode;
	
	
	public String getSubName() {
		return subName;
	}

	public String getSubCode() {
		return subCode;
	}
	
	public Subject(String subCode, String subName) {
		this.subCode = subCode;
		this.subName = subName;
	}

	public static TreeMap<String, String> subjectList = new TreeMap<>();
	
	public static TreeMap<String, String> getSubjectList() {
		return subjectList;
	}

	public static void populateList() {
		subjectList.put("M101", "Math");
		subjectList.put("P101", "Physics");
		subjectList.put("C101", "Chemistry");
		subjectList.put("B101", "Biology");
		subjectList.put("CM101", "Commerce");
		subjectList.put("A101", "Arts");
	}
	
	public static void viewSubject(){
		for(Map.Entry tm : subjectList.entrySet()) {
			System.out.print(tm.getKey()+" - "+tm.getValue());
			System.out.println();
		}
	}
}
