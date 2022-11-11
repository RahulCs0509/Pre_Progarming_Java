package com.perprogarming;

import java.util.Scanner;

// WAJP to read one int value from the user and print the intger is +ve or -ve.
public class I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a intger number:- ");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("User Given number id +ve:- "+a);
		}
		else
			System.out.println("user Given number is -ve:- "+a);
	}

}
