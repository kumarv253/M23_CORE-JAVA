package com.cg.exceptionhandling;
import java.util.Scanner;
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		int res=a/0;
		System.out.println(res);
		//System.exit(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception occoues or not occured the finally block get executed:");
		}


	}

}
