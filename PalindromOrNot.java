package com.perprogarming;

import java.util.Scanner;

public class PalindromOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==temp)
			System.out.println(temp+" is Palindrom");
		else
			System.out.println(temp+" is not palindrom");
	}

}
