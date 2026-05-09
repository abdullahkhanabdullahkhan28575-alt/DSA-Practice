import java.util.Arrays;

public class PermutaitoinInString {
     public  static boolean checkInclusion(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);

        for (int i = 0; i < s2.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                char[] subStrArr = s2.substring(i, j + 1).toCharArray();
                Arrays.sort(subStrArr);
                String sortedSubStr = new String(subStrArr);

                if (sortedSubStr.equals(sortedS1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
       String s1 = "abc", s2 = "lecabee";
       System.out.println(checkInclusion(s1, s2));
        
    }
    
}
