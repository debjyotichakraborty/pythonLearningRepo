package refresherPractice;
import java.util.*;
class simpleConstructor1{
simpleConstructor1(int maxSpeed,String bikeName)
{
System.out.println("Bike is created");
if (maxSpeed > 180)
  fastBike=true;
}

simpleConstructor1(boolean bikeCat){
	if (bikeCat) 
       System.out.println("this bike is fast"); 
	else
       System.out.println("this bike is slow");
}

boolean fastBike = false;

public static void main(String args[]){
System.out.println("Enter bike velocity");
Scanner sc = new Scanner(System.in);
int maxVelocity = sc.nextInt();
System.out.println("Enter bike name");
sc = new Scanner(System.in);
String bikeNomenclature = sc.nextLine();
simpleConstructor1 a=new simpleConstructor1 (maxVelocity,bikeNomenclature);
sc.close();
simpleConstructor1 b=new simpleConstructor1 (a.fastBike);
}
}