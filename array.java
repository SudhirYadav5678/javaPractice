
public class array {
    public static void main(String[] args) {
        // int[] arr = new int[3];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // int arr[] = {1,2,3,4,5,6,7}; //c++ same

        // auto initialization
        int arr[] = new int[3]; // 0 0 0 is going to print // in c++ garbage value is going to print.
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}