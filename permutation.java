
public class permutation {
    public static void permu(String str, String Perm) {
        if (str.length() == 0) {
            // System.out.println(str.length());
            System.out.println(Perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // System.out.println(currChar);
            String newStr = str.substring(0, i) + str.substring(i + 1); // abc
            // System.out.println(newStr);
            permu(newStr, Perm + currChar);
        }
    }

    public static void main() {
        String str = "abc";
        permu(str, "");
    }
}
