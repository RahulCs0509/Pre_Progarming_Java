package com.array;

import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		int sum=0;
		int [] ar=new int[n];
		System.out.println("Enter "+n+" intgers");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("User enter values: ");
		for(int i=0;i<ar.length;i++) {
			
			sum=sum+ar[i];
			System.out.print(ar[i]+" \n");	
		}

		System.out.println("array sum is:"+sum);
}
}
