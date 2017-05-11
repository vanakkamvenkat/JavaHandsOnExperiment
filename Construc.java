package helloworld;

public class Construc {
	
	Construc ()
	{
		System.out.println("Hello");
	}

	Construc (int a)
	{
		System.out.println("Integer is " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Construc C1 = new Construc();
		Construc C2 = new Construc (60);	
		
	}

}
