package helloworld;

public class EncapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] three = {0,1,2};
		int a = 1, b = 0;
		
		try
		{
			for (int i = 0; i<=three.length; i++)
			{
				System.out.println(three[i]);	
			}
		}
		catch (Exception e)
		{
			System.out.println("Array out of bounds error");
		}
		
		
		
	}

}
