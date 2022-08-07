package com.cg.oops;

class pulser
{
	
	int speed;
	String color;
	void Pulser(int speed,String color)
	{
		speed=50;
		color="white";
	}
	void accept()
	{
		
		System.out.println("Speed is: "+speed+"km/hr" +" and color is: "+color);
	}
}
public class ParmeterizedConstrator {

	
	public static void main(String[] args) {

		Pulser p=new Pulser(0, null);
		p.accept();
	}

}
