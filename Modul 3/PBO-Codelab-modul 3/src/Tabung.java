import java.util.Scanner;

class Tabung extends BangunRuang{

    private double jarijari;

    private double tinggi;

    public Tabung(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai(){
        super.getNama();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jari-Jari Tabung = ");
        jarijari = scanner.nextDouble();
        System.out.print("Masukan Tinggi Tabung = ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan(){
        double hasil = 2 * Math.PI * jarijari * (jarijari + tinggi);
        return hasil;
    }

    @Override
    public double volume(){
        double hasil = Math.PI * Math.pow(jarijari,2) * tinggi;
        return hasil;
    }
}
