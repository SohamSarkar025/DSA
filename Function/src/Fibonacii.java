public class Fibonacii {
    public static void main(String[] args) {

        int n = 10;

        int a = 0;
        int b = 1;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int temp =b;
            b=a+b;
            a=temp;
        }
    }
}
