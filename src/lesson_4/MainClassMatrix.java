package lesson_4;

public class MainClassMatrix {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5
        // 7 8 9 10

        int[][] martix = {{1, 2, 3}, {4, 5}, {7, 8, 9, 10}};
        martix[2][3] = 11;

        PrintMatrix.printMatrixMethod(martix);

        int[][] matrixD = new int[4][5];
        for (int i = 0; i < matrixD.length; i++) {
            for (int j = 0; j < matrixD[i].length; j++) {
                matrixD[i][j] = (j + 1) + (matrixD[i].length * i);
            }

        }

        PrintMatrix.printMatrixMethod(matrixD);


    }
}
