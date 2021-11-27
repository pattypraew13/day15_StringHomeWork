package day15_StringHomeWork;

public class FindMiddleCharacter {

	public static void main(String[] args) {
		//Write a Java program to find the middle character of a string.
				// If the length of the string is odd there will be one middle character. 
				// If the length of the string is even there will be 2 middle characters. 
				// Input: abcde 
				// output:c 
				// intput car11car 
				// output 11
		//				01234
		String input = "abcdef";
		char middleChar = ' ';
		
		System.out.println(input.length());//5
		
		if(input.length()%2==1) {
			System.out.println(input.length()/2);//2
			int middleCharIndex = input.length()/2;
			//middleChar = input.charAt(input.length()/2);
			middleChar = input.charAt(middleCharIndex);	
			
		}
		if(input.length()%2==0) {
		//	System.out.println(input.length()/2);//3
		//	System.out.println(input.charAt(input.length()/2-1));	
		//	System.out.println(input.charAt(input.length()/2));
			
		//	System.out.println(input.substring(input.length()/2-1, input.length()/2));
			
			int began = input.length()/2-1;	
				
			int end = input.length()/2+1;	
			
			System.out.println(input.substring(began, end));
			}
		
		
		
		System.out.println(middleChar);
			
			
			
	}

}
