/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author uding
 */
public class Koordinator extends Kegiatan implements PengelolaKegiatan, PelaksanaKegiatan {
    private String namaKoordinator;
    private String nomorTelepon;

    // Konstruktor
    public Koordinator(String namaKegiatan, String tanggal, int durasi, String lokasi, String namaKoordinator, String nomorTelepon) {
        super(namaKegiatan, tanggal, durasi, lokasi);
        this.namaKoordinator = namaKoordinator;
        this.nomorTelepon = nomorTelepon;
    }

    // Implementasi dari PengelolaKegiatan
    @Override
    public void mengelolaKegiatan() {
        System.out.println("Koordinator " + namaKoordinator + " sedang mengelola kegiatan: " + getNamaKegiatan());
    }

    // Implementasi dari PelaksanaKegiatan
    public void melaksanakanKegiatan() {
        System.out.println("Koordinator " + namaKoordinator + " sedang melaksanakan kegiatan: " + getNamaKegiatan());
    }

    // Getter dan Setter
    public String getNamaKoordinator() {
        return namaKoordinator;
    }

    public void setNamaKoordinator(String namaKoordinator) {
        this.namaKoordinator = namaKoordinator;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    @Override
    public void melaksanakankegiatan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}