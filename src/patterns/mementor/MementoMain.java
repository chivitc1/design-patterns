package patterns.mementor;

public class MementoMain {

	public static void main(String[] args) {
		FileWriterCaretaker careTaker = new FileWriterCaretaker();
		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("First set of data\n");
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		careTaker.save(fileWriter);

		// now write something else
		fileWriter.write("Second set of data\n");

		// checking file contents
		System.out.println(fileWriter + "\n\n");

		// let undo to last saved
		careTaker.undo(fileWriter);

		// checking file contents
		System.out.println(fileWriter + "\n\n");
	}
}
