package fileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
	public static void main(String[] args) {
		String dir = "./src/fileReader";
		String fileName = "filename.txt";
		try {
			File file = new File (dir, fileName);
			FileWriter owo = new FileWriter(file);
			owo.write("This is printing in the file");
			owo.close();
			System.out.println("uwu");
		} catch	(IOException e) {
			System.out.println("Error :(");
			e.printStackTrace();
		}
	}
}
