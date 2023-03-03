package sai;

public class Ooperators {

	public void m1()
	// Arithmetic operation
	{
		int a = 10, b = 20, c, d, e, f, g;
		c = a + b;
		d = a - b;
		e = a * b;
		f = b / a;
		g = a % b;
		System.out.println(c + "  addition");
		System.out.println(d + "  subtraction");
		System.out.println(e + "  multilication");
		System.out.println(f + "  divison");
		System.out.println(g + "  modulus");
	}

	public void m2()
	// relational operation
	{
		int a = 10, b = 20;

		System.out.println((a == b) + "   equal");
		System.out.println((a != b) + "  notequal");
		System.out.println((a > b) + "   greaterthan");
		System.out.println((a < b) + "   lessthan");
		System.out.println((a >= b) + "  greaterequal");
		System.out.println((a <= b) + "  lessequal");
	}

	public void m3()
	// assign operation
	{
		int a = 10, c = 0, d = 10, e = 10, f = 10, i = 10, h = 10;

		System.out.println(c + "  value of c");
		System.out.println((c = a) + "  assign ");
		System.out.println((d += a) + "  +assign ");
		System.out.println((e -= a) + "  -assign ");
		System.out.println((f *= a) + "  *assign ");
		System.out.println((i /= a) + "  /assign ");
		System.out.println((h %= a) + "  %assign ");
	}

	/*
	 * AND Operator ( && ) – if( a && b ) [if true execute else don’t] OR Operator (
	 * || ) – if( a || b) [if one of them is true execute else don’t] NOT Operator (
	 * ! ) – !(a<b) [returns false if a is smaller than b]
	 */
	public void m4()
	// logical operation
	{
		int a = 10, b = 10, c = 10;
		if (a == b && b == c) {
			System.out.println("all are equal logical and ");
		}
		if (a == b || b == c) {
			System.out.println("all are equal logical or");
		}
		if (!(a < b)) {
			System.out.println("all are equal logical not");
		}

	}

	public static void main(String args[]) {
		System.out.println("results are");
		Ooperators x = new Ooperators();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
	}
}
