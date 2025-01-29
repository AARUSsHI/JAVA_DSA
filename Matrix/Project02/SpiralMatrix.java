package Matrix.Project02;

public class SpiralMatrix {
    public void spiralPrint(int[][] matrix, int row, int column){
        int i = 0;
        int k = 0;
        int l = 0;
        while(k < row && l < column){
            // left to right
            for(i = l; i< column; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;

            // top to bottom
            for(i = k; i<row; i++){
                System.out.print(matrix[i][column-1] + " ");
            }
            column--;
            if(k < row){
                // right to left
                for(i=column-1; i>=l ;i--){
                    System.out.print(matrix[row-1][i] + " ");
                }
                row--;
            }
            if(l < column){
                // Bottom to top
                for(i = row-1; i>=k; i--){
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        sm.spiralPrint(matrix, 4,4);
    }
}
