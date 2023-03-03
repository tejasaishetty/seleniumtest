package sai;

public class Ssum {
	static int a = 10;

	public void m1() {
		System.out.println("method 1 executed");
		System.out.println(a + "\n static variable \n" + a);
	}

	public void m2() {
		int b = 20;
		System.out.println("method 2 executed");
		System.out.println(b);

	}

	public static void main(String[] args) {
		System.out.println("main method executed ");
		Ssum m = new Ssum();
		m.m1();
		m.m2();
	}

}
