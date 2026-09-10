public class Two_Integer_Sum__II {
   public  static  int[] twoSum(int arr[], int target){
    int l=0, r=arr.length-1;
    while (l<r) {
        int sum=arr[l]+arr[r];
        if(sum<target){
            l++;
        }
        else if(sum>target){
            r--;
        }
        else{
            return new int []{l+1, r+1};
        }
        
    }
    return  new int []{0};
    

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum[]=twoSum(arr, 3);
        for (int i : sum) {
            
            System.out.print(i+" ");
        }

    }
    
}
