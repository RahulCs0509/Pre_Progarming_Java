package com.patterns;

import java.util.Scanner;
//Enter n : 5
//a 
//b b 
//c c c 
//d d d d 
//e e e e e 

public class pat18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print((char)(i+96)+" ");
            System.out.println();
        }
    }
}
