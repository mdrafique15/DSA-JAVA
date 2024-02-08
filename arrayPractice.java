
import java.util.*;
public class arrayPractice {
    // public static int getLargest(int number[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0;i<number.length;i++){
    //         if(largest<number[i]){
    //             largest=number[i];
    //         }
    //     }
    //     return largest;
    // }
    
    public static void pairs(int number[]){

        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.println("("+ curr + "," + number[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,8,9};
        //System.out.println(getLargest(num));
        pairs(num);
    }
    
}
