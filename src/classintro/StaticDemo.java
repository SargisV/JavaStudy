package classintro;

/**
 * Created by nane on 12/1/18.
 */
public class StaticDemo {

    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = o;
        System.out.println(o.equals(o1));
        System.out.println(o);


        new Outer(10);

        Outer outer = new Outer(4);
        System.out.println("nonStat = " + outer.nonStat);
        System.out.println("stat = " + Outer.stat);
    }

}


class Outer {
    int nonStat = 1;
    static int stat;

    static {
        stat = 20;
        Nested nested = new Nested();
    }

    public Outer(int nonStat) {
        this.nonStat = nonStat;
        Nested nested = new Nested();
    }

    static class Nested {
        static int nestStat = 1;

        int nestNotStat = 2;


    }
}