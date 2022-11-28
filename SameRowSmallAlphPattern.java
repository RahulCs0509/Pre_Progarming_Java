package com.patterns;

import java.util.Scanner;
//Enter n : 5
//a a a a a 
//b b b b b 
//c c c c c 
//d d d d d 
//e e e e e 
public class SameRowSmallAlphPattern {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n : ");
	        int n = sc.nextInt();

	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	                System.out.print((char)(i+96)+" ");
	            System.out.println();
	        }
	    }
}
