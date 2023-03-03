package sai;

import java.util.Scanner;

public class OSwitchh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this switch program");
		System.out.println("enter the choice ");
		System.out.println("1.Add \n" + "2.Sub \n" + "3.Mul \n" + "4.Div \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1,7:
			System.out.println("your ans:" + (a + b));
			break;
		case 2:
			System.out.println("your ans:" + (a - b));
			break;
		case 3:
			System.out.println("your ans:" + (a * b));
			break;
		case 55:
			System.out.println("your ans:" + (a + b));
			break;
		case 4:
			System.out.println("your ans:" + (a / b));
			break;
		default:
			System.out.println("invalid choice");
		}

	}

}
