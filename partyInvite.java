public class partyInvite {
    public static int call(int n) {
        if (n <= 1) {
            return 1;
        }
        int single = call(n - 1);
        int pairs = (n - 1) * call(n - 2);
        return single + pairs;
    }

    public static void main(String arg[]) {
        int n = 4;
        System.out.println(call(n));

    }
}
