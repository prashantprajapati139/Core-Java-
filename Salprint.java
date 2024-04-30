package assignmentP;


public class Salprint {
	
	 int Datamembers;
     String name;
     int Age;
     int phonenumbar;
     String Address;
     int Salary;
     
     public void printSalary(int x) 
     {
  	   System.out.println("member of salary:-"+x);
     }
	
	
  public static void main(String[] args) {
		Salprint f = new Salprint();
		f.printSalary(50000);
      
	}

}
