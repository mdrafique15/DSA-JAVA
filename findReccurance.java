public class findReccurance {
    public static void findRecc(int arr[],int key , int i ) {
        //base case
        if(i == arr.length){
            return ;
        }
       if(arr[i]==key){
        System.out.print(i+" ");
        
       }

       findRecc(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {0,3,2,4,6,2,4,2,5,2,4,3,2,3};
        int key = 2;
        findRecc(arr, key, 0);

    }
    
}
