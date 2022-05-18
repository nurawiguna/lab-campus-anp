class Binatang{
    String nama;
    String warna;

    public Binatang (String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }

    public String getNama(){
        return nama;
    }

    public String getWarna(){
        return warna;
    }

    public void bergerak(){
        System.out.println(nama + " bergerak...");
    }




}