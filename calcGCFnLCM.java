package refresherPractice;
import java.util.*;
public class calcGCFnLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("===== Computation of LCM and GCD for two input numbers =====");
		System.out.println("Enter first number");
		int a = sc.nextInt();
		int i = 1;
		System.out.println("Enter second number");
		int b = sc1.nextInt();
		int hcf = 1; 
		int c = 0;
		if (a>=b)
			c = b;
		else
			c = a;
		for (i=1;i<=c;i++)
		{
			if ((a%i==0)&&(b%i==0))
				hcf = i;
		}
		if (hcf == 1)
			System.out.println(a+" & "+b+" are coprime numbers i.e. they don't share a divisor other than 1");
		else
			System.out.println("Greatest Common Divisor of "+a+" and "+b+" is "+hcf);
		if (a>=b)
			c = a;
		else
			c = b;
		boolean d = false;
		do
		{
			if ((c%a==0)&&(c%b==0))
				d = true;
			else
				c++;
		} while (d==false);
		System.out.println("Lowest Common Multiple of "+a+" and "+b+" is "+c);
	}
}