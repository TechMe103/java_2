public class searchhh {

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

    static int search_1(int[] arr, int target) {
        int st = 0; 
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Handle duplicates
            if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
            } else if (arr[st] <= arr[mid]) { // Left part is sorted
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
        int[] arr = {0, 0, 0, 1, 1, 1, 2, 0, 0, 0}; // Rotated sorted array
        int target = 2;
        System.out.println(search(arr, target)); // Output should be 6 (correct index of target 2)
        System.out.println(search_1(arr, target)); // Output should be 6 (correct index of target 2)
    }
}
