public class StringSubset {
    public static void findSubstring(String str, String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //yes choice
        findSubstring(str, ans+str.charAt(i), i+1);
        //no choice
        findSubstring(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubstring(str, "", 0);
    }
}
