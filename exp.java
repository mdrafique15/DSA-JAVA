public class exp {

    
    public static int subsequence(String str,int index, String newString) {
        
        if(index==str.length()){
            //int length=0;
            System.out.println(newString);
            
        }
        
        char currChar = str.charAt(index);
        //to be print 
        subsequence(str, index+1, newString+currChar);
      
        subsequence(str, index+1, newString);
        return newString.length();
    }
    public static void main(String[] args) {
        //String str = "abc";
        subsequence("abc", 0, "");
//return str.length();
       
    }
   

    
}
