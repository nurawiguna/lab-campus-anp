package tugas2;

import java.util.*;

public class nomor2 {
    public static int n = 3, i, j,
    matrixA[][] = new int[n][n], 
    matrixB[][] = new int[n][n], 
    matrixC[][] = new int[n][n];

    public static void main(String[] args) {
        // TODO code application logic here
        // MatrixA();
        // MatrixB();
        // MatrixC();

        Scanner input = new Scanner(System.in);

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Input Matriks A[" + i + "][" + j + "] : ");
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks A : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Input Matriks B[" + i + "][" + j + "] : ");
                matrixB[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks B : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
    
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Input Matriks C[" + i + "][" + j + "] : ");
                matrixC[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks C : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=========== Penggabungan Matriks ABC ===========");
        System.out.println("Berikut Matriks D : ");
        int matrixD[][] = new int[n][9];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrixD[i][j] + " ");
            }
            System.out.println();
        }

        // for (i = 0; i < n; i++) {
        //     for (j = 0; j < n; j++) {
        //         System.out.print(matrixA[i][j] + matrixB[i][j] + matrixC[i][j] + " ");
        //     }
        //     System.out.println();
        // }


    }


}
