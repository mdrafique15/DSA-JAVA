public class SortedArray {
    public static boolean sortedArr(int arr[], int i) {

        if(i==arr.length-1){
          return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return sortedArr(arr, i+1);
    }
 public static void main(String[] args) {
    int arr[] = {1,3,8,6,8,9};
    System.out.println(sortedArr(arr, 0));
 }
}
