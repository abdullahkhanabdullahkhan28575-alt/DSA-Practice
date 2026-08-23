public class Palindromic_Substrings {
    public int countSubstrings(String s) {
        int res=0, n=s.length();
        boolean[][]dp=new boolean[n][n];
        for(int i=n-1; i>=0 ;i--){
            for(int j=i ; j<n; j++){
                if(s.charAt(i)==s.charAt(j)&& (j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    res++;
                }
            }
        }
        return res;

        
    }
    
}
