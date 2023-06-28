package lesson_4_HW_3;
public class WorkWithMassive {
    public int[][] createMatrix(int height, int width, int matrixValue, boolean needToPrint) {
        height = adaptationForInputParameters(height);
        width = adaptationForInputParameters(width);

        int[][] matrix = new int[height][width];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrixValue;
            }
        }
        if (needToPrint) {
            printMatrix(matrix, needToPrint);
        }
        return matrix;
    }
    public int[][] createMatrix(int height, int width, int matrixValue) {
        return createMatrix(height,width,matrixValue,true);
    }
    public int[][] fillingOfLeftDiagonal(int[][] matrix, int leftDiagonalValue, boolean needToPrint) {
        if (!verifyMatrixForSquare(matrix)) {
            return matrix;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][i] = leftDiagonalValue;
            }
        }

        printMatrix(matrix, needToPrint);
        return matrix;
    }
    public int[][] fillingOfLeftDiagonal(int[][] matrix, int leftDiagonalValue) {
        return fillingOfLeftDiagonal(matrix, leftDiagonalValue, true);
    }
    public int[][] fillingOfRightDiagonal(int[][] matrix, int rightDiagonalValue, boolean needToPrint) {
        if (!verifyMatrixForSquare(matrix)) {
            return matrix;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == (matrix.length) - 1) {
                    matrix[i][j] = rightDiagonalValue;
                }
            }
        }

        printMatrix(matrix, needToPrint);
        return matrix;
    }
    public int[][] fillingOfRightDiagonal(int[][] matrix, int rightDiagonalValue) {
        return fillingOfRightDiagonal(matrix, rightDiagonalValue, true);
    }
    public int[][] fillingCrossDeagonale(int[][] matrix, int crossDiagonalesValue) {
        if (verifyMatrixForSquare(matrix)) {
            fillingOfLeftDiagonal(matrix, crossDiagonalesValue, false);
            fillingOfRightDiagonal(matrix, crossDiagonalesValue, true);
        }
        return matrix;
    }
    private int adaptationForInputParameters(int value) {
        if (value < 0) {
            System.out.println("The matrix value cannot be negative. Changed to " + -value);
            value = Math.abs(value);
        } else if (value == 0) {
            System.out.println("The matrix value cannot be 0. Changed to 1");
            value = 1;
        }

        return value;
    }
    private boolean verifyMatrixForSquare(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("Matrix is not square... Initial matrix:");
                printMatrix(matrix, true);
                return false;
            }
        }

        return true;
    }
    private void printMatrix(int[][] matrix, boolean needToPrint) {
        if (needToPrint) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "   ");
                }
                System.out.println();
            }
        }
    }

}
