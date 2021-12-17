package advancedJava;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main (String[] args) throws IOException {
	
	FileReader reader=null;
	FileWriter writer=null;
	
	
	try {
		reader = new FileReader("C:\\Users\\sejdi\\OneDrive\\Desktop\\source.txt");
		writer = new FileWriter("C:\\Users\\sejdi\\OneDrive\\Desktop\\destination.txt");
		
		int content;
		while ((content=reader.read()) != -1) {
			writer.append((char) content);
		}
	} finally {
		if (reader!=null) {
			reader.close();
		}
		if (writer!=null) {
			writer.close();
		}
	}
	
	}
}
