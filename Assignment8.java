package week3.Day1;

public class Assignment8 {

	/*
	 * Write a Java program to replace a specified character with another character
	 * and add # to the given string.
	 * 
	 * String sentence = "I am working with Java8" replace 8 to 11 Print the
	 * characters from 5 to 14
	 */

	public static void main(String[] args) {
		
		String sentence = "I am working with Java8";
		String replacedsentence = sentence.replace("8","11");
		System.out.println("New Sentence is" + replacedsentence);
		String substring = sentence.substring(5, 14);
		System.out.println(substring);
		
		
	}

}
