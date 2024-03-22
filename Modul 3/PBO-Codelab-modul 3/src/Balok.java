import java.util.Scanner;
public class Balok extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String nama){
        super(nama);
    }

    @Override
    public void inputNilai(){
        super.getNama();
        System.out.print("Input Panjang Balok = ");
        panjang = scanner.nextDouble();
        System.out.print("Input Lebar Balok = ");
        lebar = scanner.nextDouble();
        System.out.print("Input Tinggi Balok = ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public double volume(){
        return panjang * lebar * tinggi;
    }
}
