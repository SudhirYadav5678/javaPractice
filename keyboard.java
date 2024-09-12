public class keyboard {
    public static String[] keybboardCom = { ".", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tu", "vwx", "yz" };

    public static void PrintCom(String str, int inx, String combination) {
        if (inx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(inx);
        String mapping = keybboardCom[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            PrintCom(str, inx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main() {
        String str = "23";
        PrintCom(str, 0, "");
    }
}
