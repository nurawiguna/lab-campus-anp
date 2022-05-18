/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi4;

/**
 *
 * @author nurawiguna
 */
public class diskusi4 {
    
    public static void main(String[] args) {
        // TODO code application logic here

        // Contoh untuk nomor 1
        BilanganBulat();
        BilanganDesimal();
        TipeDataChar();
        TipeDataBoolean();

        // Contoh untuk nomor 2
        OperatorAritmetika();
        OperatorUnary();
        OperatorPenugasan();
    }

    public static void BilanganBulat() {
        byte a = 120;
        short b = -3000;
        int c = 1200030;
        long d = -231093001200L;
        System.out.println("\t" + "\t" + "Ini adalah Bilangan Bulat ");
        System.out.println("Nilai Tipe Data Byte " + "\t" + ": " + a);
        System.out.println("Nilai Tipe Data Short" + "\t" + ": " + b);
        System.out.println("Nilai Tipe Data Integer" + "\t" + ": " + c);
        System.out.println("Nilai Tipe Data Long" + "\t" + ": " + d);
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static void BilanganDesimal() {
        float a = 12.3f;
        double b = -23.12;
        System.out.println("\t" + "\t" + "Ini adalah Bilangan Desimal ");
        System.out.println("Nilai Tipe Data Float" + "\t" + ": " + a);
        System.out.println("Nilai Tipe Data Double" + "\t" + ": " + b);
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static void TipeDataChar() {
        char a = 'A';
        char b = '\u0041';
        System.out.println("\t" + "\t" + "Ini adalah Tipe data Char ");
        System.out.println("Nilai Tipe Data Char" + "\t" + ": " + a);
        System.out.println("Nilai Tipe Data Char" + "\t" + ": " + b);
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static void TipeDataBoolean() {
        boolean a = true;
        boolean b = false;
        System.out.println("\t" + "\t" + "Ini adalah Tipe data Boolean ");
        System.out.println("Nilai Tipe Data Boolean" + "\t" + ": " + a);
        System.out.println("Nilai Tipe Data Boolean" + "\t" + ": " + b);
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static void OperatorAritmetika() {
        int a = 1 ,b = 20, 
        c = a + b, 
        d = a - b,
        e = a * b,
        f = a / b,
        g = a % b;
        System.out.println("\t" + "\t" + "Ini adalah Operator Aritmatika");
        System.out.println("Nilai Tipe Data Integer" + "\t" + ": " + c);
        System.out.println("Nilai Tipe Data Integer" + "\t" + ": " + d);
        System.out.println("Nilai Tipe Data Integer" + "\t" + ": " + e);
        System.out.println("Nilai Tipe Data Integer" + "\t" + ": " + f);
        System.out.println("Nilai Tipe Data Integer" + "\t" + ": " + g);
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static void OperatorUnary() {
        int a = 15, b = 20, c = 5;
        boolean kondisi = true;

        
        System.out.println("\t" + "\t" + "Ini adalah Operator Unary ");
        // Operator pre-increment
        c = ++a;
        System.out.println("Nilai c (++a)" + "\t" + ": " + c);
        // Operator pre-decrement
        c = --b;
        System.out.println("Nilai c (--b)" + "\t" + ": " + c);
        // Operator post-increment
        c = a++;
        System.out.println("Nilai c (a++)" + "\t" + ": " + c);
        // Operator post-decrement
        c = b--;
        System.out.println("Nilai c (b--)" + "\t" + ": " + c);
        // Membalik nilai boolean
        kondisi = !kondisi;
        System.out.println("Nilai !kondisi" + "\t" + ": " + kondisi);
        System.out.println("------------------------------------------------------" + "\n");
    }

    public static void OperatorPenugasan() {
        int a = 10, b = 20, c = 5;
        boolean kondisi = true;

        System.out.println("\t" + "\t" + "Ini adalah Operator Penugasan ");
        // Operator assignment
        c = a = b;
        System.out.println("Nilai c = a = b" + "\t" + "\t" + "\t" + ": " + c);
        // Operator assignment terhadap boolean
        kondisi = !kondisi;
        System.out.println("Nilai kondisi = !kondisi" + "\t" + ": " + kondisi);
        System.out.println("------------------------------------------------------" + "\n");
    }
    
    
}