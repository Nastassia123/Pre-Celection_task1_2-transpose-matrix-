package sample;

public class TransposeMatrix {

    int [][] matrix;

    public TransposeMatrix(int[][] matrix)
    {
        this.matrix = matrix;
    }


    public void transposeMatrix() {
        int element;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i + 1; j < matrix[i].length; j++)
            {
                element = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = element;
            }
        }
    }



    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

