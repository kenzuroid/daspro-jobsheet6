import java.util.Scanner;

public class Pemilihan2Percobaan222 {

    public static void main(String[] args) {      
        Scanner input22 = new Scanner(System.in);

        Integer pilihan_menu;
        String member;
        double diskon;
        double harga, total_bayar;
        
        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input22.nextInt();
        input22.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input22.nextLine();
        System.out.println("------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);

            System.out.println("Total bayar setelah diskon = " + total_bayar); 
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            } 
            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        String jenis_pembayaran;
        System.out.print("Apakah pembayaran menggunakan QRIS (y/n)? = ");
        jenis_pembayaran = input22.nextLine();
        if (jenis_pembayaran.equalsIgnoreCase("y")) {
            total_bayar -= 1000;
            System.out.println("Anda mendapatkan potongan Rp. 1.000 karena menggunakan QRIS.");
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total bayar akhir = " + total_bayar);
    }
}
