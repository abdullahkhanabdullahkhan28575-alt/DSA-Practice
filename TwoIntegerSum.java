public class TwoIntegerSum {
     public static int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j]==target){
                    return new int [] {i+1 , j+1};
                }
            }
        }
        return new int []{0};
        
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,8};
        int target=3;
        int result[]=twoSum(numbers, target);
        System.out.println(java.util.Arrays.toString(result));
    }
    
}
