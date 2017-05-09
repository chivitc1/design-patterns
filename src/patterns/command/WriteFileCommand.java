package patterns.command;

public class WriteFileCommand implements ICommand {
	private IFileSystemReceiver fileSystem;

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

	public WriteFileCommand(IFileSystemReceiver fileSystem) {
		this.fileSystem = fileSystem;
	}
}
