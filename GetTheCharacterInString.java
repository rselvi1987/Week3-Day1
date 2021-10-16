package week3.Day1;

public class GetTheCharacterInString {

	public static void main(String[] args) {

	/*1. Write a Java program to get the character at the given index within the String. 
String text = Java Exercise 
  Index for character E and s   */
		
		String text = "Java Exercise";
		int i = text.indexOf('E');
		int j = text.indexOf('s');
		System.out.println("Index of E is"+i);
		System.out.println("Index of s is"+j);
		
	}

}
