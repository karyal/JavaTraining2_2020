package file_io.file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReader {
	final String FILE_NAME = "data1.txt";
	
	public void write(String str) throws IOException{
		FileWriter writer = new FileWriter(FILE_NAME);
		writer.write(str);
		writer.close();
	}
	public void read() throws IOException{
		FileReader reader= new FileReader(FILE_NAME);
		int n=0;
		while((n = reader.read())!=-1) {
			System.out.print((char)n);
		}
		System.out.println();
		reader.close();
	}
	public static void main(String[] args) throws IOException{
		String str1 ="Java.io class package includes almost all operations of input and output needs. All of these stream classes represent the input source and output destination.\r\n";				
		new FileWriterFileReader().write(str1);				
		new FileWriterFileReader().read();
	}
}