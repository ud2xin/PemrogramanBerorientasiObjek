/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPackage;

/**
 *
 * @author uding
 */
public class Pemesanan {
    private int nomorPesanan;
    private String namaPelanggan;
    private int nomorKamar;
    private int lamaMenginap;

    public Pemesanan(int nomorPesanan, String namaPelanggan, int nomorKamar, int lamaMenginap) {
        this.nomorPesanan = nomorPesanan;
        this.namaPelanggan = namaPelanggan;
        this.nomorKamar = nomorKamar;
        this.lamaMenginap = lamaMenginap;
    }

    public void detailPesanan() {
        System.out.println("Nomor Pesanan: " + nomorPesanan);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Lama Menginap: " + lamaMenginap + " malam");
    }
}
