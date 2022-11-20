package com.perprogarming;

import java.util.Scanner;

//User gives Date format (dd mm yyyy) we check valid or not
public class ValidOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date(dd mm yyyy) ");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dd<1||yy<1||mm>23||dd>31)
			System.out.println("Invalid Formats");
		else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
			System.out.println("Invalid Formats");
		else if(mm==2&&dd>29)
			System.out.println("Invalid Formats");
		else if((yy%4==0&&yy%100!=0||yy%400==0)==false&&mm==2&&dd>28)
			System.out.println("Invalid Formats");
		else
			System.out.println("Valid Formats");
	}
}
