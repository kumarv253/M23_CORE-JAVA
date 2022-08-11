package com.cg.statickeyword;

public class StaticBlock {
	static int a;
	static String name;
	/*StaticBlock(int a, String anme)
	{
		this.a=a;
		this.name=name;
	}
*/
	//static block
	static
	{
		a=34;
		name="Jave";
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(name);

	}

}
