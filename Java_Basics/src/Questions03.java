//    Take a number as input and print the multiplication table for it.

import java.util.Scanner;
public class Questions03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        System.out.println("The MultiplicationTable is => ");
        for(int i=1;i<=10;i++){
            int res = num*i;
            System.out.print(res+" ");
        }
    }
}
