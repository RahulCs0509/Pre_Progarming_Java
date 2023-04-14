package Array_Progarm;

public class SubArray {

    void Argange(int arr[], int n, int sum)
    {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
 
            if (currentSum == sum) {
                System.out.println("Sum found at indexe " + i);
                return;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
 
                    if (currentSum == sum) {
                        System.out.println( "Sum found between indexes " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
 
    public static void main(String[] args)
    {
    	SubArray arraysum = new SubArray();
        int arr[] = { 5, 2, 4, 1, 23 };
        int n = arr.length;
        int sum = 6;
        arraysum.Argange(arr, n, sum);
    }

}
