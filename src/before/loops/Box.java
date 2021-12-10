package before.loops;

/**
 * Created by nane on 5/12/18.
 */
public class Box {
    double width = 10;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        if (width >= 0) {
            this.width = width;
        }
        if(height >= 0) {
            this.height = height;
        }
        if(depth >= 0) {
            this.depth = depth;
        }
    }


    public Box() {
    }

    Box(Box origin) { //constructor for the first(original) values
        this.width = origin.width;
        height = origin.height;
        depth = origin.depth;
    }

    public double volume() {

        return this.width * height * depth;
    }
}


class BoxDemo {
    public static void main(String args[]) {

        Box mybox1 = null;
        mybox1.volume();
        mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;


        mybox2.volume();
    }


//    public static void main (String args []){
//        int a = 4;
//
//        Box box = new Box(1, 2, 3);
//        Box mybox = new Box(box);
//        box.width = 1000;
//        System.out.println(mybox.width);
//        System.out.println(box.width);
//        Box mybox1 = mybox;
//        int b = a;
//
//
//        System.out.println(mybox == mybox1);
//        double vol;
//
//        mybox.width = 10;
//        mybox.height = 20;
//        mybox.depth = 15;
//
////        vol = mybox.width * mybox.height * mybox.depth;
//        System.out.println("Volume is " + mybox.volume());
//
//        Box mybox2 = new Box();
//        double vol1;
//
//        mybox2.width = 12;
//
//
//    }


}
