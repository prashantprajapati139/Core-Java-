package assignmentP;

class Triangle{
	 int a,b,c;
	
	public Triangle() {
		a=3;
		b=4;
		c=5;
	}
	    public void areaT() {
	    	double result= 0.5*a*b;
	    	System.out.println("Area of Triangle:-"+result);
	    }
}
class perimiter extends Triangle{
	
	public void perimiterT() {
		
		int answer=a+b+c;
		System.out.println("perimiter of Triangle:-"+answer);
	}
}


public class Constructor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		t.areaT();
		perimiter p=new perimiter();
		p.perimiterT();
	}

}
