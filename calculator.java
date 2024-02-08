import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number ::");
        int a = sc.nextInt();
        System.out.println("Enter value of 2nd number ::");
      int b = sc.nextInt();

      System.out.println("Select operation");
      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
      char ch = sc.next().charAt(0);

      switch(ch) {
        case 'a':
         System.out.println("Sum of the given two numbers: "+(a+b));
        break;
        case 's' :
         System.out.println("Difference between the two numbers: "+(a-b));
         break;
        case 'm' :
         System.out.println("Product"+(a*b));
        break;

      }
      
    }
}
