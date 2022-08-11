package com.cg.superkeyword;
class Android
{
	Android()
	{
		System.out.println("Lava is Android Mobile");
	}
	
}
class Lava extends Android
{
	Lava()
	{
		//android class constractor
		super();
		
		System.out.println("Hello Everone");

	}
	
}
public class SuperConstrator {

	public static void main(String[] args) {
		Lava L=new Lava();

	}

}
