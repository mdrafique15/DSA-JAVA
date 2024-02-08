public class selectionSort {
    public static void SelectionSortt(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPosition = i;
            for(int j = i+1; j<arr.length;j++){
               if(arr[minPosition]>arr[j]){
                 minPosition = j;
               }
            }
            //swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }  
        System.out.println();
      }
    public static void main(String[] args) {
        int arr[]={5,2,3,6,7,1,4};
        SelectionSortt(arr);
        printarr(arr);
    }
    
}
