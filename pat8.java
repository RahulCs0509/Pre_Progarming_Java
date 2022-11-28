package com.patterns;

import java.util.Scanner;
//Enter n : 5
//1 
//1 0 
//1 0 1 
//1 0 1 0 
//1 0 1 0 1 

public class pat8 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n : ");
	        int n = sc.nextInt();

	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                if(j%2==0)
	                    System.out.print("0"+" ");
	                else
	                    System.out.print("1"+" ");
	            }
	            System.out.println();
	        }
	    }
}
