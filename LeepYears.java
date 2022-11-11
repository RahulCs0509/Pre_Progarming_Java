package com.perprogarming;

import java.util.Scanner;

public class LeepYears 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Years ");
		int yy=sc.nextInt();
		if ((yy % 400 == 0) || ((yy % 4 == 0) && (yy % 100 != 0))) 
			{
	           
	            System.out.println(yy + " Is Leap Year");
	        }
	 
	        else 
	        {
	            System.out.println(yy + "  Is Non - Leap Year");
	        }

	}
}
