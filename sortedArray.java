public class sortedArray {
    public static boolean sorted(int arr[], int inx) {

        if (inx == arr.length - 1) {
            return true;
        }
        if (arr[inx] < arr[inx + 1]) {
            return sorted(arr, inx + 1);
        } else {
            return false;
        }

    }

    public static void main(String ar[]) {
        int arr[] = { 1, 2, 3, 4, 4, 6, 7 };
        System.out.println(sorted(arr, 0));
    }
}
