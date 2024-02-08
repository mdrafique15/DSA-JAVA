import java.util.*;
public class binarySearch {
    public static int binsearch(int num[],int key){
        //int key = 11;
        int start =0;
        int end = num.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }      }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,7,8,11,16,76};
        int key = 11;
        System.out.println("binary search for index: "+binsearch(num, key));

    }
    
}
