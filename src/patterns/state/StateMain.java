package patterns.state;

public class StateMain {

	public static void main(String[] args) {

		TVContext context = new TVContext();
		IState tvStartState = new TVStartState();
		IState tvStopState = new TVStopState();
		
		context.setTvState(tvStartState);
		context.doAction();
		
		context.setTvState(tvStopState);
		context.doAction();
	}
}
