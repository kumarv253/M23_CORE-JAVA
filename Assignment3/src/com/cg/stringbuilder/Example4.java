package com.cg.stringbuilder;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s=new StringBuilder();
		
		System.out.println(s.capacity());
		s.append("boy");
		System.out.println(s.capacity());
		s.append("My nmae is sambhaji dhavne");
		System.out.println(s.capacity());

	}

}
