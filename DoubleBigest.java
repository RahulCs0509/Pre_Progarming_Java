package com.perprogarming;
// Double biggest number 
import java.util.Scanner;

public class DoubleBigest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Double Type Values: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		if(a>b&&a>c&&a>d)
			System.out.println(a);
		else if(b>c&&b>d)
			System.out.println(b);
		else if(c>d)
			System.out.println(c);
		else
			System.out.println(d);
		
	}

}
