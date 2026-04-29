public class ProductsArrayExceptSelf {
     public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int rev []=new int [n];
        rev[0]=1;
        for(int i=1; i<n; i++){
            rev[i]=rev[i-1]*nums[i-1];

        }
        int right=1;
        for(int i=n-1; i>=0; i--){
            rev[i]=rev[i]*right;
            right*=nums[i];

        }
       return rev;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int result[]=productExceptSelf(arr);
        System.out.println("ProductsArray :"+ java .util.Arrays.toString(result));
    }
    
}
