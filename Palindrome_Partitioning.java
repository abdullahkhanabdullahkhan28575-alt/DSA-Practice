import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome_Partitioning
 */
public class Palindrome_Partitioning {
     public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(s, 0,new ArrayList(),result);
        return result;
        
        
    }
    public void backtrack(String s , int start,List<String>current, List<List<String>>result){
        if(start==s.length()){
            result.add(new ArrayList<>(current));
            return ;

        }
        for(int end=start; end<s.length(); end++){
            String part=s.substring(start,end+1);
            if(isPalindrome(part)){
                current.add(part);
                backtrack(s,end+1,current,result);
                current.remove(current.size()-1);

            }

        }
    }
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;

            }
            left++;
            right--;

        }
        return true;
    }

    
}