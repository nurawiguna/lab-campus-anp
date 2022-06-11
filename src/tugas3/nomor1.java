package tugas3;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Nomor 1
        System.out.println("- - - - - Nomor 1 - - - - -\n");
        MartrixTranspose();
        System.out.println("- - - - - - - - - - - - - -");

        // Nomor 2
        System.out.println("\n- - - - - Nomor 2 - - - - -\n");
        System.out.println("--------------------------------");
        System.out.println("\tMenu");
        System.out.println("--------------------------------");
        System.out.println("[1] Matrix Transpose");
        System.out.println("[2] Mecari Luas Persegi Panjang");
        System.out.println("[3] Selesai");
        System.out.println("--------------------------------");
        System.out.print("Pilihan [1,2,3] : ");
        int pil = input.nextInt();
        System.out.println("--------------------------------");
        if (pil == 1) {
            System.out.println("Anda Memilih Menu 1 yaitu Matrix Transpose");
            MartrixTranspose();
        } else if (pil == 2) {
            System.out.println("Anda Memilih Menu 2 yaitu Mecari Luas Persegi Panjang");
            LuasPersegiPanjang();
        } else if (pil == 3) {
            System.out.println("Anda Memilih Menu 3 yaitu Selesai");
            System.out.println("Terima Kasih");
        } else {
            System.out.println("Pilihan tidak ada");
        }
        System.out.println("- - - - - - - - - - - - - -");

    }

    public static void MartrixTranspose() {
        Scanner input = new Scanner(System.in);
        String matrixA[][], matrixAT[][];

        matrixA = new String[3][2];
        matrixAT = new String[2][3];

        // Input Matrix A
        System.out.println("Input Matrix A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Input Matrix A[" + i + "][" + j + "] : ");
                matrixA[i][j] = input.next();
            }
        }

        System.out.println("- Matrix A : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrixAT[j][i] = matrixA[i][j];
            }
        }
        System.out.println("- Matrix A Transpose :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixAT[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void LuasPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.print("Masukan Panjang\t\t: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar\t\t: ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang\t: " + luas);
    }

}
