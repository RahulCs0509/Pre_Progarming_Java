package com.perprogarming;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int c=0;
		do {
			n=n/10;
			c++;
			
		}while(n!=0);
		System.out.println(c);
	}

}
