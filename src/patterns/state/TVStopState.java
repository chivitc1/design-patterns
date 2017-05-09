package patterns.state;

public class TVStopState implements IState {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}
}
