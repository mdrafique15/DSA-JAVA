import java.util.Scanner;
public class halfpyramid {
    public static void main(String[] args) {
        System.out.print("Enter the desire star number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       // int m=4;        
        for(int i = 1; i<=n; i++){

            for(int j=1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    
}
