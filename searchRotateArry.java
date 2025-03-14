public class searchRotateArry {

    static int search(int[] arr, int target) {

        int st = 0; 
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[st] <= arr[mid]) { // Left part is sorted
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else { // Right part is sorted
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2}; // Rotated sorted array
        int target = 4;
        System.out.println(search(arr, target)); // Output should be 1
    }
}
