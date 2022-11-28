package com.patterns;

import java.util.Scanner;
//Enter n : 5
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 

public class pat9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
