package patterns.command;

public class OpenFileCommand implements ICommand {
	private IFileSystemReceiver fileSystem;

	@Override
	public void execute() {
		// open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}

	public OpenFileCommand(IFileSystemReceiver fileSystem) {
		this.fileSystem = fileSystem;
	}
}
