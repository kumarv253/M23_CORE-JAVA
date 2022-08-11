package com.cg.abstractkeyword;

abstract class Flower
{
	//abstract Method
	abstract void print()	;
	//non-abstarct method
	void accept()
	{
		System.out.println("Demo On Keyword");
	}
}

class Lilly extends Flower
{
	void print()
	{
		System.out.println("Demo On Abstract Methos");

	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Lilly objA=new Lilly();
		//we canot create obj of abstract class if wont then do the below step line
		Flower objB=new Lilly();
		objA.accept();	
		objB.print();
	}

}
