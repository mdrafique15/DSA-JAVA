import javax.swing.event.ChangeEvent;

public class BacktrackArray {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[], int idx,int value) {
        //base case
        if(idx == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[idx] = value;
        changeArr(arr, idx+1, value+1);
        //backtrack
        arr[idx]=arr[idx]-1;

    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        changeArr(arr, 0,01);
        printArr(arr);

    }
    
}
