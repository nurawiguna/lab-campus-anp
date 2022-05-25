/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.util.*;

/**
 *
 * @author nurawiguna
 */
public class nomor1 {
    
    public static void main (String[] args) {
        // TODO code application logic here
        KontribusiNilai();
        
    }

    public static void KontribusiNilai() {
        Scanner input = new Scanner(System.in);
        int n_kehadiran, n_uts, n_uas, n_akhir;
        float kehadiran, uts = 0.3f, uas = 0.5f, nilaiAkhir;
        char grade;

        System.out.print("Input Mata Kuliah : ");
        String MataKuliah = input.nextLine();
        System.out.print("-------- Tentukan Nilai --------"+"\n");
        System.out.print("Input Kehadiran 0-8\t: ");
        kehadiran = input.nextInt();
        System.out.print("Input Nilai UTS\t\t: ");
        uts = input.nextFloat();
        System.out.print("Input Nilai UAS\t\t: ");
        uas = input.nextFloat();

        if (kehadiran >= 7) {
            kehadiran = 100;
        } else if (kehadiran == 5 || kehadiran == 6) {
            kehadiran = 80;
        } else if (kehadiran == 4 || kehadiran == 3) {
            kehadiran = 60;
        } else {
            kehadiran = 0;
        }
        
        kehadiran = (int) (kehadiran * 0.2f);
        uts = (int) (uts * 0.3f);
        uas = (int) (uas * 0.5f);
        nilaiAkhir = kehadiran + uts + uas;


        if (kehadiran + uts + uas >= 85) {
            grade = 'A';
        } else if (kehadiran + uts + uas >= 70 && kehadiran + uts + uas <= 84) {
            grade = 'B';
        } else if (kehadiran + uts + uas >= 60 && kehadiran + uts + uas <= 69) {
            grade = 'C';
        } else if (kehadiran + uts + uas >= 50 && kehadiran + uts + uas <= 59) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        n_kehadiran = (int) kehadiran;
        n_uts = (int) uts;
        n_uas = (int) uas;
        n_akhir = (int) nilaiAkhir;


        System.out.println("\n" + "========== Ini adalah Kontribusi Nilai Mata Kuliah " + MataKuliah + " ==========");
        // System.out.println("Nilai Kehadiran" + "\t" + ": " + n_kehadiran + "%");
        // System.out.println("Nilai UTS" + "\t" + ": " + n_uts + "%");
        // System.out.println("Nilai UAS" + "\t" + ": " + n_uas + "%");
        System.out.println("Nilai Akhir" + "\t" + ": " + n_akhir);
        System.out.println("Grade" + "\t" + "\t" + ": " + grade);

    }
}


