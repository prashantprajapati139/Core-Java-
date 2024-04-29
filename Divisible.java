package assignmentP;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
         System.out.println("Number is divided by 3:");
         for( i=1;i<=100;i++) {
        	 if(i%3==0) {
        		 System.out.print(i+" ");
        	 }
         }
         System.out.println();
         System.out.println("Number is divided by 5:");
         for(j=1;j<=100;j++) {
        	 if(j%5==0) {
        		 System.out.print(j+" ");
        	 }
         }
         System.out.println();
         System.out.println("Number is divided by both");
         for(int p=1;p<=100;p++) {
        	 if(p%3==0&&p%5==0) {
        		 System.out.print(p+" " );
        		
        	 }
         }
	}

}
