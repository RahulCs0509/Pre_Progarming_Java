package com.perprogarming;

import java.util.Scanner;

//WAJP to read three double value form the user and print bigest among of three double 
public class F {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a three intger numbeer:-");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double big =a;
		if(b>big)
		{
			big=b;
		}
		if(c>big)
		{
			big=c;
		}
		System.out.println("Biggest number id :- "+big);
	}
}
