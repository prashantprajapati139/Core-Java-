package assignmentP;

public class Areasqure {

	public void area(int s) {
		int square= s*s;
		System.out.println("area of square:-"+square);
		
	}
	public void area(int l,int b) {
		int rectangle = l*b;
		
		System.out.println("area of rectangle:-"+rectangle);
	}
	
	public static void main(String[] args) {
		Areasqure t=new Areasqure();
		t.area(4);
		t.area(16,5);

	}

}
