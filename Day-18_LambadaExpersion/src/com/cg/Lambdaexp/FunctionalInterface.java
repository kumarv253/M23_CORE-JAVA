package com.cg.Lambdaexp;

interface A
{
	void print();//abstract method
}

//length of code is less when using Lambda

public class FunctionalInterface {

	public static void main(String[] args) {

		A obj=()->   //syntax
		{
			System.out.println("Functional interface using Lambada Expression");
		};
		obj.print();
	}

}
