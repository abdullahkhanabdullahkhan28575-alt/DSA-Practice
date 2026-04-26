import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
     public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char [] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted=new String (charArray);
            res.putIfAbsent(sorted,new ArrayList<>());
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());

        
    }
    public static void main(String[] args) {
        String str[]={"act","pots","tops","cat","stop","hat"};
        List<List<String>> result=groupAnagrams(str);
        System.out.println(result);
    }
    
}
