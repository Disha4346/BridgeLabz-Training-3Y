import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_MatrixOperationsBasic
 * Task: Create random matrices; add, subtract, multiply.
 */
public class L3_MatrixOperationsBasic {

    public static int[][] randomMatrix(int rows, int cols, int min, int max) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }
        return m;
    }

    public static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int r = A.length, c = B[0].length, n = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) sum += A[i][k] * B[k][j];
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns for A: ");
        int rA = scanner.nextInt(); int cA = scanner.nextInt();
        System.out.print("Enter rows and columns for B: ");
        int rB = scanner.nextInt(); int cB = scanner.nextInt();

        int[][] A = randomMatrix(rA, cA, -9, 9);
        int[][] B = randomMatrix(rB, cB, -9, 9);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        if (rA == rB && cA == cB) {
            System.out.println("A + B:");
            printMatrix(add(A, B));
            System.out.println("A - B:");
            printMatrix(subtract(A, B));
        } else {
            System.out.println("Addition/Subtraction not possible due to size mismatch.");
        }

        if (cA == rB) {
            System.out.println("A x B:");
            printMatrix(multiply(A, B));
        } else {
            System.out.println("Multiplication not possible (A columns must equal B rows).");
        }
        scanner.close();
    }
}
