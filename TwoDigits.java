package com.perprogarming;
//User Given number is Two digits or not.
import java.util.Scanner;

public class TwoDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		if(n>=10&&n<=99||n<=-10&&n>=-99)
			System.out.println("It's Tow Digits Number");
		else
			System.out.println("It's Not Tow Digits Number");
	}

}
