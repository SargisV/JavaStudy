package before.draft;

/**
 * Created by nane on 9/9/18.
 */
public class Practice {

    public static void main(String[] args) {
        leftUpTriangle(4);
        triangle(4);
        int[] a = {7,8,2,1,6,1,5,8,4,68,47,5,2 };
        printArray(a);
        sortByEvenOdd(a);
        printArray(a);
    }

    public static void leftUpTriangle (int length) {

        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void triangle (int length) {

        for(int i = 0; i < length; i++){
            int j = length - 1;
            for(; j > i; j--){
                System.out.print(" ");
            }
            for(; j >= 0; j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

//    public static void sortByEvenOdd (int[] a) {
//        for(int i = 0; i < a.length - 2; i++){
//           int j = i + 1;
//            while ((a[i] + a[j]) % 2 == 0) {
//                j++;
//                if (j >= a.length){
//                    return;
//                }
//            }
//            if(j != i + 1) {
//                swap(i + 1, j, a);
//            }
//        }
//
//
//    }
//
//    public static void swap (int i, int j, int[] a) {
//        int k = a[i];
//        a[i] = a[j];
//        a[j] = k;
//    }
//
//    public static void printArray(int[] a) {
//        for(int i = 0; i < a.length; i++){
//            System.out.print(" " + a[i]);
//        }
//        System.out.println();
//    }

    public static void sortByEvenOdd (int [] a) {

        for (int i = 0; i < a.length - 2; i++) {
            int j = i + 1;
            while ((a[i] + a[j]) % 2 == 0) {
                j++;
                if (j >= a.length) {
                    return;
                }
            }
            if (j != i + 1) {
                swap(i + 1, j, a);
            }
        }
    }

        public static void swap (int i, int j, int[] a){

            int k = a[i];
            a[i] = a[j];
            a[j] = k;
        }

        public static void printArray (int[] a){
            for (int i = 0; i < a.length; i++){
                System.out.print(" " + a[i]);
            }
            System.out.println();
        }
    }

