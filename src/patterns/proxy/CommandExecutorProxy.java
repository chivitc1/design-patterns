package patterns.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("chinv".equals(user) && "passw0rd".equals(pwd))
			isAdmin = true;		
		
		//set proxy for object
		executor = new CommandExecutorImpl();
	}

	//Control access
	@Override
	public void runCommand(String cmd) throws Exception {

		if(isAdmin){
			executor.runCommand(cmd);
		} else{
			if(cmd.trim().startsWith("rm"))
				throw new Exception("rm command is not allowed for nonadmin users.");
			else
				executor.runCommand(cmd);
		}
	}
}
