package com.perprogarming;

import java.util.Scanner;

public class NoOfDay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Months Name ");
		int s=sc.nextInt();
		if(s==1)
			System.out.println("31 Days Is January Months");
		else if(s==2)
			System.out.println("28 and 29 Days Is February Months");
		else if(s==3)
			System.out.println("31 Days Is March Months");
		else if(s==4)
			System.out.println("30 Days Is April Months");
		else if(s==5)
			System.out.println("31 Days Is May Months");
		else if(s==6)
			System.out.println("30 Days Is June Months");
		else if(s==7)
			System.out.println("31 Days Is July Months");
		else if(s==8)
			System.out.println("31 Days Is August Months");
		else if(s==9)
			System.out.println("30 Days Is September Months");
		else if(s==10)
			System.out.println("31 Days Is October Months");
		else if(s==11)
			System.out.println("30 Days Is November Months");
		else if(s==11)
			System.out.println("31 Days Is December Months");
		else
			System.out.println("Invalid Months Name");
	}

}
