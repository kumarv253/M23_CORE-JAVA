package com.cg.superkeyword;
class colour
{
	 String name ="Orange";
	
	
}
class blue  extends colour
{
	String name ="blue";
	void display()
	{
		System.out.println(name);
		//super keyword is used to refer the parent class variable
		System.out.println(super.name);


	}

}

public class SuperVariable {

	public static void main(String[] args) {

		blue b = new blue();
		b.display();
	}

}
