package patterns.command;

public class FileInvoker {

	public ICommand command;	
	
	public FileInvoker(ICommand command){
		this.command = command;
	}
	
	public void execute(){
		this.command.execute();
	}
}
