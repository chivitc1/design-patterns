package patterns.state;

public class TVStartState implements IState {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}
}
