package sample;


public class Main  {

    public static void main(String[] args) {

        TransposeMatrix matrix = new TransposeMatrix(new int[][]{{2, 3}, {4, 5}});
      System.out.println("Original matrix");
        matrix.printMatrix();
        matrix.transposeMatrix();
        System.out.println("Transposed matrix");
        matrix.printMatrix();

    }
}
