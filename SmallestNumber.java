package com.perprogarming;
// find the smallest Number
import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c)
			System.out.println(a+" is Smallest Number");
		else if(b<c)
			System.out.println(b+" is Smallest Number");
		else
			System.out.println(c+" is Smallest Number");
	}

}
