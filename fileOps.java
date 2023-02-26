package refresherPractice;
import java.io.*; 
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fileOps {
	
	  static boolean fileNotGenerated = true;
	  static Pattern p;
	  static Matcher m;
	  static Scanner s = new Scanner(System.in);
	  static String folderName = "C:\\Users\\DEBJYCHA\\OneDrive - Capgemini\\Documents\\Debjyoti Java Workspace\\refresherPractice\\Test";
	  static String fileName = folderName+"\\fileOpsTester.txt";
	  
	  public static void folderOps() 
	  {
    	  File myDir = new File(folderName);
	      if (myDir.mkdir())  
	    	  	System.out.println("Folder created");  
	      else  
	    	  System.out.println("Directory: " + myDir.getName());
	  }
	  
	  public static void fileCreator()
	  {
		  System.out.println("Enter safeword for ending file entry");
		  p = Pattern.compile(s.nextLine(), Pattern.CASE_INSENSITIVE);
		  System.out.println("\n\n");
		  do {
			    try 
				    {  
				      File f = new File(fileName);
				      if (f.createNewFile())  
					      {
					    	  fileNotGenerated = false;
					      }  
				      else  
					      {
			    	        System.out.println("File name: " + f.getName());
			    	        System.out.println("Absolute path: " + f.getAbsolutePath());
			    	        System.out.println("Writeable: " + f.canWrite());
			    	        System.out.println("Readable " + f.canRead());
			    	        System.out.println("File size in bytes " + f.length());
				    	  	f.delete();
					      }
				    } 
			    
			    catch (IOException e) 
			    	{
				      System.out.println("An error occurred.");
				      e.printStackTrace(); 
				      fileNotGenerated = false;
				    }
		  } while (fileNotGenerated);
	  }
	  
	  public static void fileBuild() 
	  {
		    try 
		      {
		        FileWriter w = new FileWriter(fileName);
		        System.out.println("start file data entry");
		        boolean b = true;
		        do 
		        {
			        String x = s.nextLine();
			        m = p.matcher(x);
			        b = !(m.find());
			        if (b)
			        	w.write(x);
			        
		        }
		        while (b);
		        s.close();
		        w.close();
		        System.out.println("\n\nSuccessfully wrote to the file.\n\n");
		      } 
	    catch (IOException e) 
		    	{
			        System.out.println("An error occurred.");
			        e.printStackTrace();
		    	}
		  
	  }

	  public static void fileRead()
	  {		  
		    try 
				    {
				        File f = new File(fileName);
				        Scanner r = new Scanner(f);
				        System.out.println("file content:");
				        while (r.hasNextLine()) 
				        		{
						          String a = r.nextLine();
						          System.out.println(a);
				        		}
		                r.close();
				    }
		        catch (FileNotFoundException e) 
				      {
				        System.out.println("An error occurred.");
				        e.printStackTrace();
				      }  
		  
	  }
	  
	  public static void main(String[] args) 
	  {  
		  short choice = 0;
		  System.out.println("\n\n***********File build & test utility*************\n\n");
		  System.out.println("Choose an operation\n");
		  System.out.println("1.New or Replace file\n");
		  System.out.println("2.add records\n");
		  System.out.println("3.Read file\n");
		  Scanner b = new Scanner(System.in);
		  boolean a = true;
		  do
		  {
			try 
			{
				choice = b.nextShort();
				if (choice<1||choice>3) 
					throw new ArithmeticException("\nEnter 1 // 2 // 3 only");
				else
					a = false;
			}
			catch (ArithmeticException e) 
			{
				System.out.println("\nEnter 1 // 2 // 3 only");
			}
		  } while (a);
		  b.close();
		  folderOps();
		  switch (choice) 
		  {
			  case 1:
					  {
						  fileCreator();
						  fileBuild();
						  break;
					  }
			  case 2: 
			  {
				  fileBuild();
				  break;
			  }
			  case 3:
			  {
				  fileRead();
				  break;
			  }
		  }
	  }
}