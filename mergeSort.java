public class mergeSort {
    public static void conqure(int arr[], int s, int mid, int e) {
        int merged[] = new int[e - (s + 1)];
        int inx1 = s;
        int inx2 = mid + 1;
        int x = 0;

    }

    public static void divide(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s - (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid, e);
        conqure(arr, s, mid, e);
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 3, 4, 2, 5, 64, 35 };
        int n = arr.length;

    }
}
