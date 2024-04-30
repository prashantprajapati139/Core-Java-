package assignmentP;

public class Charparameters {
	
	
	public void Print(int n,char c) {
		System.out.println(n+" "+c);
	}
	public void Print(char c, int n) {
		System.out.println(c+" "+n);
	}

	public static void main(String[] args) {
		
      Charparameters n = new Charparameters();
      n.Print(10,'P');
      n.Print('P', 10);

	}

}
