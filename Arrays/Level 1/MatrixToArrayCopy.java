import java.util.Scanner;

/**
 * Program 9 (Level 1)
 * Copies a 2D matrix into a 1D array.
 */
public class MatrixToArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, cols;
        while (true) {
            System.out.print("Enter rows (>0): ");
            if (!sc.hasNextInt()) { System.err.println("Enter integer."); sc.next(); continue; }
            rows = sc.nextInt();
            if (rows <= 0) { System.err.println("Rows must be > 0."); continue; }
            break;
        }
        while (true) {
            System.out.print("Enter columns (>0): ");
            if (!sc.hasNextInt()) { System.err.println("Enter integer."); sc.next(); continue; }
            cols = sc.nextInt();
            if (cols <= 0) { System.err.println("Columns must be > 0."); continue; }
            break;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " integers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (!sc.hasNextInt()) { System.err.println("Enter integer."); sc.next(); }
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.print("1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();

        sc.close();
    }
}
