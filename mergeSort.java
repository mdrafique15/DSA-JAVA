public class mergeSort {
   
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void mergeSortt(int arr[], int s, int e) {

        int mid = s + (e-s)/2;
        //base case
        if(s>=e){
            return;
        }
        //left part
        mergeSortt(arr, s, mid);

        //right part
        mergeSortt(arr, mid+1, e);
        //merge
        merge(arr,s ,mid , e);

    }
    public static void merge(int arr[],int s,int mid,int e) {
       
        //creating a new temp array
        int temp [] = new int[e-s+1];
        //iterators
        int i = s;           //iterator for left part
        int j = mid+1;      //iterator for right 
        int k = 0;         //iterator for temp

        while(i <= mid && j <= e){
             if(arr[i] < arr[j]){
              temp[k] = arr[i];
              i++;
             }else{
              temp[k] = arr[j];
              j++;
             }
             k++;
        }
        //part left after the loop
        //print => array
        
        //left part
        while(i <= mid){
          temp[k++]= arr[i++];
        }
      //right part
      while(j <= e){
          temp[k++]= arr[j++];
        }
        //copy temp array -> element to original array
        for(k=0,i=s; k<temp.length; k++,i++){
          arr[i] = temp[k];
        }
      }
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,5,2,5,7,9};   
        mergeSortt(arr, 0, arr.length-1);  
        printArr(arr);
    }
}
