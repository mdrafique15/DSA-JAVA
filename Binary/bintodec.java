import java.util.Scanner;

//import java.text.DecimalFormat;

public class bintodec {
    public static void binarytoDecimal(int binNUm){
    int pow =0;
    int num = binNUm;
    int decNum =0;
    while(binNUm>0){
        int lastdigit = binNUm % 10;
        decNum = decNum +(lastdigit * (int)Math.pow(2, pow)); 
        pow++;
        binNUm = binNUm/10;

    }
    System.out.println("binary number "+num+" is converted as decimal : "+decNum);
   // return decNum;
    }
    public static void main(String[] args) {
        
        binarytoDecimal(111);
    }
    
}
