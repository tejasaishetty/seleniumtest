package sai;

public class Onestedif {
	int b = 20; // instance var
	static int empid = 101;

//Non-Static
	public void m1() {
//  DT  Var  VV------To Represent Data
		int a = 10; // Local var
		System.out.println("m1 executed");
//                int  string
		System.out.println(a + " LocalVar"); // 10
		System.out.println(empid + " static var");
	}

	public void m2() {
		System.out.println("m2 executed");
		System.out.println(b + " instance var");
	}

	public void m3() {
		System.out.println("m3 executed");
		System.out.println(b + " instance var");
	}

//staic methods
	public static void st() {
		System.out.println("static method executed");
	}

	public static void main(String args[]) {
		System.out.println("main method executed");
//Non-Static : access by using object
		Onestedif m = new Onestedif();
		m.m1();
		m.m2();
		m.m3();
//static methods: access by using classname,no need of to create object
		Onestedif.st();

	}
}