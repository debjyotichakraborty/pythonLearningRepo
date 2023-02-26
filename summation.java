package refresherPractice;

import java.util.Scanner;

class summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char stopR='N';
		int sum=0, nxtInt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("==================Summation Logic====================");
		System.out.println("keep entering numbers you need summation of, enter non-numeric to end summation");
		do {
			try {
					nxtInt = sc.nextInt();
					sum+=nxtInt;
		        }
			catch (Exception x) {
				stopR='Y';
			}
			
		} while (stopR=='N');
		System.out.println("summation = "+sum);
		sc.close();
	}
}