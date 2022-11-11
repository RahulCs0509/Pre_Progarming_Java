package com.perprogarming;
// to check user given number is multiple of 3 And 5 
import java.util.Scanner;

public class MultipalOfThreeAndFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Any Number ");
		int n= sc.nextInt();
		if(n/3==0&&n/5==0)
			System.out.println("User Given Number Is Multipale of 3 And 5");
		else
			System.out.println("User Given Number Is Not Multipale of 3 And 5");
	}

}
