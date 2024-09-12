public class subset {
    public static void set(String str, int inx, String newString) {
        if (inx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(inx);
        set(str, inx + 1, newString + currChar);
        set(str, inx + 1, newString);
    }

    public static void main() {
        String str = "abc";
        set(str, 0, "");
    }
}
