import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> res=new ArrayList<>();
        res.add("");
        String digittochar[]={"","","abc","def","ghi","jkl","mno","qprs","tuv","wxyz"};
        for(char digit:digits.toCharArray()){
            List<String>tmp=new ArrayList<>();
            for(String curser:res){

            for(char c:digittochar[digit-'0'].toCharArray()){
             tmp.add(curser+c);
            }

            }
            res=tmp;
        }
        return res;
        
    }
    
}
