import java.util.Scanner;

public class fact {
    
        public static double Factorial(Double n){

        double fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
       
        System.out.println(fact);
        return fact;
        }
        public static void main(String[] args) {
            System.out.println("enter Number:");
            Scanner s = new Scanner(System.in);
            double n = s.nextDouble();
            double fac=Factorial(n);
            //System.out.println(fac);
            

        }
    }
    

