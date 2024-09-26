package polymorphism;

public class AbstractTest {
	public static void main(String[] args) {
		//RBI obj=new RBI(); Error
		/*
		 * AXISBank axis=new AXISBank(); axis.calculateInterest();
		 */
		RBI obj=new AXISBank();
		obj.calculateInterest();
	}

}
