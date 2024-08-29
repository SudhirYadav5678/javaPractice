
public class stringR {
    public static int first = -1;
    public static int last = -1;

    public static void indexS(String str, int inx, char element) {
        if (inx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentE = str.charAt(inx);
        if (currentE == element) {
            if (first == -1) {
                first = inx;
            } else {
                last = inx;
            }
        }
        indexS(str, inx + 1, element);
    }

    public static void main(String[] args) {
        String str = "ascsadfjkaeda";
        indexS(str, 0, 'a');
    }
}

// public static void string(String s, int n) {
// if (n == -1) {
// return;
// }
// System.out.print(s.charAt(n));
// string(s, n - 1);
// }
// String s = "abcd";

// string(s, s.length() - 1);