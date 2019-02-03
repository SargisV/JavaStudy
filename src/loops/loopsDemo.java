package loops;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by nane on 4/28/18.
 */
public class loopsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a number: ");
        int month  = scanner.nextInt();
        calendar(month);
        calendarBySwitchCase(4);

    }

    static void controlStatmentsDemo () {
        int grade = new Random().nextInt() % 6 + 1;
        switch(grade){
            case 25:
            case 26:
            case 27:
            case 28:
                //todo something
                double a = 1;
                break;
            case 50:
                a = 12;
                a++;
                //todo something
                break;
            default:
                System.out.println("Default");


        }

        if(grade < 25){
            System.out.println("Bad");
        } else if(grade < 50){
            System.out.println("Sufficient");
        } else if(grade < 75){
            System.out.println("Good");
        } else if(grade <= 100){
            System.out.println("Excellent");
        } else {
            System.out.println("Incorrect value");
        }
    }

    static void sampleSwitch(){
        for(int i = 0; i < 6; i++){

            switch(i){
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greater then 3");
            }
        }


    }

    static void calendar(int month) {

        String[] months = {"Jan", "Feb", "March", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        String season;

        //??????????pg80
        if ( month == 12 || month == 1 || month == 2) {
            season = "Winter";
        }
        else if (month == 3 || month == 4 || month == 5){
            season = "Spring";
            }
        else if (month == 6 || month == 7 || month == 8 ){
            season = "Summer";
        }
        else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        }
        else season = "fake month";

        if( month > 0 && month < 13) {
            System.out.println("The " + months[month -1] + " is in the " + season + "."  );
        } else {
            System.out.println("The " + month + " is a " + season + "."  );
        }

    }
    static void calendarBySwitchCase(int month) {
        String season;
        switch(month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                System.out.println("The month is in " + season);
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                System.out.println("The month is in " + season);
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                System.out.println("The month is in " + season);
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                System.out.println("The month is in 1 " + season);
                break;
            default:
                System.out.println("The month is fake");
        }

    }


}
