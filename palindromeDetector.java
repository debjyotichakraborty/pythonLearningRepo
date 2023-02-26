package refresherPractice;
import java.util.*;
public class palindromeDetector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("===== Palindrome Detector =====");
			Scanner a = new Scanner(System.in);
			System.out.println("Enter string");
			String b = a.nextLine();
			char[] c = b.toCharArray();
			int d = b.length();
			int e = d - 1;
			boolean f = true;
			for (int i=0;((i<d)&&(i<=e));i++)
			{
				e=d-1-i;
				if (c[i]!=c[e])
					f = false;
			}
			System.out.println(b);
			if (f==true)
					System.out.print(" is a palindrome");
			else System.out.print(" is not a palindrome");
	}
}