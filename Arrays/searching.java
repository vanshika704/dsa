package Arrays;

public class searching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int target = 3;
        int result = search(arr, target);
        System.out.println(result);
    }
    // public static int search(int[] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             return i;
    //         }
    //     }
    //           return -1;
    // }

public static int search(int[] arr, int target) {
    int left = 0;   
    int right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
         return mid;
        }
    }
    return -1;
}
}
