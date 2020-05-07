package Selenium;

public class B extends A
{

	public void b()
	{
		System.out.println("b");
	}
	
	public  void a()
	{
		System.out.println("a-2");
	}
	
	public String test(String i)
	{
		return i;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		A a = new A();
		B b = new B();
		A a2 = new B();

		
		
		
		a2.a();
		a2.c();

	

		
	}
	

	

}
