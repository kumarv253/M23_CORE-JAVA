package com.cg.exceptionhandling;

public class Throw_Keyword {
	public static void validate(int age)
	{
		
		if(age<21 ||age>27)
		{
			throw new ArithmeticException("not eligible:");
		}
		else
		{
			System.out.println("eligible to attend military selection:");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			validate(30);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	System.out.println("rest of the code:::");


	}

}
