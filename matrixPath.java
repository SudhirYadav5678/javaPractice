public class matrixPath {
    public static int path(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int down = path(i + 1, j, n, m);
        int right = path(i, j + 1, down, m);
        return down + right;
    }

    public static void main(String arg[]) {
        int n = 3, m = 3;
        int totalpath = path(0, 0, n, m);
        System.out.println(totalpath);
    }
}
