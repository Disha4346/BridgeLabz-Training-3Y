
import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_MatrixOperationsAdvanced
 * Task: Transpose, determinant (2x2 & 3x3), inverse (2x2 & 3x3), display.
 * Input: User selects 2x2 or 3x3; elements are randomly generated (integers in range [-5, 5]).
 */
public class L3_MatrixOperationsAdvanced {

    public static double[][] randomMatrix(int rows, int cols, int min, int max) {
        double[][] m = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }
        return m;
    }

    public static double[][] transpose(double[][] M) {
        int r = M.length, c = M[0].length;
        double[][] T = new double[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                T[j][i] = M[i][j];
            }
        }
        return T;
    }

    public static double det2(double[][] M) {
        // 2x2 determinant: ad - bc
        return M[0][0] * M[1][1] - M[0][1] * M[1][0];
    }

    public static double det3(double[][] M) {
        // 3x3 determinant using rule of Sarrus / cofactor expansion
        double a = M[0][0], b = M[0][1], c = M[0][2];
        double d = M[1][0], e = M[1][1], f = M[1][2];
        double g = M[2][0], h = M[2][1], i = M[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }

    public static double[][] inverse2(double[][] M) {
        double det = det2(M);
        if (Math.abs(det) < 1e-9) return null;
        double[][] inv = new double[2][2];
        inv[0][0] =  M[1][1] / det;
        inv[0][1] = -M[0][1] / det;
        inv[1][0] = -M[1][0] / det;
        inv[1][1] =  M[0][0] / det;
        return inv;
    }

    public static double[][] inverse3(double[][] M) {
        double det = det3(M);
        if (Math.abs(det) < 1e-9) return null;
        // Compute cofactor matrix then transpose (adjugate) and divide by det
        double[][] cof = new double[3][3];

        cof[0][0] =  (M[1][1]*M[2][2] - M[1][2]*M[2][1]);
        cof[0][1] = -(M[1][0]*M[2][2] - M[1][2]*M[2][0]);
        cof[0][2] =  (M[1][0]*M[2][1] - M[1][1]*M[2][0]);

        cof[1][0] = -(M[0][1]*M[2][2] - M[0][2]*M[2][1]);
        cof[1][1] =  (M[0][0]*M[2][2] - M[0][2]*M[2][0]);
        cof[1][2] = -(M[0][0]*M[2][1] - M[0][1]*M[2][0]);

        cof[2][0] =  (M[0][1]*M[1][2] - M[0][2]*M[1][1]);
        cof[2][1] = -(M[0][0]*M[1][2] - M[0][2]*M[1][0]);
        cof[2][2] =  (M[0][0]*M[1][1] - M[0][1]*M[1][0]);

        double[][] adj = transpose(cof); // adjugate is transpose of cofactor matrix
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adj[i][j] / det;
            }
        }
        return inv;
    }

    public static void printMatrix(double[][] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.println(Arrays.toString(M[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int n = scanner.nextInt();
        if (n != 2 && n != 3) {
            System.out.println("Only 2x2 or 3x3 supported.");
            scanner.close();
            return;
        }
        double[][] M = randomMatrix(n, n, -5, 5);
        System.out.println("Matrix:");
        printMatrix(M);

        System.out.println("Transpose:");
        printMatrix(transpose(M));

        if (n == 2) {
            double det = det2(M);
            System.out.println("Determinant (2x2): " + det);
            double[][] inv = inverse2(M);
            if (inv == null) {
                System.out.println("Inverse does not exist (det=0).");
            } else {
                System.out.println("Inverse (2x2):");
                printMatrix(inv);
            }
        } else {
            double det = det3(M);
            System.out.println("Determinant (3x3): " + det);
            double[][] inv = inverse3(M);
            if (inv == null) {
                System.out.println("Inverse does not exist (det=0).");
            } else {
                System.out.println("Inverse (3x3):");
                printMatrix(inv);
            }
        }
        scanner.close();
    }
}
