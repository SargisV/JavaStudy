package util;


public class MathUtil {

    public static void main(String[] args) {

        System.out.println((5 >> 4)| 5);
        char key = (char)((5 << 4)| 5);


        char[] text = {'h', 'e', 'l', 'l', 'o', ' ',  'b', 'r', 'o', 't', 'h', 'e', 'r'};
        ArrayUtil.print(text);
        encrypt(text, key);
        ArrayUtil.print(text);
        encrypt(text, key);
        ArrayUtil.print(text);





        System.out.println("result is " + reverse(129));
        int n = 5;
        printIntAsBinary(n);
        System.out.println("factorial is " + factorial(5));
        System.out.println("|n| = " + abs(8));
        System.out.print( n + " as binary is ");
        printIntAsBinary(n);
        System.out.println("reverse of n is " + reverse(1005) );
        System.out.println("a's n power is " + pow(2,5));

    }


    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        int power = 1;
        int i;
        for(i = 1; i < n ; i++){
            power = power * a;
        }
        
        return power;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        
        return 0;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n ; i++) {
            fac = i * fac;
        }

        return fac;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
       return n < 0 ? -n : n;
    }

    public static void printIntAsBinary(int n){
        int i;
        for(i = 31; i >= 0; i--) {
            System.out.print(n >> i & 1);
            if(i % 8 == 0){
                System.out.print(" ");
            }

        }
        System.out.println();
    }

    public static int reverse(int number) {
        int result;
        result = 0;

//        while (number != 0) {
             //take first digit of number
//            result = 10*result + number % 10;//gain to result
//            number /= 10;//cut the last digit from number

//        }

        for (; number != 0 ; number /= 10){   // why number/=10??????
            result = 10*result + number % 10;
        }

        
        return result;
    }

    public static void encrypt(char[] original, char key) {

        for(int i = 0; i < original.length ; i++){
            original[i] ^= key;

        }
    }

}
