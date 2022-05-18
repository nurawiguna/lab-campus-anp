package tugas2;

public class nomor3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 0, i;
        for (i = 1; i <= 10; i += 2) {
            System.out.println(i);
            jumlah += i;
        }
        System.out.println("---");
        System.out.println(jumlah);
    }
}