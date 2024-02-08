public class freindsPairing {
    public static int frndPair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //single pair
        int singlepair = frndPair(n-1);

        //dobule pair
       // int fnm2 = frndPair(n-2);
       //when two people pair in a party, if 
        int doublepair = (n-1) * frndPair(n-2);

        //total ways
        int totalways = singlepair + doublepair;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(  frndPair(3));
      
    }
    
}
