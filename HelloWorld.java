package helloworld;

public class HelloWorld {

	int a;
	static int b;
	
	public void addv()
	{
		System.out.println("Ths is inside a void method without arguments ,i.e., no return");	
	}
	
	public int addi()
	{
		return 50;
	}
	
	public void addv(int a)
	{
		System.out.println("Ths is inside a void method with arguments with input" + a);
	}
	
	public int addi(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public static void main (String args[])
	
	{
		int c = 50;
		HelloWorld obj1 = new HelloWorld();
		HelloWorld obj2 = new HelloWorld();
		
		obj1.a=60;
		obj2.a=70;
		
		HelloWorld.b=80;
				
		System.out.println("The value of the local variable is " + c);
		
		System.out.println("The value of the instance variable is " + obj1.a);
		System.out.println("The value of the instance variable is " + obj2.a);
		
		System.out.println("The value of the static variable is " + HelloWorld.b);
		
		obj1.addv();
		System.out.println("The output of non-void method with no argument" + obj1.addi());
		obj1.addv(50);
		System.out.println("The output of non-void method with argument" + obj1.addi(30,40));
	}
	
}
