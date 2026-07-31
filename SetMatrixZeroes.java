public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        boolean[] rowzero=new boolean[rows];
        boolean[] colzero=new boolean[cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ; j++){
                if(matrix[i][j]==0){
                rowzero[i]=true;
                colzero[j]=true;
            }
            }
        }
        for(int i=0; i<rows; i++)
{
    for(int j=0;j<cols; j++){
        if(rowzero[i]||colzero[j]){
            matrix[i][j]=0;
        }
    }
}        
    }
    
}
