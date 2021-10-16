package week3.Day1;

public class Students4Assignment {
	
	private static Students4Assignment obj;

	public void getstudentsinfo(int id) {

		System.out.println("Student ID is"+ id);
	}
	
	public void getstudentsinfo(int id,String name) {
		System.out.println ("Student ID is"+ id + "Student name is"+ name);
	}

	public void getstudentsinfo(int id,String name,long phonenumber) {
		System.out.println ("Student ID is"+ id + "Student name is"+ name + "Student phone number is"+ phonenumber);
	}
	
	public static void main(String[] args) {
		
		Students4Assignment.obj = new Students4Assignment();
		obj.getstudentsinfo(12);
		obj.getstudentsinfo(12,"Vidhya");
		obj.getstudentsinfo(12, "Vidhya", 7878779810L);
		
		
		
	}
}
