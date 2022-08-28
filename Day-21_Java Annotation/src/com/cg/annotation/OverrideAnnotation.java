package com.cg.annotation;

class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is :"+s+"Km/hr");
		
	}
}
class BMW extends Car
{
	
	@Override
	//Override annotation is giving the extra information above the method

	public void speed(int str)
	{
		System.out.println("Speed is :"+str+"Km/hr");
		
	}
}

	
public class OverrideAnnotation {

	public static void main(String[] args) {

		BMW b=new BMW();
		b.speed(60);
	}

}
