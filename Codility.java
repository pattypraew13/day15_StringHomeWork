package day15_StringHomeWork;

public class Codility {

	public static void main(String[] args) {
		
		String str1 ="Codility";
		String str2 ="Test";
		String str3 ="Coders";
		
		
		for(int i = 1; i<31;i++) {
			
		String output ="";
			
			if(i%2 ==0) {
				//System.out.println(str1);
				output =str1;
			
			}if(i%3==0) {
				//System.out.println(str2);
				output =str2;
				
			}if(i%5==0) {
				//System.out.println(str3);
				output = str3;
			}if(i%2==0&&i%3==0){
				output = str1+str3;
			
			}if(i%2==0&&i%5==0){
				output = str2+str3;
				
			}if(i%2==0&&i%3==0&&i%5==0){
				output = str1+str2+str3;
			}
			
			if(output!="") {
				System.out.println(output);
			}else {
				System.out.println(i);
			}
			}
		
	}
		
}
	


