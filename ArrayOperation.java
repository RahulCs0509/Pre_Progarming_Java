package com.array;
import java.util.*;
import java.util.Arrays;
public class ArrayOperation {
	// read a input
		int [] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		int [] ar=new int[n];
		System.out.println("Enter"+n+"Values ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}
		//read a input 
	static double [] readArrayDouble() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		double [] ar=new double[n];
		System.out.println("Enter"+n+"Values ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextDouble();
		}
		return ar;
	}

	// print the input
	public void disArray(int [] ar) {
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	// merge the element ; 
	public int[] mergeArray(int []a,int []b) {
		int[]c =new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}

		return c;
		
	}
//Biggest
	public int getBigest(int[]ar) {
		int big=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>big) {
				big=ar[i];
			}
		}
		return big;
		
	}
// smallest
	public int getSmallest(int[] ar) {
		int small=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<small) {
				small=ar[i];
			}
		}
		return small;
		
	}
//even and odd
	public int[] countEvenOdd(int [] ar) {
		int ec=0,oc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				ec++;
			
			else
				oc++;
		}
		int[] count= {ec,oc};
		return count;
	}
//avgerge 
	public double AvgArray(double[] ar) {
		double sum=0,avg=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
			avg=sum/ar.length;
		}
		return avg;
	}
	
	// reverse
	public void reverseArray(int[] ar) {
		int i=0,j=ar.length-1;
		while(i<j) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;	
			i++;
			j--;
		}
			
	}
	// digits sum 
	public void updateArray(int[] x) {
		for(int i=0;i<x.length;i++) {
			int sum=0;
			do {
				int d=x[i]%10;
				sum=sum+d;
				x[i]=x[i]/10;
			}while(x[i]!=0);
			x[i]=sum;
		}

	}
	
	//sumEvenOdd
	public int[] sumEvenOdd(int[] ar) {
		int esum=0,osum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				esum+=ar[i];
			
			else
				osum+=ar[i];
		}
		int[] sum= {esum,osum};
		return sum;
			}
//	postivenagtive
	public int[] postivenagtive(int[] ar) {
		int p=0,n=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>0)
				p++;
			else
				n++;
		}
		int [] pn= {p,n};
		return pn;
		
	}
//	primeNoNonPrime
	public  int[] primeNoNonPrime(int[] ar) {
		int pc=0,npc=0;
		for(int i=0;i<ar.length;i++) {
			if(isPrime(ar[i]))
			pc++;
			else 
				npc++;
		}
		int [] count= {pc,npc};
		return count;
		
		
	}
//	primeNo
	int primeNo(int[] ar) {
		int pc=0;
		for(int i=0;i<ar.length;i++) 
		{
			if(isPrime(ar[i]))
				pc++;
		}
		return pc;
		
	}
	static boolean isPrime(int n) {
		int i=2;
		while(i<=n/2){
		if(n%i==0)
			return false;
		i++;
	}
		return true;
	}
//	mergeZigZagArray
	public int[] mergeZigZagArray(int[] ar1, int []ar2) {
		int res[]=new int [ar1.length+ar2.length];
		
		int i=0, j=0;
		for (int k = 0; k < res.length; ) 
		{
		if (i<ar1.length) 
		 {
		res[k] =ar1 [i];
		i++;
		k++;
		 }
		if (j<ar2.length) 
		 {
		res[k] =ar2 [j];
		j++;
		k++;
		 }
		
		}
		return res;

	}
//	sortMergeArray
	public int[] sortMergeArray(int[] a, int[] b) {
		int[]c =new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for (int j = 0; j < c.length - 1; j++) {
            if (c[j] > c[j + 1]) {

               int temp = c[j];
               c[j] = c[j + 1];
               c[j+ 1] = temp;
               j= -1;
           }
            
		
		}
		return c;
	}
}
