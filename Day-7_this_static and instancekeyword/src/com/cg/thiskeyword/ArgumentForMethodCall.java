package com.cg.thiskeyword;
//this can be passed as a argument in the method call
class B
{
	public void accept1(B b)
	{
		System.out.println("Accept Method");

	}
	public void accept2(B b)
	{
		accept1(this);
	}
}
public class ArgumentForMethodCall {

	public static void main(String[] args) {
		B b =new B();
		b.accept1(b);
		
	}

}
