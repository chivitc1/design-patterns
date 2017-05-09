package patterns.proxy;

public class ProxyMain {

	public static void main(String[] args) {

		CommandExecutor executor = new CommandExecutorProxy("user1", "passw0rd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception ex) {
			System.out.println("Exception Message::" + ex.getMessage());
		}
	}
}
