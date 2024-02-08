public class digitConversion {
    
    static String digits[] = {"zero", "one", "two", 
    "three", "four", "five","six","seven","eight","nine"}; 
    
    public static void convertDigit(int num){
    //base case
      if(num==0){
        return;
      }
      int lastDigit = num % 10;
      convertDigit(num/10);
      System.out.print(digits[lastDigit]+" ");
    }
    
    public static void main(String[] args) {
        convertDigit(2010);
    }
    
}
