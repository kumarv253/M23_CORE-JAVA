package com.tns.decisionmaking;

public class NestedIf {

	public static void main(String[] args) {

		int age=15,weight=55;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
					System.out.println("Blood Donation is Accepted");

			}
			else {
				System.out.println("extra ropes will be added");

			}
			else 
			{
				System.out.println("Not Elligible");

			  }	
		}
	}
}
