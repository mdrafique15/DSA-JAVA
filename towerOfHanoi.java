import javax.print.attribute.standard.Destination;

public class towerOfHanoi {
    public static void towerOfhanoi(int n, String src, String helper, String dest) {
        //base case
        if(n==1){
            System.out.println("Transfer of disk " + n + " from " + src+" to " + helper);
        
            return;
        }
        //transfer of n-1 disk into helper tower from source tower
        towerOfhanoi(n-1, src, dest, helper);
        System.out.println("Transfer of disk " + n + " from " + src+" to " + helper);
        
        //transfer of n-1 disk from helper to destination tower using src as helper
       towerOfhanoi(n-1, helper, src, dest);
       //System.out.println("Transfer of disk"+n+"from"+helper+"to"+dest);

    }
    public static void main(String[] args) {
        int n = 3;
     towerOfhanoi(n, "S", "H", "D");
    }
    
}
