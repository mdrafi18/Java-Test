package Sample;

public class AbstractionExample {
	public static void main (String[] args) {
//		Bike honda = new Bike();
		Bike hondaNew = new HondaUnicorn();
		System.out.println(hondaNew.getMillege());
		hondaNew.run();
	}
}

abstract class Bike {
	abstract void run();
	public String getMillege() {
		return "50 kmpl";
	}
}

class HondaUnicorn extends Bike{
	public void run() {
		System.out.println("Honda Unicorn is running");
	}
	public String getMillege() {
		return "70 kmpl";
	}
}

