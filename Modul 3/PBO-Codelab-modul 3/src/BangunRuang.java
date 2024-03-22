public class BangunRuang {
    private String nama;

    public BangunRuang(String nama){
        this.nama = nama;
    }

    public BangunRuang() {
    }

    public void inputNilai(){
        System.out.print("Input Nilai Untuk Bangun: " + nama);
    }

    public double luasPermukaan(){
        System.out.print("Menghitung Luas Permukaan Bangun: " + nama);
        return 0;
    }

    public double volume(){
        System.out.print("Menghitung Volume Bangun: " + nama);
        return 0;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String string){
        this.nama = nama;
    }
}