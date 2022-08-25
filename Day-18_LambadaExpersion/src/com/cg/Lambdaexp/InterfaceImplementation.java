package com.cg.Lambdaexp;

interface c
{
	void display();	
	//void accept();

}

public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj= ()->
		{
				System.out.println("Lambda Expresssion");
		};
		obj.display();
	}
}
