package refresherPractice;
import java.util.*;
public class fibonacciGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long a = 0;
			long b = 1;
			long c = a + b;
			int lim = 0;
			System.out.println("===== FIBONACCI SERIES GENERATOR =====");
			System.out.println("how many fibonacci numbers do you wish to display?");
			Scanner limSc = new Scanner(System.in);
			lim = limSc.nextInt() - 1;
			System.out.println("what is the nearest number you wish to start with?");
			Scanner startNbr = new Scanner(System.in);
			long startNbrVal = startNbr.nextLong(); 
			do
			{
			    if ((startNbrVal >= a) && (startNbrVal <= b))
			    {
			      startNbrVal=a;
			    }
			    else
			    {
			    	a = b;
					b = c;
					c = a + b;
			    }
			} while (startNbrVal != a);
			System.out.print(startNbrVal);
			for (int i=0;i<lim;i++)
			{
				System.out.print(","+b);
				a = b;
				b = c;
				c = a + b;
			}
			limSc.close();
			startNbr.close();
	}
}