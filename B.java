package com.perprogarming;

import java.util.Scanner;

// WAJP user enter no is the +ve format
public class B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an intger number");
		int n= sc.nextInt();
		if(n<0)
		{
			n=n*-1;
		}
		System.out.println("User enter number is :- "+n);
	}
}
