package Array_Progarm;
public class NegPos {
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
	public static void main(String[] args) {
		NegPos no=new NegPos();
		int []n=new int[]  {-1,8,9,-8,12,-3,-6,22};
		int [] pn=no.postivenagtive(n);
		System.out.println("No of postive  Number is "+pn[0]);
		System.out.println("No of negtive Number is "+pn[1]);
		
	}

}
