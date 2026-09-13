import java.util.Arrays;
import java.util.Stack;

public class Car_Fleet {
     public  static  int  carFleet(int target, int[] position, int[] speed) {
       int n=position.length;
       Integer [] cars=new Integer[n];
       for(int i=0; i<n; i++){
        cars[i]=i;

       }
       Arrays.sort(cars,(a,b)->position[b]-position[a]);
       Stack<Double> stack =new Stack<>();
       for(int i :cars){
        double time=(double)(target-position[i])/speed[i];

        if(stack.isEmpty()||time >stack.peek()){
            stack.push(time);
        }
       }
       
        return stack.size();
    }
    public static void main(String[] args) {
        int target=12;
        int pos[]={10, 8,5,3};
        int speed[]={2,4,7,1,};
        System.out.println(carFleet(target, pos, speed));
        
    }
}
