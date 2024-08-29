public class charShift {
    public static void shift(String str, int inx, int count, String newString) {
        if (inx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(inx);
        if (currChar == 'x') {
            count++;
            shift(str, inx + 1, count, newString);
        } else {
            newString += currChar; // char shortout here.
            shift(str, inx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axgdhxhdxx";
        shift(str, 0, 0, "");
    }
}
