package com.capgemini.introduction;

import java.util.Scanner;

public class DoubleInput {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter The Number");
		double A = s.nextDouble();
		System.out.println("Your Entered Number is"+A);
	}

}
