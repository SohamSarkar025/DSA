import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter a number: ");
        int b = in.nextInt();
        int result = a+b;
        System.out.println("The Result is:"+result);
    }
}
