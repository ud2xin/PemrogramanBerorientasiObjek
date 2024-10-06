/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal2;

/**
 *
 * @author uding
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Koordinator
        Koordinator koordinator = new Koordinator("Workshop IT", "10-10-2024", 3, "Ruang 202", "Aldo", "08123456789");

        // Mengelola kegiatan
        koordinator.mengelolaKegiatan();

        // Melaksanakan kegiatan
        koordinator.melaksanakanKegiatan();

        // Menampilkan detail kegiatan
        koordinator.tampilkanDetailKegiatan();
    }
    
}
