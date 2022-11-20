package com.perprogarming;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+" is Armstrong Number");
		else
			System.out.println(temp+" is not Armstrong Number");
	}

}
