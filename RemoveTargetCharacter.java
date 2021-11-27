package day15_StringHomeWork;

public class RemoveTargetCharacter {

	public static void main(String[] args) {
		/*
         * Write an efficient program in Java to remove all occurrences of a 
         * given character in Java. For example, 
         * 
         * if the given String is "Programming" 
         * and the given character to remove is "m" then your 
         * function should return "Prograing".
         * 
         * */ 
		
		String word = "Programming";
		String targetChar = "m";
		
		String word2 = word.replace(targetChar,"");
		System.out.println(word2);
		
		
		
		
	}

}
