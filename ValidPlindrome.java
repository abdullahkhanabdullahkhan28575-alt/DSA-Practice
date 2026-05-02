import java .util.*;
public class ValidPlindrome {
     public  boolean isPalindrome(String s) {
        
        int l=0, r=s.length()-1;
        while (l < r){
            while( l< r && !alphaNum(s.charAt(l)))
            l++;
            while(l < r && !alphaNum(s.charAt(r)))
            r--;
            if(Character.toLowerCase(s.charAt(l))
                 !=Character.toLowerCase(s.charAt(r))){
                return false;
            }
                l++;
                r--;
        }
        return true;
    }
        public boolean alphaNum(char c){
            return (c>='A' && c<='Z'||
                    c>='a' && c<='z'||
                    c>='0' && c<='9');
        }
        public static void main(String[] args) {
            ValidPlindrome vp=new ValidPlindrome();
            String str="Was it a car or a cat I saw";
            System.out.println(vp.isPalindrome(str));
        }
    
}
