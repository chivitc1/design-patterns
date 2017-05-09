package patterns.command;

public interface IFileSystemReceiver {
	void openFile();

	void writeFile();

	void closeFile();
}
