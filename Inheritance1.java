package inheritance;
class car{
	void display() {
		System.out.println("I am car");
	}
}
class bolero extends car{
	void display1() {
		System.out.println("I am Bolero");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
	 bolero b1=new bolero();
		b1.display();
		b1.display1();
		
	}

}
