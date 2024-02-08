public class duplicateArray {
    public static boolean duplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j< nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int nums[] = {3,4,0,6,5,8};
        //duplicate(nums);
        System.out.println(duplicate(nums));
    }
    
}
