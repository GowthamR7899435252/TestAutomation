package TestScripts;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreatingHTMLfile {

	public static void main(String[] args)
	{
     creatingHTMLfile();
	}

	private static void creatingHTMLfile()
	{
		BufferedWriter bw=null;
		try
		{
			
		bw=new BufferedWriter(new FileWriter("D:\\ExampleAutomation\\Test123.html"));
		
		bw.write("<html>");
		bw.write("<head><title>TEST WEB PAGE </head></title>");
		bw.write("<body>");
		bw.write("<h1 align center>SERIOUS INFORMATION</h1>");
		bw.write("<p>GOWTHAM IS INNOCENT GOOD BOY</p>");
		bw.write("<p>PRIYANKA IS MONKEY</p>");
		bw.write("<p>she is not alowing me to perfrom POOCHIE</p>");
		bw.write("</body>");
		bw.write("</html>");	
		System.out.println("Html file is created ");
			
			
		}catch(Exception e)
		   {
			e.printStackTrace();
		   }
		
	finally
	{
		try
	      {
		    bw.flush();
		    bw.close();
          }catch(Exception e)
	         {
		       e.printStackTrace();
	         }
	}
  }
}
