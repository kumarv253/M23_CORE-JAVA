package com.cg.statickeyword;

public class StaticMethod {
	static void display() {
		System.out.println("Yes");
	}
	
	static void String name() {
      return "No"
		}
	

	public static void main(String[] args) {

		// without creating obj in static method
		display();
		
	}

}
