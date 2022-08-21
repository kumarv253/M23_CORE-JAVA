package com.cg.exceptionhandling;

public class Statements_At_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=121/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block::");
		}
		System.out.println("out of try catch and finally block:::");


	}

}
