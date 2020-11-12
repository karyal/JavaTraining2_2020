package library_classes;

public class StringTest {
	public static void main(String[] args) {
		//"The String class represents character strings. All string literals in Java programs, such as \"abc\", are implemented as instances of this class.";
		
		String str_1 = new String();//Default Constructor		
		System.out.println(str_1);
		
		//String(byte[] bytes)
		byte byte_array [] = {65, 66, 67, 68, 69, 70}; //ASCII - CHARACTER
		String str_2 = new String(byte_array);
		System.out.println(str_2);
		
		//String(char[] value)
		char char_array[] = {'A','B','C','D','E','F'};
		String str_3 = new String(char_array);
		System.out.println(str_3);
		
		String str4 = new String("The String class represents character strings. All string literals in Java programs, such as \"abc\", are implemented as instances of this class.");
		
		//char	charAt(int index)
		//System.out.println(str4.charAt(0));
		//System.out.println(str4.charAt(1));
		//System.out.println(str4.charAt(2));
		
		//int length()
		//System.out.println(str4.length());
		
		for (int i=0; i<str4.length(); i++) {
			System.out.print(str4.charAt(i));
		}
		System.out.println();				
		
		//int compareTo(String anotherString) //Password
		String str5 = new String("Kathmandu");
		String str6 = new String("Kathmandu");
		int res1 = str5.compareTo(str6);
		System.out.println(res1);
		//==0 - Equals
		//>0 - Not Equals
		//<0 - Not Equals
		
		if (res1 == 0) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
		//int compareTo(String anotherString) //User Name
		String str7 = new String("kathmandu");
		String str8 = new String("Kathmandu");
		int res2 = str7.compareToIgnoreCase(str8);
		System.out.println(res2);
				//==0 - Equals
				//>0 - Not Equals
				//<0 - Not Equals
				
		if (res2 == 0) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
				
		//Creating a Login App which accept user name, and password from user. If user name equals to admin and password equals to admin print 'Welcome user' else print 'user name or pasword is incorrect'
	
		//String concat(String str)
		String str9 = str7.concat(str8);
		System.out.println(str9);
		
		CharSequence csq = "The";
		boolean res3 = str4.contains(csq);
		System.out.println(res3);
		
		//boolean	equals(Object anObject)
		String str10 = "The";
		String str11 = "the";
		if(str10.equals(str11)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equals");
		}
		
		//int hashCode()		
		int h_code1 = str10.hashCode();
		int h_code2 = str11.hashCode();
		if (h_code1 == h_code2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
		//int indexOf(String str)
		//int indexOf(char ch)
		
		//int lastIndexOf(String str)
		//int lastIndexOf(char ch)
		
		String str12 = new String(" Returns the index within this string of the first occurrence of the specified character. ");
		String str13 = "the";
		int first_index = str12.indexOf(str13);
		System.out.println(first_index); //8 First Index
		int last_index = str12.lastIndexOf(str13);
		System.out.println(last_index); //64 First Index
		
		//Find sub string in string. (How many times)?
		
		// String replace(char oldChar, char newChar)
		// String[]	split(String regex)

		//String	substring(int beginIndex)
		
		System.out.println(str12.substring(0, 5));
	
		//char[]	toCharArray()
		//String	toLowerCase()
		//String	toUpperCase()
		//String	trim()
		//String	valueOf(int i)
		
		String str14 = String.valueOf(last_index);
		System.out.println(str14);
		
		
	}
}
