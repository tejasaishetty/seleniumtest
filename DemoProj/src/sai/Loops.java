package sai;

public class Loops {

	public static void m() {
		// loops
		// while
		int a = 1;
		while (a <= 10) {
			System.out.println(a + "  while loop hello");
			a++;
		}

		// do while
		int b = 11;
		do {
			System.out.println(b + "  dowhile loop hi");
			b++;
		} while (b <= 20);

		// for loop
		for (int i = 21; i <= 30; i++) {
			System.out.println(i + "  for loop welcome");
		}
	}

	public static void a() {
		System.out.println("static method");
	}

	public static void main(String args[]) {
		// Loops k = new Loops();
		// k.m();
		Loops.m();
		Loops.a();
	}
}
