import java.util.Scanner;

public class average {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st number:");

    int x = sc.nextInt();
    System.out.println("Enter thr 2nd number:");
    int y = sc.nextInt();
    
    System.out.println("Enter thr 3nd number:");
    int z = sc.nextInt();
   
    System.out.println("the average is: "+averagen(x, y, z));
       // int avg = (x+y+z)/3;
        //System.out.println("average is: "+avg);

}
public static int averagen(int x, int y, int z){
    return ((x+y+z)/3);
}
    
    
}

    

