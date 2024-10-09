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
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        
        // Contoh data admin
        Admin admin = new Admin("Surti", "Tejo");
        
        // Contoh data customer
        Customer customer = new Customer("Otong", "Surotong");

        // Login Customer
        System.out.println("=== Customer Login ===");
        System.out.print("Masukkan username customer: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password customer: ");
        String inputPassword = scanner.nextLine();

        if (customer.login(inputUsername, inputPassword)) {  // Cek hasil login
            boolean continueSession = true;

            while (continueSession) {
                System.out.println("\nApa yang ingin Anda lakukan?");
                System.out.println("1. Buat Pesanan");
                System.out.println("2. Logout");
                System.out.print("Pilih (1/2): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Jika memilih untuk membuat pesanan
                        System.out.println("\n=== Buat Pesanan ===");
                        System.out.print("Nomor Pesanan: ");
                        int nomorPesanan = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline character
                        System.out.print("Nama Pelanggan: ");
                        String namaPelanggan = scanner.nextLine();
                        System.out.print("Nomor Kamar: ");
                        int nomorKamar = scanner.nextInt();
                        System.out.print("Lama Menginap (dalam malam): ");
                        int lamaMenginap = scanner.nextInt();
                        
                        // Panggil metode untuk membuat pesanan
                        customer.buatPesanan(nomorPesanan, namaPelanggan, nomorKamar, lamaMenginap);
                        break;

                    case 2:
                        // Jika memilih untuk logout
                        customer.logout();
                        continueSession = false; // Keluar dari loop
                        break;

                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            }
        } else {
            System.out.println("Login gagal. Tidak dapat melakukan tindakan.");
        }

        scanner.close();
    }
}