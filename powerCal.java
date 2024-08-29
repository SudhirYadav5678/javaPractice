public class powerCal {
    public static int calPower(int x, int y) {
        if (y == 0) { // base case
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (y % 2 == 0) { // y is even
            return calPower(x, y / 2) * calPower(x, y / 2);
        } else { // y is odd
            return calPower(x, y / 2) * calPower(x, y / 2) * x;
        }
    }

    public static void main(String arg[]) {
        int x = 2;
        int y = 5;
        int ans = calPower(x, y);
        System.out.println(ans);
    }
}

// int xPower = calPower(x, y - 1);
// int xTotal = x * xPower;
// return xTotal;