public class stringBuilder {
    public static void main(String args[]) {
        // String s = "Hello"; // String is immutable
        // StringBuilder sb = new StringBuilder(s); // StringBuilder is mutable
        // sb.append("Java");
        // System.out.println(sb);

        // // set char at index
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);

        // // char insert
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // // char delete
        // sb.delete(0, 3);
        // System.out.println(sb);

        // string reverse
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int fornt = i;
            int back = sb.length() - 1 - i; // 5-1-0 ==4

            char forntChar = sb.charAt(fornt);
            char backChar = sb.charAt(back);

            sb.setCharAt(fornt, backChar);
            sb.setCharAt(back, forntChar);

        }
        System.out.println(sb);
    }
}
