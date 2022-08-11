package com.cg.thiskeyword;
class Z
{
	public int X;
	//default constractor
	Z()
	{
		this(23); //invoking the parametreired constractor
		System.out.println("Deafult constarctor");

		
	}
	Z(int X)
{
	System.out.println("value is:"+X);

}
}
public class InvokeConstractor {

	public static void main(String[] args) {
		Z obj = new Z();
	}

}
