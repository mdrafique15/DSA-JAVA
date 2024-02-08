public class recPower {
    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        //return x * power(x, n-1);

        //another method (variables)
        int pnm1 = power(x, n-1);
        int powerr = x * pnm1;
        return powerr;

    }
    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }
    
}
/*optimised power function
int halfpower = power(x,n/2);
for even:
int halfpowersq = halfpower * halfpower;

for odd:
if(n%2!=0){
   halfpowersq  = x * halfpowersq;
}
return halfpowersq;

 */