package com.perprogarming;

import java.util.Scanner;

//WAJP to read the L and W of rectangle and print the area and perimeter 
public class J {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of L:- ");
		int l=sc.nextInt();
		System.out.println("enter a value of W:- ");
		int w=sc.nextInt();
		System.out.println("Area of Rectangle is: "+l*w);
		System.out.println("Perimeter of Rectangle is: "+2*(l+w));
				
	}
}
