package sirclass;

public class operators {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		// Arithemetic
		System.out.println("add ="+(a+b));
		System.out.println("sub ="+(a-b));
		System.out.println("mul ="+(a*b));
		System.out.println("div ="+(a/b));
		// Relational
		System.out.println("6==6 ?"+(6==6));
		System.out.println("6==6 ?"+(6!=6));
		System.out.println("4>5 ?"+(4>5));
		System.out.println("4<5 ?"+(4<5));
		// increment and decrement
		int z=5;
		z++; //z=z+1
		System.out.println("z++="+z);
		int c=30;
		c+=40;
		System.out.println("c+=40="+(c));
		double d=24.5;
		d-=11.5;
		System.out.println("d-=11.5="+(d));
		double shareprice=10;
		shareprice*=300;// shareprice=shareprice*300;
		System.out.println("current shareprice today="+shareprice+"^");
		
		shareprice=10;
		shareprice*=50;
		System.out.println("current shareprice today="+shareprice+"v");
		
		


	}

}
