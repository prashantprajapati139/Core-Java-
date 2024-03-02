package assignmentP;

import java.util.Scanner;

public class Checkchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner (System.in);
		System.out.println("enter charachter :");
		char ch = Sc.next().trim().charAt(0); 
		  Sc.close();

		if(ch >= 'a' && ch <= 'z'  ) {
			System.out.println("Vowel");
		}
		 else if ( ch >= 'A' && ch <= 'Z'  ){
			System.out.println("consonant");
			
			
		}
		 else {
			 System.out.println("Special");
		 }
	

	}

}
