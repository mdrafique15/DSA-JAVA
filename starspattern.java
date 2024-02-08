public class starspattern {
    public static void main(String[] args) {
        int i,j = 1;
        //int j = 0;
        for(i=1;i<=4;i--)
        {

            for(j=1 ;j<=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
