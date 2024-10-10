/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainPackage;

/**
 *
 * @author uding
 */
import UserPackage.Admin;
import UserPackage.Customer;
import DataPackage.Kamar;
import DataPackage.Pemesanan;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Surti", "Tejo");
        Customer customer = new Customer("Otong", "Surotong");
        Kamar kamar1 = new Kamar(101, "Single", 500000.0);
        Kamar kamar2 = new Kamar(102, "Double", 750000.0);

        while (true) {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.println("=== Admin Login ===");
                System.out.print("Masukkan username admin: ");
                String inputUsername = scanner.next();
                System.out.print("Masukkan password admin: ");
                String inputPassword = scanner.next();

                if (admin.login(inputUsername, inputPassword)) {
                    System.out.println("Login berhasil sebagai Admin.");
                    System.out.print("Masukkan nomor kamar yang ingin diubah statusnya: ");
                    int nomorKamar = scanner.nextInt();
                    System.out.print("Masukkan status kamar (true = tersedia, false = tidak tersedia): ");
                    boolean statusKamar = scanner.nextBoolean();

                    if (nomorKamar == kamar1.getNomorKamar()) {
                        admin.ubahStatusKamar(kamar1, statusKamar);
                    } else if (nomorKamar == kamar2.getNomorKamar()) {
                        admin.ubahStatusKamar(kamar2, statusKamar);
                    } else {
                        System.out.println("Kamar dengan nomor tersebut tidak ditemukan.");
                    }

                    admin.logout();

                } else {
                    System.out.println("Login gagal.");
                }

            } else if (pilihan == 2) {
                System.out.println("=== Customer Login ===");
                System.out.print("Masukkan username customer: ");
                String inputUsername = scanner.next();
                System.out.print("Masukkan password customer: ");
                String inputPassword = scanner.next();

                if (customer.login(inputUsername, inputPassword)) {
                    System.out.println("Login berhasil sebagai Customer.");
                    System.out.println("=== Buat Pesanan ===");
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomorKamar = scanner.nextInt();
                    System.out.print("Masukkan lama menginap (malam): ");
                    int lamaMenginap = scanner.nextInt();

                    Kamar kamarDipilih = null;
                    if (nomorKamar == kamar1.getNomorKamar() && kamar1.isTersedia()) {
                        kamarDipilih = kamar1;
                    } else if (nomorKamar == kamar2.getNomorKamar() && kamar2.isTersedia()) {
                        kamarDipilih = kamar2;
                    } else {
                        System.out.println("Kamar tidak tersedia atau nomor kamar tidak valid.");
                    }

                    if (kamarDipilih != null) {
                        Pemesanan pesanan = new Pemesanan(1, "Otong", kamarDipilih, lamaMenginap);
                        pesanan.cetakDetailPesanan();
                        System.out.print("Apakah Anda ingin logout? (yes/no): ");
                        String konfirmasi = scanner.next();
                        if (konfirmasi.equalsIgnoreCase("yes")) {
                            customer.logout();
                        } else {
                            System.out.println("Anda dapat membuat pesanan lagi.");
                        }
                    }
                } else {
                    System.out.println("Login gagal.");
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan sistem reservasi hotel.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}