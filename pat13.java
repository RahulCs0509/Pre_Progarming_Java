package com.patterns;

import java.util.Scanner;
//1
//0 1
//0 1 0
//1 0 1 0
//1 0 1 0 1
public class pat13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();

    	int k=1; 
    	for(int i=1; i<=n; i++)
    	    {
    	        for(int j=1; j<=i; j++)
    	        {
    	            if(k % 2 == 1)
    	            	{
    	            		System.out.print("1");
    	            	}
    	            		else
    	            		{
    	            			System.out.print("0");
    	            		}
    	            k++;

    	                	        }
    	        	System.out.println();
    	    }
	}
}
