package before.loops;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by nane on 5/17/18.
 */
public class Practice {

    public static void main(String[] args) {
        rhombus(5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
        int i = scanner.nextInt();
        leftUpTriangle(i);
        System.out.println("Here is your triangle");
        rightUpTriangle(i);
        System.out.println();
        rigthBottomTriangle(i);
        System.out.println();
        rhombus(i);
    }

    static void subRow(int count, String chars){
        for(int i = 0; i < count; i++){
            System.out.print(chars);
        }
    }

    public static void leftUpTriangle(int length){
        for(int i = 0; i <= length; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void rightUpTriangle(int length){
       for(int i = 0; i < length; i++){
           int j = length - 1;
           for(; j > i; j--){
               System.out.print("  ");
           }
           for(j = 0; j <= i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }

    public static void rigthBottomTriangle (int length){
        for(int i = 0; i < length; i++){
            int j = 0;
            for(; j < i; j++){
                System.out.print("  ");
            }
            for(j = length -i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int length){
        if(length % 2 == 0){
            JOptionPane.showMessageDialog(null, "Incorrect length of the rombus","ERROR", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int i;
        int halfLen = length / 2;
        for(i = 0; i <= halfLen; i++){
            subRow(halfLen-i,"  ");
            printRow(2*i + 1," *");
            //TODO print spases and *
        }

        for(int j = 1;j <= halfLen; j++){
            subRow(j,"  ");
            printRow(length - 2 * j, " *");
        }
    }

    static void printRow (int count, String chars){
        subRow(count,chars);
        System.out.println();

    }
}
