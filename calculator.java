package refresherPractice;

import java.util.*;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    	Scanner sc = new Scanner(System.in);
		        int a=0;
		        int b=0;
		        int c=0;
		        System.out.println("Enter first number");
		        
		        a=sc.nextInt();
		        System.out.println("Enter operand");
		        c=sc.nextInt();
		        System.out.println("Enter second number");
		        b=sc.nextInt();
		        sc.close();
		        int d=0;
		        //d=result
		        switch (c)
		        {
		        case 1:
		        	d = a+b; break;
		        case 2:
		        	d = a-b; break;
		        case 3:
		        	d = a*b; break;
		        case 4:
		        	d = a/b; break;
		        default:
		        	System.out.println("Unacceptable");
		        }
		        System.out.println("result = "+d);
		        

	}

}
