package com.array;

public class DriverArray {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read frist Array:");
		int [] n=ao.readArray();
		double [] n3=ao.readArrayDouble();
		System.out.println("Read second Array:");
		int [] n1=ao.readArray();
		System.out.println("User enter Frist Array ");
		ao.disArray(n);
		System.out.println("User enter Second Array");
		ao.disArray(n1);
		int []n2=ao.mergeArray(n, n1);
		System.out.println("Merage the two array in single array ");
		ao.disArray(n2);

		System.out.println("In Array Bigest element: "+ao.getBigest(n));
		System.out.println("In Array smallest element: "+ao.getSmallest(n));
		int [] ct=ao.countEvenOdd(n);
		System.out.println("No of Even Number is "+ct[0]);
		System.out.println("No of Odd Number is "+ct[1]);
		
		System.out.println("Avg of array "+ao.AvgArray(n3));
		
	
		ao.disArray(n);
		ao.reverseArray(n);
		System.out.println("Reverse the element of Array ");
		ao.disArray(n);
		ao.updateArray(n);
		System.out.println("Given elemet digits sum is ");
		ao.disArray(n);
		
		int [] sum=ao.sumEvenOdd(n);
		System.out.println("No of Even Number Sum is "+sum[0]);
		System.out.println("No of Odd Number Sum is "+sum[1]);
		
		int [] pn=ao.postivenagtive(n);
		System.out.println("No of postive  Number is "+pn[0]);
		System.out.println("No of negtive Number is "+pn[1]);
		
		int []pcount=ao.primeNoNonPrime(n);
		System.out.println("In Array Elements Prime Number count is: "+pcount[0]);
		System.out.println("In Array Elements Non Prime Number count is: "+pcount[1]);
		
		int count =ao.primeNo(n);
	System.out.println("In Array Elements Prime Number count is: "+count);
		
		int []n4=ao.mergeZigZagArray(n, n1);
		System.out.println("Merage the two array in single array zigzag format:");
		ao.disArray(n);
		ao.disArray(n1);
		ao.disArray(n4);
		
		int []n5=ao.sortMergeArray(n,n1);
		ao.disArray(n);
		ao.disArray(n1);
		System.out.println("Sorted the two array in single array  format:");
		ao.disArray(n5);
		
		
		

		
	}
	
	
	

}
