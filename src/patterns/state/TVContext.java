package patterns.state;

public class TVContext implements IState {
	private IState tvState;

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

	public IState getTvState() {
		return tvState;
	}

	public void setTvState(IState tvState) {
		this.tvState = tvState;
	}
}
