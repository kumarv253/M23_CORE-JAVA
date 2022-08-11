package com.cg.finalkeyword;

class car
{
	String name;
	//Final Method is Inherited but not Override
	final void print(String  name)
	{

		System.out.println("My Name is:"+name);

}
}
	class audi extends car
	{
		
	}
public class FinalInheritanceMethod {

	public static void main(String[] args) {
		audi a=new audi();

		a.print("audi");
				
	}

}
