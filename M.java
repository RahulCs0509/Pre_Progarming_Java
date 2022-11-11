package com.perprogarming;

import java.util.Scanner;

// WAJP to read the temperature in term of convert temperature celsius to fahrenheit 
public class M {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Temperature celsius:- ");
		int c=sc.nextInt();
		int f=c*(9/5)+32;
		System.out.println("convert temperature celsius to fahrenheit is:- "+f);
		
	}

}
