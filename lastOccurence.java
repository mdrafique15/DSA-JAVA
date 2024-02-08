//recursion 
public class lastOccurence {
    public static int lastOcc(int arr[], int key, int i) {
       if(i==arr.length){
        return -1;
       }
        //check for the forward except the current index
       int isFound = lastOcc(arr, key, i+1);
       if(isFound==-1 && arr[i]==key){
        return i;
       }
       return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,8,6,8,6,9};
        System.out.println(lastOcc(arr, 6, 0));
    }
    
}
