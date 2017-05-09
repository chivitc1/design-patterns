package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<User> users;
	public ChatMediator() {
		users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		users.forEach(u -> {
			if(u != user){
				u.receive(msg);
			}
		});
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
}
