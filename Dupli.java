package Array_Progarm;

public class Dupli {
	public static void main(String[] args) {
		int []arr=new int[]{1,2,5,1,2,5,6,7};
		
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j]); 
                }
            }
	}

}
