public class titlePlace {
    public static int place(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertical
        int vertical = place(n - m, m);
        System.out.println("vertical"); // 2
        // horizantol
        int horizantol = place(n - 1, m);
        System.out.println("Horiantol");// 2
        return vertical + horizantol;
    }

    public static void main(String arg[]) {
        int n = 4, m = 2;
        int places = place(n, m);
        System.out.println(places);

    }
}
