public class BestTimeToBuyAndSell {

    
    public  static int maxProfit(int[] prices) {
        int res=0;
        for(int i=0; i<prices.length;i++){
            int by=prices[i];
            for(int j=i+1; j<prices.length; j++){
                int sel=prices[j];
                res=Math.max(res,sel-by);
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,5,1,7};
        int result=maxProfit(arr);
        System.out.println(result);
    }
}

