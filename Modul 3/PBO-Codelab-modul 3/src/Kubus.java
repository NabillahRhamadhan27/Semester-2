import java.util.Scanner;
public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);

    private double sisi;
    public Kubus(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai(){
        super.getNama();
        System.out.print("Input Sisi Kubus = ");
        sisi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        return hasil;
    }

    @Override
    public double volume(){
        double hasil = Math.pow(sisi,3);
        return hasil;
    }
}
