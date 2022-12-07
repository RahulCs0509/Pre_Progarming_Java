package com.array;

import java.util.Scanner;

public class AvgArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		double sum=0,avg=0;
		double [] ar=new double[n];
		System.out.println("Enter "+n+" double");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextDouble();
		}
		System.out.println("User enter values: ");
		for(int i=0;i<ar.length;i++) {
			
			sum=sum+ar[i];
			avg=sum/ar.length;
			System.out.print(ar[i]+" \n");	
		}

//		System.out.println("array sum is:"+sum);
		System.out.println("array avg is:"+avg);
}

}
