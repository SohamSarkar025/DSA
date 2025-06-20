import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Insertion of an 1D array
        System.out.println("Enter the array: ");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

