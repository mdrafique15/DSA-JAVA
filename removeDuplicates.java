public class removeDuplicates {
    public static void removeDuplicate(String str,int index,StringBuilder newStr, boolean map[]) {
        //base case
        if(index==str.length()){
            System.out.print(newStr);
            return;
        }
        //work
        char currChar = str.charAt(index);
        if(map[currChar-'a']==true){
            removeDuplicate(str, index+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicate(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnnacollege";
        //(str, 0,new StringBuilder(""), new boolean[26]);
        removeDuplicate(str,0, new StringBuilder(""), new boolean[26]);
    }
    
}
