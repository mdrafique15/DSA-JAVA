public class trappedWater {
    public static int trapwater(int height[]){
        
        int n = height.length;
      //left max boundary
      int leftMax[] = new int[n];
      leftMax[0] = height[0];
      for(int i=1; i<n;i++){
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
      }

     //right max boundary
     int rightMax[] = new int[n];
     rightMax[n-1] = height[n-1];
     for(int i = n-2;i>=0;i--){
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
     }
     //trapwater
     // trap rainwater contains rainwater in the building
     int trappedWaterr = 0;
     for(int i=0;i<n;i++){
        //water level = min(left max , right max)
        int waterlevel = Math.min(leftMax[i], rightMax[i]);

        //trap water = water level - height
        trappedWaterr += waterlevel - height[i];
     }
    return trappedWaterr;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,9};
        System.out.println(trapwater(height));
    }
    
}
