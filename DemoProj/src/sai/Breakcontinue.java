package sai;

public class Breakcontinue {

	public static void main(String[] args) {

		// break
		for (int i = 0; i <= 10; i++) {

			System.out.println(i + " for loop");
		}
		// break
		for (int j = 0; j <= 10; j++) {
			if (j == 5)
				break;
			System.out.println(j + "hello break");
		}
		// continue
		for (int k = 0; k <= 10; k++) {
			if (k == 5)
				continue;
			System.out.println(k + " hello continue");
		}

	}

}
