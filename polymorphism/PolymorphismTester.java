package polymorphism;

public class PolymorphismTester {
	public static void main(String[] args) {
		/*
		 * Manager m=new Manager(); System.out.println(m.getSalary()); HR hr=new HR();
		 * System.out.println(m.getSalary());
		 */
		Emp emp=new Manager();//upcasting--dynamic Polymorphism
		System.out.println(emp.getSalary());
		emp=new HR();
		emp.display();
		
		HR obj=(HR)emp;//downcasting
		obj.display1();
		
		
		
		
	}

}
