package polymorphism;

public class MethodOverloading {
	int num1=10, num2=20;
	
	void sum()
	{
		System.out.println(num1+ num2);
		
	}
	int sum(int a)
	{
		System.out.println(++a);
		return 0;
	}
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum(12,9);
	}

}
