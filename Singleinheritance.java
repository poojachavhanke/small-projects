package inheritance;
class Animal{
	String Aname;
	public Animal(String Aname) {
	this.Aname=Aname;
	System.out.println("This is Animal: "+Aname);
	}
}
class Tiger extends Animal{
	String Acolor;

	public Tiger() {
		super("default name");
		
	}

	public Tiger(String Aname, String Acolor) {
		super(Aname);
		this.Acolor= Acolor;
		System.out.println("Tiger color is: "+Acolor);
	}
	
}
public class Singleinheritance {
public static void main(String[] args) {
	Tiger t1=new Tiger("Tiger","brown");
	
}
}
