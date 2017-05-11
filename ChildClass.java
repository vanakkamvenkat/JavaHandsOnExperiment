package helloworld;

public class ChildClass extends SuperClass{

	int asuper = 200;
	String astring = "ChildClass";
	
	ChildClass()
	{
		int asuper = 300;
		String astring = "ChildMethodClass";
		System.out.println(asuper);
		System.out.println(astring);
		System.out.println(super.asuper);
		System.out.println(super.astring);
		System.out.println(this.asuper);
		System.out.println(this.astring);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass CC1 = new ChildClass ();
		System.out.println("Private variabe value is " + CC1.getpria());
		CC1.setpria(50);
		System.out.println("Now Private variabe value is " + CC1.getpria());
		
		
		
	}

}
