package advancedJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main (String[] args) throws IOException {
	
	FileInputStream inStream=null;
	FileOutputStream outStream=null;
	
	
	try {
		inStream = new FileInputStream("C:\\Users\\sejdi\\OneDrive\\Desktop\\source.txt");
		outStream = new FileOutputStream("C:\\Users\\sejdi\\OneDrive\\Desktop\\dest.txt");
		
		int content;
		while ((content=inStream.read()) != -1) {
			outStream.write((byte) content);
		}
	} finally {
		if (inStream!=null) {
			inStream.close();
		}
		if (outStream!=null) {
			outStream.close();
		}
	}
	
	}
}

