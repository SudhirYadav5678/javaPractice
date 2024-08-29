public class towerOfHanoi {
    public static void Hanoi(int n, String src, String hepler, String dest) {
        if (n == 1) {
            System.out.println("transfer " + n + " from " + src + " to " + dest);
            return;
        }
        Hanoi(n - 1, src, dest, hepler);
        System.out.println("transfer " + n + " from " + src + " to " + dest);
        Hanoi(n - 1, hepler, src, dest);
    }

    public static void main(String arg[]) {
        int n = 3;
        Hanoi(n, "s", "h", "d");
    }
}
