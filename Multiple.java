package com.perprogarming;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ");
		int n=sc.nextInt();
		if(n%3==0&&n%5==0)
			System.out.println("Rahul Weds Sonam");
		else if(n%3==0)
			System.out.println("Rahul");
		else if(n%5==0)
			System.out.println("SOnam");
		else
			System.out.println("Breakup");
	}

}
