public class bubblesort {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1;turn++){
            //int swap = 0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                   // System.out.println(swap);
                }
            }
            //System.out.println(swap);
        }
    }
    //to print array
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2,6};
    
        bubbleSort(arr);
        printarr(arr);
    }
    
}
