package com.cg.thiskeyword;
//this can be passed as arugument in the constractor call
class A
{
	int num;
	A()
	{
		System.out.println("welcome to M23 Batch");

	}
	A(int num)
	{
		this.num=num;
		
	}
}
public class InstanceConstractor {

	public static void main(String[] args) {

		A a=new A();
		A b=new A(5);
		System.out.println("Number is:"+b.num);

	}

}
