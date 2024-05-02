package assignmentP;

 abstract class bank{
	public abstract void getbalance();
 }
 class bankA extends bank{
	 public void getbalance() {
		 System.out.println("100$ deposited in bank:");
	 }
 }
 
 class bankB extends bank{
	 public void getbalance() {
		 System.out.println("150$ deposited in bank:");
	 }
 }
 class bankC extends bank{
	 public void getbalance() {
		 System.out.println("200$ deposited in bank:");
	 }
 }

public class ABBank {

	public static void main(String[] args) {
          bankA A =new bankA();
          A.getbalance();
          bankB B =new bankB();
          B.getbalance();
          bankC C =new bankC();
          C.getbalance();



	}

}
