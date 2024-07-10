import java.util.*;

public class bitManipulation {
    public static void main(String arg[]) {
        // get operation
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1 << pos;
        // if ((bitMask & n) == 0) {
        // System.out.println("this is a zero ");
        // } else {
        // System.out.println("This is one");
        // }

        // set operation
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1 << pos;
        // int newBit = bitMask | n;
        // System.out.println(newBit);

        // clear bit operation
        // int n = 5; // 0101
        // int pos = 2;
        // int bitMask = 1 << pos; // 0001 => 1000
        // int clear = ~(bitMask) & n;
        // System.out.println(clear);

        // update bit operation
        Scanner sc = new Scanner(System.in);
        int ope = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        int notBitmask = ~bitMask;

        if (ope == 1) {
            // set
            int newBit = bitMask | n;
            System.out.println(newBit);
        } else {
            // clear
            int clear = notBitmask & n;
            System.out.println(clear);
        }

    }
}
