public class oddOrEven {
    //bitwise check
    public static void oddoreven(int n){
        int bit =1;
        if((n & bit) == 0){
           System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(4);
        oddoreven(9);
        oddoreven(1);
    }
    
}
