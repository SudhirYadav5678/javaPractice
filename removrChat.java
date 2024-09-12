public class removrChat {
    public static boolean map[] = new boolean[26];

    public static void removeChar(String str, int inx, String newString) {
        if (inx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(inx);
        if (map[currChar - 'a']) {
            removeChar(str, inx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeChar(str, inx + 1, newString);
        }
    }

    public static void main() {
        String str = "adasvdssf";
        removeChar(str, 0, "");
    }
}
