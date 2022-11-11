package com.perprogarming;
// user given number check which number is Middle 
import java.util.Scanner;

public class MiddleNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Three number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a<c||a>c&&a<b)
			System.out.println(a+" Is Middle Number");
		else if(b>a&&b<c||b>c&&b<a)
			System.out.println(b+" Is Middle Number");
		else
			System.out.println(c+" Is Middle Number");
	}

}
