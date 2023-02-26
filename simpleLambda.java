	package refresherPractice;

	public class simpleLambda
		{
		  public static void main(String[] args) 
			  {
			    HelloWorldMod a = b -> "Hello "+b;
			    lambdaTestPrime("world",a);
			  }
	
		  public static void lambdaTestPrime(String c, HelloWorldMod d)
			  {
			      System.out.println(d.lambdaTestPrime(c));
			  }
		}