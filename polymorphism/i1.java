package polymorphism;

public interface i1 {
	double limit=1000;//public and constant 
	void getBalance(); // public and abstract

	void getROI();
}

interface i3 extends i1 {
	void checkCibilScore();
}