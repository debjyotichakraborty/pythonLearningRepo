package refresherPractice;
import java.util.*;
public class divisibilityTest {
// USING CONSTRUCTOR
	public divisibilityTest(long a, long b) {
		// TODO Auto-generated constructor stub
		if ((a>b)&&(a%b==0))
		{
			System.out.println(a+" is divisible by "+b);
		}
		else
			if ((a<b)&&(b%a==0))
				{
					System.out.println(b+" is divisible by "+a);			
				}
			else
				System.out.println("divisibility failed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		long a = sc.nextLong();
		System.out.println("Enter 2nd number");
		long b = sc.nextLong();
		divisibilityTest obj1 = new divisibilityTest(a,b);
	}

}
