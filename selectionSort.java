public class selectionSort {
    public static void arrPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String arg[]) {
        int[] arr = { 5, 2, 4, 6, 1 };

        // selection sort
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; i++) {
                // compare
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
                // swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;

            }

        }
        System.out.println(arr);
    }
}
