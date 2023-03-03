package sai;

class Car {
	static int a = 10;

	public void aa() {
		System.out.println("this is car class");
		System.out.println(a);
	}
}

class Bike extends Car {
	static int b = 20;

	public void bb() {
		System.out.println("this is bike class");
		System.out.println(b);
	}
}

class Train extends Bike {
	static int c = 30;

	public void cc() {
		System.out.println("this train class");
		System.out.println(c);
	}
}

public class Vechile extends Train {
	public static void main(String args[]) {
		int d = 50;
		int e = 60;
		Vechile n = new Vechile();
		n.aa();
		n.bb();
		n.cc();
		System.out.println("d value"+d);
		System.out.println("e value "+e);
		System.out.println("addition"+(a + b));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}