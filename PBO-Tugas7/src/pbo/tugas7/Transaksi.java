/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.tugas7;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author uding
 */
public class Transaksi {
     Barang[] daftarBarang = {
        new Barang("a001", "Buku", 3000),
        new Barang("a002", "Pensil", 4000),
        new Barang("a003", "Pulpen", 5000)
    };

    public Barang cariBarang(String kode) {
        for (Barang barang : daftarBarang) {
            if (barang.kode.equalsIgnoreCase(kode)) {
                return barang;
            }
        }
        return null;
    }

    public void mulaiTransaksi() {
        Scanner scanner = new Scanner(System.in);
        int jumlahItem = 0;
        
        // Pengecekan input untuk memastikan yang diinput adalah angka
        while (true) {
            try {
                System.out.print("Masukkan Item Barang (jumlah): ");
                jumlahItem = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka. Coba lagi.");
                scanner.next(); // Membersihkan input yang salah
            }
        }

        String[][] transaksi = new String[jumlahItem][5];
        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            String kode = scanner.next();
            Barang barang = cariBarang(kode);

            if (barang != null) {
                int jumlahBeli = 0;
                while (true) {
                    try {
                        System.out.print("Masukkan jumlah beli: ");
                        jumlahBeli = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka. Coba lagi.");
                        scanner.next(); // Membersihkan input yang salah
                    }
                }

                int jumlahBayar = barang.getHarga() * jumlahBeli;
                transaksi[i][0] = String.valueOf(i + 1);
                transaksi[i][1] = barang.kode;
                transaksi[i][2] = barang.getNama();
                transaksi[i][3] = String.valueOf(barang.getHarga());
                transaksi[i][4] = String.valueOf(jumlahBeli);
                totalBayar += jumlahBayar;
            } else {
                System.out.println("Kode barang tidak ditemukan. Coba lagi.");
                i--; // Mengulangi input karena barang tidak ditemukan
            }
        }

        // Menampilkan hasil transaksi
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*******************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < jumlahItem; i++) {
            int jumlahBeli = Integer.parseInt(transaksi[i][4]);
            int harga = Integer.parseInt(transaksi[i][3]);
            int jumlahBayar = jumlahBeli * harga;

            System.out.printf("%-4s %-12s %-13s %-6s %-11s %-12s\n",
                transaksi[i][0], transaksi[i][1], transaksi[i][2],
                transaksi[i][3], transaksi[i][4], jumlahBayar);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Bayar                        " + totalBayar);
    }
}