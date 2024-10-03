import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        String jenisBuku;
        int jmlBuku;
        double hrgBayar, hrgBuku, diskon = 0;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input22.nextLine();
        
        System.out.print("Masukkan Jumlah Buku: ");
        jmlBuku = input22.nextInt();
        
        System.out.print("Masukkan Harga Buku: ");
        hrgBuku = input22.nextDouble();
        
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (jmlBuku >= 1)
            diskon = 0.1; 
            if (jmlBuku > 2) {
                diskon += 0.02;;  
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (jmlBuku > 3){
                diskon += 0.02;
            } else if (jmlBuku <= 3)
                diskon += 0.01;
        } else if (jenisBuku.equalsIgnoreCase("Lainnya")) {
            if (jmlBuku > 3) 
                diskon = 0.05;
        }

        hrgBayar = hrgBuku * jmlBuku * (1 - diskon);
        
        System.out.println("Harga Bayar: " + hrgBayar);
        
    }
}
