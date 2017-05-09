package patterns.interpreter;

public class IntToBinaryExpression implements IExpression {

	private int i;
	
	@Override
	public String interpret(InterpreterContext context) {
		return context.getBinaryFormat(i);
	}

	public IntToBinaryExpression(int i) {
		this.i = i;
	}
}
