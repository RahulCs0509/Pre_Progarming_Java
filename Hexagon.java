package com.patterns;

import java.util.Scanner;

public class Hexagon {
	static void Phexagon(int n)
	{
		int l = 2 * n - 1;
	
		
		for (int i = 0; i < n; i++)
		{
			int elem = i + n;
	
			
			for (int k = 0; k < elem; k++)
			{
				
				if ((k == n + i - 1) ||
					(k == n - i - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int m = 0; m < n - 2; m++)
		{
			for (int j = 0; j < l; j++)
			{
				if (j == 0 || j == l - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			int r = n - 1;
		for (int h = r; h >= 0; h--)
		{
			int elem = h + n;
			for (int k = 0; k < elem; k++)
			{
				if ((k == n + h - 1) ||
					(k == n - h - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter N: ");
		int n=sc.nextInt();
			Phexagon(n);
	}
}
