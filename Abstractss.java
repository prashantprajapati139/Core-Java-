package assignmentP;


abstract class parents{
	abstract void A();
		
}
class firstsub extends parents{
	public void A () {
		System.out.println("This is first: ");
	}
}
class Second extends parents{
	public void A() {
		System.out.println("This is Second:");
	}
}

public class Abstractss {
	
	public static void main(String[] args) {
	 firstsub t = new firstsub();
	 t.A();
	 Second s =new Second();
	 s.A();
	}

}
