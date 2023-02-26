package refresherPractice;
import java.util.*;
import java.math.*;

public class julToGreg {

	static int julValidate (String julDateX) {
		// TODO Auto-generated constructor stub
		if (julDateX.length() != 7)
		{
			System.out.println("Invalid date length");
			return 9999997;
		}
		int julDateNum = Integer.parseInt(julDateX);
		int julCCYY = julDateNum / 1000;
		int julDDD = julDateNum % 1000;
		if ((( julCCYY % 4) == 0 ) && ( julCCYY % 100 != 0 ))
		{
			if (julDDD > 366)
				{
					System.out.println("invalid day of year");
					return 9999998;
				}
			else
				System.out.println("this is a leap year");
		}
		else
		{
			if (julDDD > 365)
				{
					System.out.println("invalid day of year");
					return 9999999;
				}
			else
			System.out.println("this is NOT a leap year");
		}
		return julDateNum;
	}
	
	static int convJulToGreg (int julDate) {
		// TODO Auto-generated constructor stub
		System.out.println("input date "+julDate+" is valid");
		int julCCYY = julDate / 1000,
		    julDDD = julDate % 1000,
		    julMM = 0,
		    julDD = julDDD,
		    daysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if ( julCCYY % 4 == 0 )
			{
			if ( julCCYY % 100 != 0 )
				daysInMonth[1] += 1;
			}
		for(int i=0;((i<12)&&(julDD>daysInMonth[i]));i++)
		{
			julMM=i+1;
			julDD-= daysInMonth[i];
		}
		return ((julCCYY*10000)+(julMM*100)+julDD);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Julian Date");
		Scanner sc = new Scanner(System.in);
		String julDateX = sc.nextLine();
		int julianDate = julValidate(julDateX);
		if (julianDate%1000 > 366)
			System.out.println("Please try running again and enter correct date");
		else
		{
			int ccYYmmDD = convJulToGreg(julianDate);
			System.out.println("Gregorian CCYYMMDD format date is "+ccYYmmDD);
		}
	}
	
}
