package assignmentP;

import java.util.Scanner;

public class Valueofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=sc.nextInt();
       
        int a=0;
        int b=0;
        
        System.out.println(n);
        a=n*10+n;
        b=n*100+a;
       
         System.out.println(a);
         System.out.println(b);
         int result=n+a+b;
         System.out.println(result);
  
          
        

       }

}
