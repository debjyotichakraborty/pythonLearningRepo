package refresherPractice;

import java.util.*;

public class divisibilityTestOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== Divisibility test of 2 =====");
		System.out.println("Enter number");
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		short b = (short)(a%10);
		if(b==0|b==2|b==4|b==6|b==8)
			System.out.print("last digit is "+b+" so "+a+" is divisible by 2");
		else 
			System.out.print("last digit is "+b+" so "+a+" is NOT divisible by 2");
		m.close();
	}

}
