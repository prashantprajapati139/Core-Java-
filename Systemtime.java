package assignmentP;

import java.time.LocalTime;
import java.util.Date;

public class Systemtime {

	public static void main(String[] args) {
           LocalTime currentTime = LocalTime.now();
		        
		    Date d=new Date ();
		    System.out.println("date:-"+d);
		    
		  System.out.println("Current System Time: " +currentTime);
		    }

	}


