import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort{
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Integer arr[]={3,5,2,6,1,9};
      // Increasing Order 
      // package = java.util.Arrays;
        // Arrays.sort(arr,0,5);
        // printarr(arr);

     //Decreasing Order
     //package = java.util.Collections

     Arrays.sort(arr, 0, 6, Collections.reverseOrder());
     printarr(arr);

    }
}