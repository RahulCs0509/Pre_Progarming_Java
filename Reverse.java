package com.array;


import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		int [] ar=new int[n];
		System.out.println("Enter "+n+" intgers");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("User enter values: ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" \n");	
		}
		System.out.println("User Enter values is Reverse Order: ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		

		
}

}
