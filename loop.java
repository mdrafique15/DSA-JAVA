import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class loop { public static void main(String[] args) {
    
    System.out.println("enter the number to sum");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int sum = 0;

    for(int x=0; x <=a;x++){
    sum = sum + x;
    
    }
    System.out.print("Sum of first natural number:"+sum);
}
    
    
}
