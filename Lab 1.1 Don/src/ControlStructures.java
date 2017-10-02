//Donovan Guo 9/27/2017
public class ControlStructures 

{
	public static void main(String[] args)
	{
		
		
		System.out.println(isPrime(4));
		primePrinter();
		fooBarBaz(5);
		System.out.println ("we're done yay");
	}
	 
	public static void fooBarBaz(int x)
	{
		while (x <= 500)
		{
			if (x % 210 == 0)
			{
				System.out.println("fooBarBaz");
			}
			if ((x % 3 == 0) && (x % 10 == 0))
			{
				System.out.println("fooBaz");
			}
			if ((x % 3 == 0) && (x % 7 == 0))
			{
				System.out.println("fooBar");
			}
			if (x % 3 == 0) 
			{
				System.out.println("foo");
			}
			if (x % 7 == 0)
			{
				System.out.println("Bar");
			}
			if (x % 10 == 0) 
			{
				System.out.println("Baz");
			}
			x++;
		}
	}
	
	public static boolean isPrime(int number)
	{
		for (int z = 2; z < number; z++ )
		{
			if (number % z == 0)
			{
				return false;
			}
		}	
		{
			return true;
		}
	}	
	
	
	public static void primePrinter()
	{	
		int p = 1;
		int c = 0;
		while (c <= 1000)
		{
			if (isPrime (p))
			{
				System.out.println(p); 
				c++; 
			}
			p++;
		}
	}
		
	
}				
//i did git 


