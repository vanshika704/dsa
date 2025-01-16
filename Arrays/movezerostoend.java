package Arrays;

public class movezerostoend {
    public static int index = 0;
    public static int[] arr = {1, 3, 5, 0, 8, 0, 7, 5, 0};

    public static void main(String[] args) {
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {  
                arr[index] = arr[i];  
                if (i != index) { 
                    arr[i] = 0;  
                }
                index++; 
            }
        }

        // Print the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
