//    Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = in.nextInt();
        System.out.print("Enter another number:");
        int b = in.nextInt();
        int tempA =a;
        int tempB =b;
        while(b!=0){
            int temp=b;
            b=b%a;
            a=temp;
        }
        int hcf=a;
        int lcm=(tempA*tempB)/hcf;
        System.out.println("HCF: "+hcf+"\nLCM: "+lcm);
    }
}
