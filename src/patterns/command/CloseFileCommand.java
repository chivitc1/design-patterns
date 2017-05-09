package patterns.command;

public class CloseFileCommand implements ICommand {
	private IFileSystemReceiver fileSystem;

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

	public CloseFileCommand(IFileSystemReceiver fileSystem) {
		this.fileSystem = fileSystem;
	}
}
