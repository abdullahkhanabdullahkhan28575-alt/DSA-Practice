import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKfrequentElement {
     public  static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Queue<Integer> heap=new PriorityQueue<>((n1,n2)-> map.get(n1) - map.get(n2));
      for(int n:map.keySet()){
        heap.add(n);
        if(heap.size()> k)
        heap.poll();

      }
      int result[]=new int [k];
      for(int i=k-1; i>=0; --i){
        result[i]=heap.poll();
      }
      return result;
    }
    public static void main(String[] args) {
        int nums[]={1,1,3,2,2,2,};
        int k=2;
        int  result []=topKFrequent(nums, k);
        System.out.println(java.util .Arrays.toString(result));
    }

    
}