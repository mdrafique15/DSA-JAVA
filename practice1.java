public class practice1 {
    public static int binarySearch(int num[],int key){
      int start = 0;
      int end = num.length-1;
      while(start<=end){
        int mid = (start+end)/2;
        if(num[mid]==key){
            return mid;
        }
        if(num[mid]<key){
            start = mid+1;
        }else{
            end = mid-1;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        int num[]={3,6,8,9,11,23,35,56};
        int key=23;
        System.out.println("binary search element is at index: "+ binarySearch(num, key));
    }
    
}
