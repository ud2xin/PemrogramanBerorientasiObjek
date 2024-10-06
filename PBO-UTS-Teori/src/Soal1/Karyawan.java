/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author uding
 */
public class Karyawan {
    private String nama;
    private int idKaryawan;
    private double gaji;
    private String jabatan;
    private int hariKerja;

    // Konstruktor
    public Karyawan(String nama, int idKaryawan, double gaji, String jabatan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.gaji = gaji;
        this.jabatan = jabatan;
        this.hariKerja = 0; // Inisialisasi dengan 0 hari kerja
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    // Metode untuk menghitung hari kerja
    public int hitungHariKerja() {
        int totalHariKerja = 0;
        for (int i = 1; i <= 30; i++) {
            // Anggap hari Sabtu dan Minggu tidak dihitung sebagai hari kerja
            if (i % 7 != 0 && i % 7 != 6) {
                totalHariKerja++;
            }
        }
        return totalHariKerja;
    }
}