public class SolutionArrayMinMax {

    public static void main (String [ ] args){
        int arr[]={3 , 5 , 6, 22, 1, 4};
        int max =arr[0];
        int min  =arr[0];
        for (int i=0; i<arr. length; i++){
            if(arr[i]>max){
                max =arr[i];

            }
            if (arr[i]<min){
                min =arr[i];

            }
        }
    
            
        System.out.println("MAXIMAM :"+max);
        System. out. println("MINIMAM :"+min);
 
    }
}
    

