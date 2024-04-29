package assignmentP;
import java. util.Scanner;
public class Strletspcnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the String:");
      String str=sc.nextLine();
      
      int Number=0;
      int Letter=0;
      int Space=0;                
      int other=0;        
        char ch[]=str.toCharArray();
      for(int i=0;i<str.length();i++) {
    	  if(Character.isLetter(ch[i]))
    	  {
    		  Letter++;
    	  }
    	  else if(Character.isSpaceChar(ch[i]))
    	  {
    		  Space++;
    		  
    	  }
    	  else if(Character.isDigit(ch[i])) 
    	  {
    		  Number++;
    	  }
    	  else {
    		  other++;
    	  }
      }
      System.out.println("isLetter"+Letter);
      System.out.println("isSpace"+Space);
      System.out.println("isNumber"+Number);
      System.out.println("isother"+other);
      
	}

}
