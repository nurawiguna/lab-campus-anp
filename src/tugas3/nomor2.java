package tugas3;

public class nomor2 {
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 9; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            if (i < 5) {
                System.out.println("1");
            } else {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 9; i++) {
            System.out.print(i);
        }
    }
}
