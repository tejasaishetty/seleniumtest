package sai;

public class Arays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is arrays ");

		int[] sub = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println(sub[0] + " array value");
		System.out.println(sub[1] + " array value");
		System.out.println(sub[2] + " array value");
		System.out.println(sub[3] + " array value");
		System.out.println(sub[4] + " array value");
		System.out.println(sub[5] + " array value");
		System.out.println(sub[6] + " array value");
		
		//float
		float ff[] = {12.2f,10.3f,00.22f,020,0202,0222};
		
		for (float fff : ff) {
			System.out.println(fff + "  saiteja \n");
			
		}
        //char
		char charArray[] = { 's','a','i','t','e','j','a'};
		
		System.out.println(charArray[2]);

		for (char b : charArray) {
			System.out.println(b + "  saiteja");
			
		}
		//int
		for (int a : sub) {
			System.out.println(a + "array loop");
			
		}
		
		for (int a : sub) {
			if (a ==60) 
				break;
			System.out.println(a + "break");
			
		}
		
		for (int a : sub) {
			if (a ==60) 
				continue;
			System.out.println(a + "continue");
		}
		//boolean 
		
		
		
		
	}

}
