package com.patterns;

import java.util.Scanner;
//Enter n : 5
//1 1 1 1 1 
//0 0 0 0 
//1 1 1 
//0 0 
//1 

public class pat15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                if(i%2==0)
                    System.out.print("0"+" ");
                else
                    System.out.print("1"+" ");
            }
            System.out.println();
        }
    }

}
