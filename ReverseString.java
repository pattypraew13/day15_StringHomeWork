package day15_StringHomeWork;

public class ReverseString {

	public static void main(String[] args) {
		 // Write a program to reverse a string
//      input = ABCD
//      output = DCBA```
					//  012
		String input = "ABC";
		
		String output ="CBA";
		
		String reverseStr ="";
		
		System.out.print(input.charAt(2));
		System.out.print(input.charAt(1));
		System.out.println(input.charAt(0));
		
		
		System.out.println(input.length());
		
		System.out.println(input.charAt(input.length()-1));
		
		for(int i=input.length()-1;i>=0;i--) { //same int i=2;i>=0;i--
			//System.out.println(i);
			System.out.print(input.charAt(i));
			String singleLetter =String.valueOf(input.charAt(i));
		//	reverseStr += singleLetter;
			reverseStr = reverseStr+singleLetter;
			
		}
		
		int num =123;
		String str= String.valueOf(num);
		System.out.println(str.length());//3
		
		char a = input.charAt(0);
		System.out.println(a); //A
		
		String str2 =String.valueOf(a);
		
		System.out.println(str2);//A
		
		
		System.out.println(reverseStr);
		
		if(input.equals(reverseStr)) {
			System.out.println("Is Palindrom");
		}
		if(output.equals(reverseStr)) {
			System.out.println("You revered the original string");
			
		}
		
		
	}

}
