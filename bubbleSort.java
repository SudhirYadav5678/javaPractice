
public class bubbleSort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        // time compolexity = O(n^2)
        // bubble short
        for (int i = 0; i < arr.length; i++) { // n times
            for (int j = 0; j < arr.length - i - 1; j++) { //
                // swap value
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        printarr(arr);
    }
}