package refresherPractice;
import java.util.*;
public class simpleCalculatorTool {
	static int res = 0;
	public simpleCalculatorTool(int a,int b, String c, int ch) {
		switch (c)
		{
			case "+": res=a+b;break;
			case "-": res=a-b;break;
			case "*": res=a*b;break;
			case "/": res=a/b;break;
			case "%": res=a%b;break;
			case "|": res=a|b;break;
			case ">": if(a>=b) res=a; else res=b;break;
			case "<": if(a<=b) res=a; else res=b;break;
			case "==": if(a==b) res=a; else res=b;break;
			case "!=": if(a!=b) res=b;break;
			default: System.out.println("Operator out of scope");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("============ Text based calculator ===========");
		System.out.println("Select the type of operation");
		System.out.println("1 = Arithmetic e.g. +, - , *, /, %, |");
		System.out.println("2 = Relational e.g. ==, !=, >, <, >=, =< ");
		System.out.println("3 = Logical e.g. &&, ||, !");
		short ch = sc.nextShort();
		switch(ch)
		{
		case 1: 
			System.out.println("+ for summation");
			System.out.println("- for difference");
			System.out.println("* for product");
			System.out.println("/ for quotient");
			System.out.println("% for remainder");
			System.out.println("| for modulus");
			break;
		case 2:
			System.out.println("> for greater");
			System.out.println("< for smaller");
			System.out.println("== for equals");
			System.out.println("!= for not equals");
			System.out.println(">= for greater than or equals");
			System.out.println("<= for less than or equals");
			break;
		case 3:
			System.out.println("&& for AND");
			System.out.println("|| for OR");
			System.out.println("! for NOT");
			break;
		}
		String c = sc.next();
		simpleCalculatorTool calc1 = new simpleCalculatorTool(a,b,c,ch);
		System.out.println("Result = "+res);
		sc.close();
	}

}
