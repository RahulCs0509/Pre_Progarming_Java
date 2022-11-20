package com.perprogarming;

import java.util.Scanner;

public class Pass_Fails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four Subjects Marks ");
		int phy=sc.nextInt();
		int chem=sc.nextInt();
		int bio=sc.nextInt();
		int maths=sc.nextInt();
		if(phy<35||chem<35||bio<35||maths<35)
		{
			System.out.println("Fails");
		}
		else
		{
			double per=(phy+chem+bio+maths)/4.0;
			if(per>=85)
				System.out.println("Distinctions "+per);
			else if(per>=60)
				System.out.println("Frist Class " +per);
			else if(per>=50)
				System.out.println("Second Class "+per);
			else
				System.out.println("Pass "+per);
		}
		
	}

}
