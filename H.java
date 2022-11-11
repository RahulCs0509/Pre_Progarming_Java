package com.perprogarming;

import java.util.Scanner;

// WAJP To read radius of circle and print area and and circumference
public class H {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius of circle:-");
		float r=sc.nextFloat();
		float area=3.14f*r*r;
		float ciru=2*3.14f*r;
		System.out.println("Area of circle is:- "+area);
		System.out.println("circumference of circle is:- "+ciru);
		
	}
}
