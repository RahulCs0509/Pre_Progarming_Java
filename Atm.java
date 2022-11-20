package com.perprogarming;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the amount ");
		int amt=sc.nextInt();
		System.out.println("2000rs --> "+amt/2000);
		amt=amt%2000;
		System.out.println("500rs --> "+amt/500);
		amt=amt%500;
		System.out.println("200rs --> "+amt/200);
		amt=amt%200;
		System.out.println("100rs --> "+amt/100);
		amt=amt%100;
		System.out.println("50rs --> "+amt/50);
		amt=amt%50;
		System.out.println("20rs --> "+amt/20);
		amt=amt%20;
		System.out.println("10rs --> "+amt/10);
		amt=amt%10;
		System.out.println("5rs --> "+amt/5);
		amt=amt%5;
		System.out.println("2rs --> "+amt/2);
		amt=amt%2;
		System.out.println("1rs --> "+amt/1);
		amt=amt%1;
	}

}
