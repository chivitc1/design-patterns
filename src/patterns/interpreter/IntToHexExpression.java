package patterns.interpreter;

public class IntToHexExpression implements IExpression {

	private int i;
	
	@Override
	public String interpret(InterpreterContext context) {
		return context.getHexadecimalFormat(i);
	}

	public IntToHexExpression(int i) {
		this.i = i;
	}
}
