import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        System.out.println("Enter the table number:");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int mult = 0;
        System.out.println("Table of "+x+" is : ");
        for(int i=1; i<=10; i++){
          mult = i*x ;
          System.out.println(x+" * "+ i + " = "+mult);
        }
        

    }
    
}
