package refresherPractice;

import java.util.Scanner;

public class caesarCipher {
	public static final char x[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static short offset = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************ Caesar cipher calculator *************");
		System.out.println("***************************************************");
		System.out.println("Enter cryptographic function \n 1 for encryption and \n 2 for decryption\n");
		Scanner a = new Scanner(System.in);
		short cryptFunc = a.nextShort();
		if (cryptFunc == 1)
			encryption();
		else if (cryptFunc == 2)
			decryption();
		else 
		{
			System.out.println("wrong choice, exiting program");
		}
		a.close();
	}
	
	static void encryption() {
		String cipherText = "";
		Scanner encScan = new Scanner(System.in);
		System.out.println("Enter caesar cipher offset, \n Note: offset > 25 will be truncated to units digit");
		int offset = encScan.nextInt();
		if (offset < 0) offset = offset + 25;
		if (offset > 25) offset = offset % 10;
		System.out.println("Enter plain text to be encrypted");
		encScan = new Scanner(System.in);
		String plainText = encScan.nextLine();		
		int plainTextLen = plainText.length();
		plainText = plainText.toUpperCase();
		for (int i=0;i<plainTextLen;i++) {
			  for (int j=0;j<x.length;j++) {
				  if ( (plainText.charAt(i) == x[j]) && (plainText.charAt(i) != ' ')) {
					  if (j+offset >= 25)
						  cipherText = cipherText + x[j+offset-25];
					  else
						  cipherText = cipherText + x[j+offset];
					  j = x.length;
				  }
				  else 
					  { 
					  	if (plainText.charAt(i) == ' ') 
					  		{
					  			cipherText = cipherText + plainText.charAt(i);
					  			j = x.length;
					  		}
					  }
			  }
		}	  	
		System.out.println("output cipher text : "+cipherText);
		encScan.close();
	}

	static void decryption() {
		String plainText = "";
		Scanner decScan = new Scanner(System.in);
		System.out.println("Enter caesar cipher offset, \n Note: offset greater than 25 will be truncated to units digit\n");
		int offset = decScan.nextInt();
		offset = 25 - offset;
		if (offset < 0) offset = offset + 25;
		if (offset > 25) offset = offset % 10;
		System.out.println("Enter caesar cipher text to be decrypted");
		decScan = new Scanner(System.in);
		String cipherText = decScan.nextLine();
		int cipherTextLen = cipherText.length();
		cipherText = cipherText.toUpperCase();
		for (int i=0;i<cipherTextLen;i++) {
			  for (int j=0;j<x.length;j++) {
				  if ( (cipherText.charAt(i) == x[j]) && (cipherText.charAt(i) != ' ')) {
					  if (j+offset >= 25)
						  plainText = plainText + x[j+offset-25];
					  else
						  plainText = plainText + x[j+offset];
					  j = x.length;
				  }
				  else 
					  { 
					  	if (cipherText.charAt(i) == ' ') 
					  		{
					  			plainText = plainText + cipherText.charAt(i);
					  			j = x.length;
					  		}
					  }
			  }
		}	  	
		System.out.println("output plain text : "+plainText);
		decScan.close();
	}
}
