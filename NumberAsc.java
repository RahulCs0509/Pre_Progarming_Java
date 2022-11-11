package com.perprogarming;

import java.util.Scanner;

public class NumberAsc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
//		int big=(a>b)?a:b;
//				big=(big>c)?big:c;
//				int small=(a<b)?a:b;
//					small=(small<c)?small:c;
//					int mid=(a+b+c)-(big+small);
//					System.out.println(small+","+mid+","+big);
		// another ways
//					System.out.println(small);
//					System.out.println(mid);
//					System.out.println(big);
		
		//Another ways
		int big=(a>b&&a>c)?a:(b>c)?b:c;
		int small=(a<b&&a<c)?a:(b<c)?b:c;
		System.out.println(small);
		System.out.println((a+b+c)-(big+small));
		System.out.println(big);
	}

}
