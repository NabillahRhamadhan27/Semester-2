import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pilih Bangun Ruang: Tabung, Kubus, Balok: ");
            String nama = scanner.nextLine();

            BangunRuang bangunRuang;
            if (nama.equalsIgnoreCase("Tabung")){
                bangunRuang = new Tabung(nama);
            } else if (nama.equalsIgnoreCase("Kubus")) {
                bangunRuang = new Kubus(nama);
            }else {
                bangunRuang = new Balok(nama);
            }

            bangunRuang.inputNilai();
            System.out.println("Luas Permukaan: " + bangunRuang.luasPermukaan());
            System.out.println("Volume: " + bangunRuang.volume());
        }
    }
}
