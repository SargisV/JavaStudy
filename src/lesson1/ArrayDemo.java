package lesson1;

/**
 * Created by nane on 3/11/18.
 */
public class ArrayDemo {

    static final String[] spaces = {
            " ",
            "  ",
            "   ",
            "    ",
            "     ",
            "      ",
            "       ",
            "        ",
            "         ",
            "          ",
            "           "
    };


    public static void main(String[] args) {

        int x = 5;
        int y = x;
        x = 22;
        System.out.println(y);
        int[] a = {1, 2, 8, 9};

        verifyEquals(0, getMin(a), "'getMin()'");

        print(a);

        a = new int[5];
        print(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * i;
        }
        print(a);

        int[] b = a;
        a[1] = 111;
        print(b);


        int[][] aa = new int[11][11];
        int k = 0;
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                aa[i][j] = k++;
            }


        }

        System.out.println();
        print(aa);

    }

    static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int getMax(int[][] aa) {
        int max = getMax(aa[0]);
        for (int i = 1; i < aa.length; i++) {
            int curRow = getMax(aa[i]);
            if (curRow > max) {
                max = curRow;
            }


        }
        return max;
    }

    static int getMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    static void verifyEquals(int expected, int value, String message) {
        if (expected != value) {
            System.err.println("The verification of " + message + " is failed");
            System.err.println("Expected: " + expected);
            System.err.println("Actual: " + value);
            return ;
        }
        System.out.println("The verification of " + message + " is passed");
    }

    static int abs(int x) {
        return x < 0 ? -x : x;
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    static void print(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + spaces[getMaxDigitsCount(b) - getDigitsCount(b[i][j])]);
            }
            System.out.println();
        }
    }

    static int getDigitsCount(int n) {
        n = abs(n);
        if (n < 10) return 1;
        if (n < 100) return 2;
        if (n < 1000) return 3;
        if (n < 10000) return 4;
        if (n < 100000) return 5;
        if (n < 1000000) return 6;
        if (n < 10000000) return 7;
        if (n < 100000000) return 8;
        if (n < 1000000000) return 9;
        return 10;
    }

    static int getMaxDigitsCount(int[][] aa) {
        return getDigitsCount(getMax(aa));

    }


}



