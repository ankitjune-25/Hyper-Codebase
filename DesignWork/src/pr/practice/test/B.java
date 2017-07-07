package pr.practice.test;

public class B{

	public String b;
	
	public A a = new A();
	
	public B() {
		System.out.println("B contructor.");
	}
	
	public void printB()
	{
		System.out.println("Print B.");
	}
	
	public void printA()
	{
		System.out.println("Print A from B.");
	}
}
