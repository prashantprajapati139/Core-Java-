package assignmentP;

import java.util.Scanner;

public class Numberofcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		sc.close();
		
		  int count=0;
		 while(n>0) {
			 int rem=n%10;
			     n=n/10;
		     	 count++;
			 
		 }
		 System.out.println("number of digit:"+count);
		
		

	}

}
