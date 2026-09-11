public class Container_With_Most_Water {
    public  static int maxArea(int[] heights) {
       int maxWater=0;
       int lp=0, rp=heights.length-1;
       while(lp<rp){
        int w=rp-lp;
        int ht=Math.min(heights[lp],heights[rp]);
        int currWater=w*ht;
        maxWater=Math.max(maxWater, currWater );
      if(heights[lp]<=heights[rp]){
        lp++;

      }  else{ 
        rp--;
      }
       }
       return maxWater;
        
    }
    public static void main(String[] args) {
        int arr[]={1,6,5,6,7,6};
       System.out.println(maxArea(arr));

    }
    
}
