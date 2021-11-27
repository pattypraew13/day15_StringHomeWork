package day15_StringHomeWork;

public class ExtractLetters {

	public static void main(String[] args) {
		//Extract letters from a String 
				//Write a program to extract all the letter from a given alphanumeric string 
				//input :"a1b2c34d098098efg" 
				//output: abbdefg
		String str = "a1b2c34d098098efg";
		
		String letters = str.replaceAll("\\d", "");
		System.out.println(letters);
		
		
		for(int i=0; i<str.length();i++) {
			//System.out.println(str.charAt(i));
			
			char currentChar = str.charAt(i);
			
			//System.out.println(currentChar);
			
			int refNum = currentChar;
			//System.out.println(refNum);
		//	if(refNum<'0' || refNum > '9') {  //print between 0-9
		//		System.out.print(currentChar);
		    
			if ((refNum >= 'a' && refNum <= 'z') || (refNum >= 'A' && refNum <= 'Z')) 
            {
                System.out.print(currentChar);
		}
	}

	}
}

