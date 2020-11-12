package basic_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicIOV3 {
	
	public String readString1() throws IOException { //CheckedException
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String tmp=br.readLine(); //IOException - CheckedException
		return tmp;
	}
	
	public String readString2() {
		String tmp="";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			tmp=br.readLine(); //IOException - CheckedException			
		}
		catch(IOException ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return tmp;
	}
}
