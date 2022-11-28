package com.patterns;

import java.util.Scanner;
//Enter any word : RAHUL
//R 
//R A 
//R A H 
//R A H U 
//R A H U L 
public class pat20 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any word : ");
	        String str = sc.next();

	        for(int i=0;i<str.length();i++)
	        {
	            for(int j=0;j<=i;j++)
	                System.out.print(str.charAt(j)+" ");
	            System.out.println();
	        }
	    }
}
