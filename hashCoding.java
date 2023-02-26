package refresherPractice;
import java.util.*;

public class hashCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string for hashing");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String i = new Integer("s");
        //Returned hash code value for this object 
        int hashValue = s.hashCode();
        System.out.println("Hash code Value for object is: " + hashValue);
        sc.close();
	}
}