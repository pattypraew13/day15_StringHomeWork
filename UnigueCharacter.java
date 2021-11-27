package day15_StringHomeWork;

public class UnigueCharacter {

	public static void main(String[] args) {
	
		//Write a program to find distinct character from a string
	       // String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
	        //String expectedStr = "abc";
		String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
		
		String expectedStr = "abc";
		
		String unique = "";
		
		for(int i = 0; i< str.length();i++) {
			
			char currentChar = str.charAt(i);
			
			String s = String.valueOf(currentChar); //convert char to string
			
			if(!unique.contains(s)) {
				unique = unique+s;
			}
			
			
			
		}
		System.out.println(unique);
	//	System.out.println(unique.contains("a"));//false
		
	//	unique = unique+"a";
		
	//	System.out.println(unique.contains("a"));//true
		
	}

}
