import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0); 

        //System.out.println(reverseString);
        
    }
        public void reverseString(char[] s) {
            int left = 0;
       int end = s.length-1;
       while (left < end) {
          //swap
          char temp = s[left];
          s[left] = s[end];
          s[end] = temp;
          
          left ++;
          end --;
        }
    }
    }
    

