package com.patterns;

import java.util.Scanner;
//Enter n : 5
//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1 

public class pat16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}

