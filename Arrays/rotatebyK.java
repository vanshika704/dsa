package Arrays;


public class rotatebyK {
    public static int[] arr = {1, 2, 3, 4, 5, 6};
    public static int k = 3;

    public static void main(String[] args) {
        for (int j = 0; j < k; j++) {
            int temp = arr[0]; // Store the first element
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1]; // Shift elements left
            }
            arr[arr.length - 1] = temp; // Place the first element at the end
        }

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
