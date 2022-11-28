package com.patterns;

import java.util.Scanner;
//1 2 3 4 5
//6 7 8 9 1 
//2 3 4 5 6
//7 8 9 1 2 
//3 4 5 6 7
public class pat4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
