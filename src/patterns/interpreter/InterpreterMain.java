package patterns.interpreter;

public class InterpreterMain {

	public InterpreterContext context;
	
	public InterpreterMain(InterpreterContext context) {
		this.context = context;
	}

	public String interpreter(String str){
		IExpression exp = null;
		
		//create rules for expressions
		if(str.contains("Hexadecimal")){
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if(str.contains("Binary")){
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else{
			return str;
		}
		
		return exp.interpret(context);
	}
	
	public static void main(String[] args) {
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";
		
		InterpreterMain app = new InterpreterMain(new InterpreterContext());
		System.out.println(str1 +"= " + app.interpreter(str1));
		System.out.println(str2 +"= " + app.interpreter(str2));
	}
}
