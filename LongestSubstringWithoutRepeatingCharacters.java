import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public  static int lengthOfLongestSubstring(String s) {
    

        int rev =0;


        for(int i=0; i<s.length(); i++){
            Set<Character> charset=new HashSet();

            for(int j=i; j<s.length(); j++){
                if(charset.contains(s.charAt(j))){
                    break;
                }
                charset.add(s.charAt(j));


            }
            rev=Math.max(rev,charset.size());
        }
        return rev;
        
    }
    public static void main(String[] args) {
    String s="xxxyz";
    System.out.println(lengthOfLongestSubstring(s));
    }
    }


    

