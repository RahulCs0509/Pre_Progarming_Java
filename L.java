package com.perprogarming;

import java.util.Scanner;

// WAJP to read the one int value from the user and print the odd and even
public class L {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a int values:- ");
		int a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println("User given number is Even:- "+a);
		}
		else	
		{
			System.out.println("User given number is Odd:- "+a);
		}
	}
}
