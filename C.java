package com.perprogarming;
// WAJP to read three int value form the user and print bigest among of three intger
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a three intger numbeer:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big =a;
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
