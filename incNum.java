public class incNum {
    public static void increaseNum(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increaseNum(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n =10;
        increaseNum(n);
    }
    
}
