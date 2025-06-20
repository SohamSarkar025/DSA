public class PrimeNo {
    public static void main(String[] args) {
        int n = 5;
        boolean res = isPrime(n);
        System.out.println(res);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
