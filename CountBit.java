public class CountBit {
     public int hammingWeight(int n) {
        int count =0;
        for(int i=0; i<32; i++){
            if((1<<i &n)!=0){
                count++;
            }
        }
        return count;
        
    }
    
}
