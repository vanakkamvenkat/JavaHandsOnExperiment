package helloworld;

public class SuperClass {

	int asuper = 100;
	String astring = "SuperClass";
	
	private int pria = 200;
	
	SuperClass ()
	{
		System.out.println(asuper);
		System.out.println(astring);
	}
	
	public int getpria()
	{
		return pria;
	}
	
	public void setpria(int num)
	{
		this.pria = num;
	}
}
