import java.util.*;
public class largestArray {
    public static int largestNumber(int num[]){
       
      //  int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest = num[i];
            }

        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[] = {3,2,6,7,9,4,2,20};
        
       System.out.println("smallest value is:"+largestNumber(num));
        
    }
    
}
