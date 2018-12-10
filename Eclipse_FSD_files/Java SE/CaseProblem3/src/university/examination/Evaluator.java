package university.examination;

public class Evaluator {
	private static Evaluator evaluator=null;
	private Evaluator(){
	}
	public static Evaluator getEvaluator(){
		if(evaluator==null) return new Evaluator();
		return evaluator;
	}
	String evaluate(Paper paper){
		return "Pass";
	}
}
