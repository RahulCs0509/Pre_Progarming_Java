package com.perprogarming;

import java.util.Scanner;

// WAJP to read a three int number from the user and print the average.
public class K {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Three number:- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Average is :- "+(a+b+c)/3);
				
	}
}
