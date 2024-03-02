package assignmentP;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		int Average=0;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  five number:");
		
		
			for(int i=1;i<=5;i++) {
			int n=sc.nextInt();
			sum=sum+n;
			
		}
	 
       System.out.println("result of number="+sum);
       Average=sum/5;
       System.out.println("result of average="+Average);
       sc.close();
       
       
	}

}
