package com.cg.inheritance;

class A
{
	int age=20;
	
}
class B extends A
{
 void display()
 {
	 System.out.println("Your Age is:"+age);
 }
}



public class SingleInheritance {

	public static void main(String[] args) {
		B myobj =new B();
		myobj.display();
	
}
}