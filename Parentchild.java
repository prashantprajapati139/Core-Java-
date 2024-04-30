package assignmentP;

class parent {
	public void print() {
		System.out.println("This is a parent class");
	}
}
class child extends  parent{
	public void prints() {
		System.out.println("This is child class");
	}
}

public class Parentchild {
 
  public static void main(String[] args) {
          parent t = new parent();
          child  s = new child();

          
          t.print();
          s.prints();
          s.print();
	}

}
