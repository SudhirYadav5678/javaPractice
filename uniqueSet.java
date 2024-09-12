import java.util.HashSet;

public class uniqueSet {
    public static void set(String str, int inx, String newString, HashSet<String> setUni) {
        if (inx == str.length()) {
            if (setUni.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                setUni.add(newString);
                return;
            }
        }
        char currChar = str.charAt(inx);
        set(str, inx + 1, newString + currChar, setUni);
        set(str, inx + 1, newString, setUni);
    }

    public static void main() {
        String str = "aaa";
        HashSet<String> setUni = new HashSet<>(); // hash setreturn unique sets.
        set(str, 0, "", setUni);
    }
}
