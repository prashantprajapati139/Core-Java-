package assignmentP;

class Rectangles{
	 int length;
	 int breadth;
	 public Rectangles(int length,int breadth) {
		 this.length = length;
		 this.breadth = breadth;
	 }
	 
	 public void printarea() {
		 int area = length*breadth;
		 System.out.println("The area of rectangle:-"+area);
	 }
	 public void printperimeter() {
		 int  perimeter = 2*(length+breadth);
		 System.out.println("The perimeter of reactangle:-"+perimeter);
			 	
	 }
	  
 }
class Square extends Rectangles{
	  Square(int s) {
		 super(s,s);
		 int square=s*s;
		 System.out.println(square);
	 }
	 
}
public class Rectangless {

	public static void main(String[] args) {
		
		Rectangles f = new Rectangles(52, 20);
		f.printarea();
		f.printperimeter();
		Square s=new Square(20);         
		
		

	}

}
