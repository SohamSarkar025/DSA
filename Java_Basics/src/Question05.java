//    Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter a number or Press 'X' to Exit:");
            String val = in.next();
            if(val.equalsIgnoreCase("x")){
                System.out.println("Exiting");
                break;
            }
            else{
                int num = Integer.parseInt(val);
                sum += num;
            }
        }
        System.out.println("Result: "+sum);
    }
}


//Using Try Catch Block
//import java.util.Scanner;
//
//public class Question05 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter a number or Press 'X' to Exit:");
//            String val = in.next();
//
//            if (val.equalsIgnoreCase("x")) {
//                System.out.println("Exiting");
//                break;
//            }
//
//            try {
//                int num = Integer.parseInt(val);
//                sum += num;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid number.");
//            }
//        }
//
//        System.out.println("Result: " + sum);
//    }
//}
