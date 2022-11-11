package com.perprogarming;

import java.util.Scanner;

//WAJP to read three int value form the user and print Smallest among of three intger
public class E {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a three intger numbeer:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int Small =a;
		if(b<Small)
		{
			Small=b;
		}
		if(c<Small)
		{
			Small=c;
		}
		System.out.println("Biggest number id :- "+Small);
	}
}
