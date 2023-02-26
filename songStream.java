package refresherPractice;
import java.util.*;

public class songStream {
	  public static void main(String[] args)
	  {
	    List<String> songTitles = Arrays.asList("humble","element","dna");
	    System.out.println("List:\n"+songTitles);
	    songTitles.stream();
	    System.out.println("Stream:\n"+songTitles);
	    songTitles.stream().map(str -> str.toUpperCase());
	    System.out.println("MAP:\n"+songTitles);
		songTitles.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
	   }
}
