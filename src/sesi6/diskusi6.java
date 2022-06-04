package sesi6;

import java.util.Scanner;

public class diskusi6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Untuk nomor 1
        System.out.println("--- Ini adalah untuk nomor 1 ---");
        nomor1();
        
        System.out.println("\n" + "--- Ini adalah untuk nomor 2 ---");
        int panjang, lebar;
        System.out.print("Panjang persegi\t\t: ");
        panjang = input.nextInt();
        System.out.print("Lebar persegi\t\t: ");
        lebar = input.nextInt();
        int luas = nomor2(panjang, lebar);
        System.out.print("Luas persegi adalah\t: " + luas);

    }

    public static void nomor1() {
        // ------------------------------------------------------
        // Array 1 dimensi yaitu kumpulan data yang memiliki banyaknya elemen yang sama,
        // dalam kasus ini array 1 dimensi yaitu array yang memiliki banyaknya elemen
        // yang sama yaitu elemen yang memiliki tipe data integer.

        int[] array1 = { 1, 2, 3, 4, 5 };
        System.out.println("\t" + "\t" + "Ini adalah Array 1 dimensi ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nilai Array 1 dimensi ke-" + i + " : " + array1[i]);
        }
        System.out.println("------------------------------------------------------" + "\n");

        // ------------------------------------------------------
        // Array 2 dimensi
        // Array 2 dimensi yaitu kumpulan data yang memiliki banyaknya elemen yang
        // berbeda, dalam kasus ini array 2 dimensi yaitu array yang memiliki banyaknya
        // elemen yang berbeda yaitu elemen yang memiliki tipe data integer.

        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("\t" + "\t" + "Ini adalah Array 2 dimensi ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("Nilai Array 2 dimensi ke-" + i + " ke-" + j + " : " + array2[i][j]);
            }
        }
        System.out.println("------------------------------------------------------" + "\n");

        // ------------------------------------------------------
        // Array 3 dimensi
        // Array 3 dimensi yaitu kumpulan data yang memiliki banyaknya elemen yang berbeda,
        // dalam kasus ini array 3 dimensi yaitu array yang memiliki banyaknya elemen
        // yang berbeda yaitu elemen yang memiliki tipe data integer.
        
        int[][][] array3 = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
                { { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };
        System.out.println("\t" + "\t" + "Ini adalah Array 3 dimensi ");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array3[i][j].length; k++) {
                    System.out.println(
                            "Nilai Array 3 dimensi ke-" + i + " ke-" + j + " ke-" + k + " : " + array3[i][j][k]);
                }
            }
        }
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static int nomor2(int panjang, int lebar) {
        // -----
        // Menghitung luas persegi
        // -----
        int luas = panjang * lebar;
        return luas;
    }
}