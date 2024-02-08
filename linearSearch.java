import java.util.*;

public class linearSearch {
    public static int linearsearch(int num[], int key) {
      for(int i=0;i<=num.length;i++){
        if(num[i]==key){
            return i;
        }
      }
      return -1;
    } 
    public static void main(String[] args) {
        int num[]={2,5,4,7,8,22,12};
        int key = 22;
        int index = linearsearch(num, key);
         if(index==-1){
            System.out.println("not found");
         }else{
            System.out.println("key is at index "+index);
         }
    
    }
}
