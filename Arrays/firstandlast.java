package Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 3, 3, 3, 4, 5};
        int target = 3;

        int[] result = firstAndLast(arr, target);
        
        if (result[0] != -1) {
            System.out.println("First occurrence: " + result[0]);
            System.out.println("Last occurrence: " + result[1]);
            System.out.println("Total occurrences: " + result[2]);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    public static int[] firstAndLast(int[] arr, int target) {
        int first = -1, last = -1, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;  // Increment count for each occurrence
                if (first == -1) {
                    first = i;  // Set first occurrence
                }
                last = i;  // Update last occurrence
            }
        }
///
        return new int[]{first, last, count};  // Return first, last, and count
    }
}
