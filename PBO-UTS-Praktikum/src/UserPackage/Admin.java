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
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Login berhasil sebagai Admin");
            return true;  // berhasil
        } else {
            System.out.println("Login gagal");
            return false;  // gagal
        }
    }

    @Override
    public void logout() {
        System.out.println("Admin berhasil logout");
    }

    public void ubahStatusKamar(Kamar kamar, boolean status) {
        kamar.ubahStatus(status);
        System.out.println("Status kamar berhasil diubah.");
    }
}