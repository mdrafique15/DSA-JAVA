public class DectoBin {
    public static void binary(int n){
        int mynum = n;
        int pow = 0;
        int binaryNum = 0;
        while(n>0){
            int rem = n%2;
            binaryNum = binaryNum + (rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary number of "+n +" is :" + binaryNum);
    }
    public static void main(String[] args) {
        binary(11);
    }
    
}
