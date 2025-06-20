public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234636;

        int res = reverse(num);
        System.out.println(res);
    }
    static int reverse(int num){
        int sum =0;
        while(num>0){
            int rem = num %10;
            sum = (sum*10)+rem;
            num /= 10;
        }
        return sum;
    }
}
