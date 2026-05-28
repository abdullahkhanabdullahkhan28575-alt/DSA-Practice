public class DailyTemperatures {

    
     public  static int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int res[]=new int [n];
        for(int i=0; i<n; i++){
            int count =1;
            int j=i+1;
            while(j<n){
                if(temperatures[j]>temperatures[i]){
                    break;

                }
                 j++;
                 count ++;
            }
            count =(j==n)?0:count ;
            res[i]=count;

        }
        return res;
        
    }
    
    }


