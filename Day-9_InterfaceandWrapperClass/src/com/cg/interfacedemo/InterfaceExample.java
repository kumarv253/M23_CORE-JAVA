package com.cg.interfacedemo;
interface A
{
	//abstract method by defalut
	void print();
	void display();
	
}
class B implements A
{
	//override
	public void print()
	{
		System.out.println("Welcome");
	}

	public void display()
	{
		System.out.println("Java");
	}

}
public class InterfaceExample {

	public static void main(String[] args) {

		B b=new B();
		b.print();
		b.display();
	}

}
