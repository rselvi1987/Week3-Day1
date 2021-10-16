package week3.Day1;

public class Execution {

	public static void main(String[] args) {

		Audi d= new Audi();
		d.fillfuel();
		d.shiftgear();
		d.doorclose();
		d.Acclerate();
		d.drivevechicle();
		
		BMW b = new BMW();
		
		b.Acclerate();
		b.doorclose();
		b.enableairbag();
		b.shiftgear();
	}

}
