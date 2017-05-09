package patterns.mediator;

public interface IChatMediator {

	public void sendMessage(String msg, User user);
	void addUser(User user);
}
