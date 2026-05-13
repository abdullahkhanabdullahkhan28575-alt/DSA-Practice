public class Rotate2DArray {
    public static  void rotate(int[][] matrix) {
        int n =matrix.length;
        int rotated[][]=new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                rotated[j][n-1-i]=matrix[i][j];
                           }
                      }
                      for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                            matrix[i][j]=rotated[i][j];
                        }
                      }
                       for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                            System.out.print(matrix[i][j]+" ");
                        }
                        System.out.println();
                    }

        
    }
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4}};
        rotate(arr);
        
    }
    
}
