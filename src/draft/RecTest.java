package draft;

/**
 * Created by nane on 11/24/18.
 */
public class RecTest {
    int values [];

    RecTest(int i){
        values = new int[i];
    }

    void printArray(int i){
        if(i == 0) return;
        else
            printArray(i - 1);
        System.out.println("[" + values[i - 1] + "]" + values[i - 1]);
    }

   static public class RecTest1 {
        int values [];

        RecTest1(int i){
            values = new int[i];
        }

        void printArray1(int i){
            if(i < values.length) {

                printArray1(i + 1);
                System.out.println("[values[" + i + "]  = " + values[i]);
            }
        }

    }

    public class NonStaticClass {
         int y;


    }
}

class Factorial {

    int fact(int n){
        int result;

        if(n==1) return n;
        else
            result = fact(n - 1) * n;
        return result;
    }
}

class RecTest2{
    public static void main(String args[]){
        RecTest.RecTest1 o = new RecTest.RecTest1(1);
        RecTest recTest = new RecTest(2);

        RecTest.NonStaticClass o1 = recTest.new NonStaticClass();

        Factorial f = new Factorial();

        System.out.println("Factorial of 4 is " + f.fact(4));

        RecTest ob = new RecTest(3);
        int i;

        for(i = 0; i < 3; i++){
            ob.values[i] = i;
        }

//        ob.printArray(10);

        RecTest.RecTest1 ob1 = new RecTest.RecTest1(3);

        for(i = 2; i >= 0; i-- ){
            ob1.values[i] = i;
        }

        ob1.printArray1(0);
    }
}
