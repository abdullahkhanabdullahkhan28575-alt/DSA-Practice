import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean  containsduplicate(int  arr[]){
        HashSet<Integer> set= new HashSet<>();
        for(int n : arr){
            if(set.contains(n)){
                return true;

            }
            set.add(n);

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,1};
        boolean result=containsduplicate(arr);
        System.out.println(result);
    }




    
}
