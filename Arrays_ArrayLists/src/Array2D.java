import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        //Using For Loop
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        //Using Arrays.toString() Method
       for(int i=0;i<arr.length;i++){
           System.out.println(Arrays.toString(arr[i]));
       }

       //Using Enhance For loop
       for(int[] ints : arr){
           System.out.println(Arrays.toString(ints));
       }
    }
}
