//Input a year and find whether it is a leap year or not.


import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+" is a leap year!");
        }else{
            System.out.println(year+" is not leap year!");
        }
    }
}
