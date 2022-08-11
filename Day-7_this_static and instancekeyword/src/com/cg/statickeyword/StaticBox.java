package com.cg.statickeyword;

public class StaticBox
{
	double height;
	double width;
   static int count;
   //parameterized constarctor
   public StaticBox(double width,double height)
   {
	   this.width=width;
	   this.height=height;

   }
   
   public StaticBox()
   {
	   super();
	   int count=0;
	   count++;
		System.out.println("Count is:"+count);

   }
   
	public static void main(String[] args) {
		StaticBox s=new StaticBox();
		s.width=23;
		s.height=6;
		System.out.println(s.width);		
		
	}

}
