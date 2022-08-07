package com.tns.operators;

public class UnnaryOperator {

	public static void main(String[] args) {

		int a=5, b=3;
		int x= a++;//5
		int y = ++b;//4
		int z= a+x;//6+5=11
	     System.out.println(z);

		
	

		int v=5, k=3;
		int t= v--;//5
		int u = --k;//2
		int w= v-t;//4-4=0
	     System.out.println(w);

		
	}
}
