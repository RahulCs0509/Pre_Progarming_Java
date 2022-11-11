package com.perprogarming;

import java.util.Scanner;

//WAJP to cretaed one int value from user and print thst intger that it's special tow digts number or not
public class A {
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter a integer Value:-");
		int n=kb.nextInt();
		int d1=n/10;
		int d2=n%10;
		int sum =d1+d2+d1*d2;
		if(n==sum)
		{
			System.out.println(n+" is special integer number");
		}
		else {
			System.out.println(n+" is not special integer number");
		}
		
	}
}
