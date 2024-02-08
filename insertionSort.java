import java.util.Arrays;
public class insertionSort {
    public static void InsertionnSort(int arr[]){
     for(int i=1;i<arr.length;i++){
        //temporary variable to store the value of 1st element of unsorted part of arr
        // to be sorted 
        int key = arr[i]; //element =4 (unsorted part at index =1(i))
        int j = i-1;  //element = 3 (sorted part at index = 0)

        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
       }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,4,8,4,5,1,2,9};
        //InsertionnSort(arr);
        Arrays.sort(arr);
        printArr(arr);

    }
}
