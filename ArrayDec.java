package helloworld;

public class ArrayDec {
	
	public static void main (String args[])
	{
		String a [];
		a = new String[4];
		a[0]="Bahubali";
		a[1]="2";
		a[2]=":";
		a[3]="The";
				
		int b [] = new int[2];
		b[0]=1;
		b[1]=0;
		
		char c []={'B','A','H','U','B','A','L','I'};
		
		int i=0;
		while (i<=3) 
			{
			System.out.println(a[i]);
			i++;
			}
		
		int j=0;
		
		do
		{
			System.out.println(b[j]);
			j++;
		}while (j<=1);
		
		for (int k=0;k<=7;k++)
		{
			System.out.println(c[k]);
		}
			
		
	}
	
  
}
