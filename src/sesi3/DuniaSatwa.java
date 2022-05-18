public class DuniaSatwa {
    public static void main(String[] args) {
        Binatang binatang = new Binatang("Kucing", "Coklat");

        binatang.bergerak();
        System.out.println("Warna binatang ini adalah " + binatang.getWarna());
    }
}