// public class recursion {

//     // public static void printNum(int n) {
//     // if (n == 0) {
//     // return;
//     // }
//     // System.out.println(n);
//     // printNum(n - 1);

//     // };

//     public static void printNum(int n) {
//         if (n > 5) {
//             return;
//         }
//         System.out.println(n);
//         printNum(n + 1);

//     };

//     public static void main(String arg[]) {
//         printNum(1);
//     }

// }

// public class recursion {
//     public static void sumP(int i, int n, int sum) {
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         sumP(i + 1, n, sum);
//     };

//     public static void main(String arg[]) {
//         sumP(1, 5, 0);

//     }
// }

public class recursion {
    public static void fabbi(int i, int j, int n) {
        if (j == n || i == n) {
            return;
        }
        int sum = i + j;
        System.out.println(sum);

    };

    public static void main(String arg[]) {
        int i = 0;
        int j = 1;
        System.out.println(i);
        System.out.println(j);
        fabbi(1, 5, 7);

    }
}