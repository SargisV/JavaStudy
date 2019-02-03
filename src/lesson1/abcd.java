package lesson1;

import util.ArrayUtil;

/**
 * Created by nane on 4/20/18.
 */
public class abcd {
     public static void main (String[] args) {
         boolean a = true;
         boolean b = false;
         boolean c = a & b;
         boolean d = a | b;
         boolean e =(!a & b) | (a & !b);

         System.out.println("a = " + a);
         System.out.println("b = " + b);
         System.out.println("c = " + c);
         System.out.println("d = " + d);
         System.out.println("e = " + e);

        char[] text = {'b', 'a','r','e','v'};
        int key = (5 << 4) | 5;
        ArrayUtil.print(text);
        encrypt1(text,key);
        ArrayUtil.print(text);
        encrypt1(text,key);
        ArrayUtil.print(text);
        encrypt1(text,key);
    }

    public static void encrypt1(char[] original, int key){

        for(int i = 0; i < original.length; i++){
            original[i] ^= key;
        }


    }



}
