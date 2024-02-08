public class searchTarget {
    public static int searchTarget(int nums[], int left, int right,int target){
        
        //target = 0;
        int l = left;
        int r = right;
         while(l<=r){
            int mid = 1+(r-1)/2;
            if(nums[mid]==target){
                return mid;

            }else if(nums[mid]>target){
               r = mid -1;
            }
            else{
                l = mid+1;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        System.out.println("hello");
        System.out.println("target = "+searchTarget(nums, 0, 0, 1));
       //searchTarget(nums, 0, 0, 0);
    }
    
}
