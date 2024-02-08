

public class reverseArray {
    public static void reversearr(int num[]){
      int first = 0;
      int last = num.length-1;
      while(first<last){
        //int temp =0;
        int temp= num[first];
        num[first]= num[last];
        num[last]= temp;
        first++;
        last--;
      }
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,8,9};
        reversearr(num);
        //System.out.println("reversed: "+ reversearr(num););
        for(int i=0;i<num.length;i++){
            System.out.print(" "+num[i]);
        }
            System.out.println();
    }   
}
