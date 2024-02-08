public class tilingPorblem {
    public static int tilingPorb(int n) //tile size 2*n
     {
        //base case
        if(n==0 || n==1){
            return 1;
        }
    //horizontal 
    int horizontalTiling = tilingPorb(n-2);

    //vertical tiling
    int verticalTiling = tilingPorb(n-1);
    //total ways to set tiles
    int totalWays = verticalTiling + horizontalTiling;
    return totalWays;
        
    }
    public static void main(String[] args) {
        System.out.println("total ways to put tiles : " + tilingPorb(5));
    }
    
}
