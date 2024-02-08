import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //   for(int i=0;i<=4;i++){
    //     System.out.println("Enter the digit:");
    //      int x = sc.nextInt();
    //      int y = x;
    //      System.out.println(y);
    //  }
    int sum = 0;
    System.out.print("Enter the 5 digit:");
    for(int i=0;i<4;i++){
        //int x = sc.nextInt();
        int num = sc.nextInt();
           // sum +=  num;
           sum = sum + num;
        
    }
   System.out.println(sum);
}
}
