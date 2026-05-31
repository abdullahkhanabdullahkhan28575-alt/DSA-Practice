

public class ArrayShortCheck {

    

    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,4,5,6,7,8};
        boolean shorted=true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){//case2 (arr[i]<arr[j+1])
                shorted=false;
                break;

            }
        }
        if(shorted){
            System.out.println("array is a shorted");
        }
        else{
            System.out.println("array is not shorted");
        }
    }
    
}

