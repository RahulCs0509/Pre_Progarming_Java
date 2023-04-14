package Array_Progarm;

public class SmallBigest {
	public static void main(String[] args) {
		int []ar=new int[] {2,5,22,5,6,4};
		int big=ar[0];
		int small=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>big) {
				big=ar[i];
			}
			}
		System.out.println("Bigest array element is: "+big);
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<small) {
				small=ar[i];
				}
			}
		System.out.println("Smallest array element is: "+small);
	}


}
