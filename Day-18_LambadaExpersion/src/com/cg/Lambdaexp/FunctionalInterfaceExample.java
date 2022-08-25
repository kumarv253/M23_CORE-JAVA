package com.cg.Lambdaexp;

interface E
{
	int add(int a, int b);//abstarct Method
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// with Return statement

		E obj = (int a,int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(12,15));
	}

	
	

}
