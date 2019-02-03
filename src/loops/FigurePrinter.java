package loops;


import java.util.Scanner;

public class FigurePrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a number as a size of figure: ");
        int n = scanner.nextInt();
//        drawLeftUpTriangle(n);

       drawRightUpTriangle(n);
//        drawLeftBottomTriangle(n);
//        drawRightBottomTriangle(n);
//        drawRhombus(n);
//        drawEmptyRectangle(n);
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *       *
     *     * *
     *   * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++){
            int j = length - 1;
            for(; j > i; j--){
                System.out.print(" ");
            }
            for(; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for(int i = length; i > 0 ; i--){
            for(int j = i; j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
       * * * *
         * * *
           * *
             *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        for(int i = 0; i < length; i++){

            printSubRow(i , " ");
            printSubRow(length - i , " *");
            System.out.println();
        }

    }

    static void printRow (int count, String chars){
        printSubRow(count,chars);
        System.out.println();

    }
    static void printSubRow (int count, String chars){
        for (int i = 0; i < count; i++) {
            System.out.print(chars);
        }
    }
    static void printEmptyRow (int length, String chars){
        System.out.print("*");
        for(int i = 0; i < length - 2; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     *     *
     *    * *
     *   * * *
     *  * * * *
     *   * * *
     *    * *
     *     *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {


        for (int i = 0; i < length; i++){
//            int j = 0;
//            for(; j < i; j++){
//                System.out.print(" ");
//            }
//            for(; j >=0; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
        }

        for (int i = 0; i < length; i++){
            int j = 0;
            for(; j < length - i - 1; j++){
                System.out.print(" ");
            }
            for(; j < length; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i = 0; i < length; i++){
            printSubRow(i+1 , " ");
            printSubRow(length - i - 1 , " *");
            System.out.println();
        }
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * *     *
     * *     *
     * * * * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawEmptyRectangle(int length) {
        printRow(length , "*");
        for(int i = 0; i < length-2; i++){
            printEmptyRow(length , " ");
        }
        printRow(length , "*");

        // TODO : complete the method
    }
}
