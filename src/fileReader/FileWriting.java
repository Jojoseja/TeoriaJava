package fileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriting{
	public static void main(String[] args) {
		String dir = "C:\\Users\\Jojo\\Documents\\GitHub\\Teoria01\\src\\fileReader";
		String fileName = "filename.txt";
		try {
			File file = new File (dir, "filename.txt" );
			FileWriter myWriter = new FileWriter(file);
			myWriter.write("This is printing in the file");
			myWriter.close();
			System.out.println("uwu");
		} catch	(IOException e) {
			System.out.println("Error :(");
			e.printStackTrace();
		}
	}
}
