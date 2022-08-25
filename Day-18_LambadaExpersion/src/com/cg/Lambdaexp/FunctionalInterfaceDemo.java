package com.cg.Lambdaexp;
//functinal Interface

interface D
{
	String display(String str);//abstarct Method
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = (String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to Laambada expression"));
	}

}
