package inheritance;
class Car{
	String carname;
	int carno;
	
	public Car(String carname,int carno) {
		this.carname=carname;
		this.carno=carno;
	}
		void dis() {
		System.out.println("carname is: "+carname);
		System.out.println("car number is: "+carno);
	}
	
}
class swift extends Car{
    String carcolor;
	public swift(String carname, int carno,String carcolor) {
		super(carname, carno);
		this.carcolor=carcolor;}
	void dis2() {
		
		System.out.println("car color is: "+carcolor);
	}
}
class thar extends swift{
     int caraverage;
	public thar(String carname, int carno, String carcolor,int caraverage) {
		super(carname, carno, carcolor);
		this.caraverage=caraverage;
	}
	void dis1() {
		System.out.println(" thar average is: "+caraverage);
		
	}
	
}

public class Multilevelinheritance {
	public static void main(String[] args) {
		thar t1=new thar("Swift",4728,"black",56);
		t1.dis();
		t1.dis2();
		t1.dis1();
		
	}

}
