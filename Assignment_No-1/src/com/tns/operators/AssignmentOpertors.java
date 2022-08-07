package com.tns.operators;

import java.util.Scanner;

public class AssignmentOpertors {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int res=(x=y);
		int res1=(x+=y);
		int res2=(x*=y);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
