package com.perprogarming;

import java.util.Scanner;

public class CharFrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char ");
		char ch= sc.next().charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			System.out.println("It's Alphabet");
		else if(ch>='0'&&ch<='9')
			System.out.println("It's Digits");
		else
			System.out.println("It's Special Char");
	}

}
