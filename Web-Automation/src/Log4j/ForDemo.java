package Log4j;

import org.apache.log4j.Logger;

public class ForDemo {
	public static Logger log=Logger.getLogger("Automation...");
	public static void main(String[] args) {
		log.info("The For Loop Output Starts here...");
		for(int i=20;i<=50;i++)
		{
			if(i%2==0)
			{
				log.info("Even Number :"+i);
			}
		}
		log.info("The For Loop Output Ends here...");

	}

}
