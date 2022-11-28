package com.patterns;

import java.util.Scanner;
//Enter n : 5
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
public class pat17 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n : ");
	        int n = sc.nextInt();

	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	                System.out.print((char)(j+64)+" ");
	            System.out.println();
	        }
	    }
}
