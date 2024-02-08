public class maxSumofSubarray {
    public static void maxSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum =0;
                for(int k=start;k<=end;k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum:" + maxSum);
    }
    

    public static void main(String[] args) {
         int arr[] = {2,3,4,5,6,7};
         maxSum(arr);
    }
    
}
