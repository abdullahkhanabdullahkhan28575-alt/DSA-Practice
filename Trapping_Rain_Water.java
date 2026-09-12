public class Trapping_Rain_Water {
     public int trap(int[] height) {
        int res=0;
        if(height==null || height.length==0){
            return 0;
        }
            int l=0; int r=height.length-1;
            int leftmax=height[l]; int  rightmax=height[r];
            while(l<r){
                if(leftmax<rightmax){
                    l++;
                    leftmax=Math.max(leftmax,height[l]);

                    res+=leftmax-height[l];

                }else{
                    r--;
                    rightmax=Math.max(rightmax, height[r]);
                    res+=rightmax-height[r];

                }
            }
            return res;

        
        }
    
}
