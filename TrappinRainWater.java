public class TrappinRainWater {
    
    public static int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;

        }
        int n=height.length;
        int res=0;
        for(int i=0; i<n; i++){
            int leftMax=height[i];
            int rightMax=height[i];
            for(int j=0; j<i; j++){
                leftMax=Math.max(leftMax,height[j]);

            }
            for(int j=i+1; j<n; j++){
                rightMax=Math.max(rightMax, height[j]);

            }
            res+=Math.min(leftMax,rightMax)-height[i];

        }
        return res;

        
    }

public static void main(String[] args) {
    int arr[]={1,2,0,3,2,3,3};
    System.out.println(trap(arr));
}
    
}
