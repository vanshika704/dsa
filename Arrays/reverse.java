package Arrays;

public class reverse {
    public static int arr[] = {1, 4, 5, 7, 8}; 

    public static void main(String[] args) {
        int start = 0;
        int end = arr.length - 1; 
        int temp;

   
        while (start < end) {
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 

         
            start++;
            end--;
        }

     
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i ]);
        }
    }
}
