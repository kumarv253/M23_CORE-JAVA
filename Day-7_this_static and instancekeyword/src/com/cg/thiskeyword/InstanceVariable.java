package com.cg.thiskeyword;
//this keyword is used to refer the current class instance variable
class x
{
	int m1,m2;
	public void print(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void display()
	{
		System.out.println("Addition of M1 and M2:"+(m1+m2));

	}
}
public class InstanceVariable {

	public static void main(String[] args) {

		x obj=new x();
		obj.print(11, 25);
		obj.display();	}

}
