/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author uding
 */
public class Manajer extends Karyawan implements Pengelola, Pekerja {
    private String departemen;

    // Konstruktor
    public Manajer(String nama, int idKaryawan, double gaji, String jabatan, String departemen) {
        // Memanggil konstruktor dari superclass (Karyawan)
        super(nama, idKaryawan, gaji, jabatan);  // Ini memanggil konstruktor Karyawan
        this.departemen = departemen;
    }

    // Implementasi metode dari interface Pengelola
    @Override
    public void mengelolaKaryawan() {
        System.out.println("Manajer " + getNama() + " mengelola karyawan di departemen " + departemen);
    }

    // Implementasi metode dari interface Pekerja
    @Override
    public void bekerja() {
        System.out.println("Manajer " + getNama() + " bekerja seperti karyawan biasa.");
    }

    // Getter dan Setter untuk departemen
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}
