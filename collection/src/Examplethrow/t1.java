package Examplethrow;

public class t1 {
	
	public static void age(int age)
	{
		
		if (age<18)
			throw new ArithmeticException("not valid");// throe exception
		else
		{
			
			System.out.println("eligible ");
		}
	}

	public static void main(String[] args)
	
	{
		t1.age(10);
		System.out.println("rest of the code");

	}

}
