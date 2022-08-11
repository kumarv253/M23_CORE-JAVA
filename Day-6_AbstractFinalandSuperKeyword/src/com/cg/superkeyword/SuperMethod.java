package com.cg.superkeyword;

class A
{
	int pin=65;
	void display()
	{
		System.out.println("Pin  is:"+pin);

	}	
}
class B extends A
{
	int pin=112;
	void display()
	{
		System.out.println("Pin  is:"+pin);

	}	
	void Print()
	{
		System.out.println("Pin is:"+pin);
		//super keyword is used to refer the parent class Method
		super.display();


	}
}
public class SuperMethod {

	public static void main(String[] args) {

		 B b=new B();
		 b.Print();
		
	}

}
