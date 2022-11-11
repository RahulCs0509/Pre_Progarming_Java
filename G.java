package com.perprogarming;

import java.util.Scanner;

//WAJP to read two int values and print thoseint are equles or not 
public class G {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Intget number:- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println(a+" and "+b+" both number are equles.");
			
		}
		else
			System.out.println(a+" and "+b+" both number are not equles.");
	}
}
