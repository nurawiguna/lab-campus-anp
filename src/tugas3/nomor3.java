package tugas3;

public class nomor3 {

    public static void main(String[] args) {
        // TODO code application logic here

        String Awal = "Javascript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        int lengthawal = Awal.length();
        System.out.println("Panjang string Awal : " + lengthawal);

        System.out.println("1\t" + Awal.substring(0, 36));
        System.out.println("2\t" + Awal.substring(0, 36).toLowerCase());
        System.out.println("3\t" + Awal.substring(0, 36).toUpperCase());
        System.out.println("4\t" + Awal.substring(25, 36));
        System.out.println("5\t" + Awal.substring(37, lengthawal));
        

    }
}
