import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    
    public static int characterReplacement(String s, int k) {
        int rev=0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character , Integer> count=new HashMap<>();
            int maxf=0;
            for(int j=i; j<s.length(); j++){
                count.put(s.charAt(j),
                count.getOrDefault(s.charAt(j),0) +1);
                maxf=Math.max(maxf,count.get(s.charAt(j)));
                if((j-i+1)-maxf<=k){
                    rev=Math.max(rev,j-i+1);

                }
            }
        }
        return rev;
        
    }
    public static void main(String[] args) {
        String str="xxyxx";
        int k=1;
        System.out.println(characterReplacement(str, k));
        
    }
}

