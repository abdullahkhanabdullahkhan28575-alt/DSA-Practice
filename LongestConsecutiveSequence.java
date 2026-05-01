import java.util.HashSet;

public class LongestConsecutiveSequence {
      public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int num :nums){
            set.add(num);

        }
        int maxLength=0;
        for(int num :set){

    if(!set.contains(num-1)){
        int currentNum=num;
        int count=1;
    

    while(set.contains(currentNum+1)){
        currentNum++;
        count++;
    }
    maxLength=Math.max(maxLength,count);
    }
} 
return maxLength;       
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,8,4,5};
        System.out.println(longestConsecutive(nums));
    }
    
}
