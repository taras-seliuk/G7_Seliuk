package lesson_4_HW_3;

public class MainClass {
    public static void main(String[] args) {
        int height = -10;
        int width = 10;
        int defaultValue = 1;
        int valueLeft = -5;
        int matrixNewValueRight = 0;
        int matrixValueCross = 20;

        WorkWithMassive workWithMassive = new WorkWithMassive();

        System.out.println("Initial matrix:");
        int[][] matrix = workWithMassive.createMatrix(height, width, defaultValue);

        System.out.println("The matrix with filled left diagonal:");
        workWithMassive.fillingOfLeftDiagonal(matrix, valueLeft);

        System.out.println("The matrix with filled rigth diagonal:");
        workWithMassive.fillingOfRightDiagonal(matrix, matrixNewValueRight);

        System.out.println("The matrix with filled both diagonals:");
        workWithMassive.fillingCrossDeagonale(matrix, matrixValueCross);
    }
}

