package polymorphism;

public class HR extends Emp{
	 public void leaveapproval()
	 {
		 //code goes here 
	 }
	 public double getSalary()
	 {
		 return (super.getSalary());
	 }
	 public void display1()
	 {
		 System.out.println("Displaying HR Details");
	 }

}
