package before.util;

/**
 * Created by nane on 4/14/18.
 */
public class ArrayUtil {

    public static void main (String[] args){
        int[][] a = {{4,444,6},{8,7,4},{6,4,5}};
        int [] b = {7,7,7};
        print(b);
        System.out.println();
        print(a);
        System.out.println();
        char[] c = {'a','a','b','a'};
        print(c," 0 ");
        System.out.println();
        print(c);


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

    public static int getMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
    public static void print(char[] a) {
       print(a, " ");
    }

    public static void print(char[] a, String delimiter) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();

    }

   public static void print(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + SPACES[getMaxDigitsCount(b) - getDigitsCount(b[i][j])]);
            }
            System.out.println();
        }
    }


    static int getDigitsCount(int n) {
        n = MathUtil.abs(n);
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

    static final String[] SPACES = {
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





}
