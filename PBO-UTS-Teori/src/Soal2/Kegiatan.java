/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author uding
 */
public class Kegiatan {
    private String namaKegiatan;
    private String tanggal;
    private int durasi;
    private String lokasi;

    // Konstruktor
    public Kegiatan(String namaKegiatan, String tanggal, int durasi, String lokasi) {
        this.namaKegiatan = namaKegiatan;
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.lokasi = lokasi;
    }

    // Getter dan Setter
    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    // Metode untuk menampilkan detail kegiatan
    public void tampilkanDetailKegiatan() {
        String[] kegiatanList = {"Seminar Teknologi", "Workshop IT", "Pelatihan Desain Grafis"};
        System.out.println("Daftar Kegiatan:");
        for (String kegiatan : kegiatanList) {
            System.out.println("Kegiatan: " + kegiatan);
        }

        if (kegiatanList.length == 0) {
            System.out.println("Tidak ada kegiatan yang tersedia.");
        }
    }
}