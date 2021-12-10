package before.lesson1;

/**
 * Created by nane on 3/22/18.
 */
public class excercise {
    public static void main(String[] kuku) {


        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        int t = ~a & b;
        int y = a & ~b;

        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("a | b = " + binary[c] );
        System.out.println("a & b = " + binary[d]);
        System.out.println("a ^ b = " + binary[e]);
        System.out.println("(~a & b) | (a & ~b); " + binary[f]);
        System.out.println("g = ~a & 0x0f = " + binary[g]);
        System.out.println("a & ~b = " + y);

       // ByteShift();
        //inder();


    }

    static void ByteShift() {

        byte x = 64, y;
        int i;
        i = x << 2;
        y = (byte) (x << 2);
        System.out.println("Original value of a: " + x);
        System.out.println("i and b: " + i + " " + y);
    }

    static void finder() {

        int u = 10;
        u <<=2;
        System.out.println("u is now " + u);

    }
}
