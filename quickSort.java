public class quickSort {
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void quickSort(int arr[], int s, int e) {
        //base case
        
        if(s>=e){
            return;
        }
        int pindex = partition(arr, s, e);
        //left part
        quickSort(arr, s, pindex-1);
        //right part
        quickSort(arr, pindex+1,e);
        
    }
    public static int partition(int arr[], int s, int e) {
        int pivot = arr[e];

        //to make space for elements smaller than pivot 
        int i = s-1; //initialise i from -1
        for(int j=s;j<e;j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;
            }
        }
        // pivot in the right place
                 i++;
                //swap
                int temp = pivot;
                arr[e]= arr[i];
                arr[i] = temp;
                return i;

    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,5,2,5,7,9}; 
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
