package week3.Day1;

public class Assignment7 {

	/*
	 * 2.Write a Java program to compare a given string to another string, ignoring
	 * case considerations.
	 * 
	 * String 1="I am Learning Java" String 2="I am learning java? Explore with ==
	 * operator equals equalsignorecase
	 */

	public static void main(String[] args) {
		String string1 = "I am Learning Java";
		String string2 = "I am learning java";
		
		if(string1.equalsIgnoreCase(string2)) {
			System.out.println("Text matches");
		} else {
			System.out.println("Text differs");
			
		}
		
		
	}

}
