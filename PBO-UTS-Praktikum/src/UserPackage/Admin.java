/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPackage;

/**
 *
 * @author uding
 */
import DataPackage.Kamar;

import DataPackage.Kamar;

public class Admin implements Pengguna {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void logout() {
        System.out.println("Admin berhasil logout.");
    }

    public void ubahStatusKamar(Kamar kamar, boolean status) {
        if (kamar != null) {
            kamar.ubahStatus(status);
            System.out.println("Status kamar berhasil diubah.");
            System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
            System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
            System.out.println("Tersedia: " + (status ? "Ya" : "Tidak"));
        } else {
            System.out.println("Kamar tidak ditemukan.");
        }
    }
}