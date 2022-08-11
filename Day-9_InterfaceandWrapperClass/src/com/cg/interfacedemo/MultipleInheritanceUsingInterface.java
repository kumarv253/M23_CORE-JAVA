package com.cg.interfacedemo;
//multiple Inheritance
interface Father
{
	void property();
	
}
interface Mother
{
	void Love();
	
}
class Daughter implements Father,Mother 
{
	//override
	public void Love()
	{
		System.out.println("Welcome");
	}

	public void Property()
	{
		System.out.println("Java");
	}

}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter D=new Daughter();
		D.Love();
		D.Property();
		
		
	}

}
