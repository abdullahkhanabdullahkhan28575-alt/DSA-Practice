import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int arr[], int target){
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int complement=target -arr[i];
            if(map.containsKey(complement)){
                return new int [] {map.get(complement),i};

            }
            map.put(arr[i] ,i);


        }
    return new int []{};
        
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int result[]=twosum(arr, target);
       
        if(result.length==2){
            System.out.println("Index: "+result[0]+" "+ result[1]);

        }else{
            System.out.println("Not solution found");
        }

    
    }
}
