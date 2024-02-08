//recursion
public class fibonacciSum {
    public static int fibSum(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fibSum(n-1);
        int fnm2 = fibSum(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fibSum(25));
        
    }
    
}
