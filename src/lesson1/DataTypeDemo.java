package lesson1;

/**
 * Created by nane on 3/5/18.
 */
public class DataTypeDemo {

    public static void main(String[] args) {

//        intDemo();
//        doubleDemo();
//        charDemo();
//        printCharsWithIntValues();
//        charDemo2();
//        blockScopeDemo();
//        lifeTime();
//        conversionDemo();
//          autoArray();
          avarageArray();
    }

    static void intDemo() {
        int a = 0x10;

        System.out.println(a);

        // Compute distance light travels using long variables.
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        // approximate speed of light in miles per second
        lightSpeed = 186000;
        days = 1000; // specify number of days here
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightSpeed * seconds; // compute distance
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
        System.out.println("the end.");
    }

    static void doubleDemo() {
        double r;
        double pi;
        double a;
        r = 10.6;
        pi = 3.14;
        a = pi * r * r;
        System.out.println("the area of circle is " + a);
    }

    static void charDemo() {
        int a;
        int c;
        double b;
        a = 15;
        b = 15.6;
        c = (byte) (a * b);


        char ch1, ch2;

        ch1 = 88;
        ch2 = 'Y';

        System.out.println("ch1 and ch2: ");
        System.out.println((int) ch1);
    }

    static void printCharsWithIntValues() {
        for (char i = ' '; i == 128; i++) {  // i++ <=> i = i + 1   i = i + 5 <=> i += 5
            System.out.println(i + " : " + (int) i);
        }
        int j = 1;
        for (; ; ) {
            System.out.println(" : ");
            if (++j == 128) {
//               hfghfghf
                break;
            }


        }

    }

    static void charDemo2() {

        char ch1;
        ch1 = 'X';

        System.out.println("ch1 contains " + ch1);
        ch1++;
        System.out.println("ch1 is now " + ch1);
    }

    static void blockScopeDemo() {

        int x; // known to all code within main
        x = 10;
        if(x == 10) { // start new scope
            int y = 20; // known only to this block
// x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
// y = 100; // Error! y not known here
// x is still known here.
        System.out.println("x is " + x);
    }

    static void lifeTime() {

        int x;

        for(x = 0; x < 3; x++) {
            int y = 1;
            System.out.println("y is: " + y);
            y = 100;
            System.out.println("y is now: " + y);
        }
    }

    static void conversionDemo() {

        byte b;
        int i = 384;
        double d = 315.264;

        System.out.println("\nconversion of int to byte");
        b = (byte) i;
        System.out.println("i and b are : " + i + " " + b );

        System.out.println("\nConversion of double to int ");
        i = (int) d;
        System.out.println("d and i are ;" + i + " " + d );

        System.out.println("\nConversion of double to byte " );
        b = (byte) d;
        System.out.println("d and b are now :" + d + " " + b);

    }

    static void autoArray() {

        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
                30, 31 };
        System.out.println("April has " + month_days[3] + " days.");
    }

    static double avarageArray() {

        double nums[] = {10.2, 10.5, 10.7, 11.1, 10.9};

        double sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int i = 0;
        sum = 0;
        while (i < nums.length) {
            sum += nums[i];
            i++;
        }

        i = 0;
        do {
           sum += nums[i];

        } while (++i < nums.length );

      return sum / nums.length;
    }


}






