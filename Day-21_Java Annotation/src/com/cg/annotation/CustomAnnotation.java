package com.cg.annotation;
//custom annotation
@interface Custom
{
	//abstract method
	String print();
	

}

class B
{
	@Custom (print ="hello Students")
	public void display() 
	{
		System.out.println("Holiday");
	}
}
public class CustomAnnotation {

	public static void main(String[] args) {

		B b= new B();
		b.display();
	}

}
