package com.patterns;

import java.util.Scanner;
//Enter n : 5
//1 
//2 6 
//3 7 10 
//4 8 11 13 
//5 9 12 14 15 
public class pat19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            int num = i;
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
                 
                num = num+n-j;

            }
            System.out.println();
        }
    }
	}

