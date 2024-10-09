/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPackage;

/**
 *
 * @author uding
 */
public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private double harga;
    private boolean tersedia;

    public Kamar(int nomorKamar, String tipeKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.tersedia = true;
    }

    public void ubahStatus(boolean status) {
        this.tersedia = status;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void detailKamar() {
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Harga: " + harga);
        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
    }
}
