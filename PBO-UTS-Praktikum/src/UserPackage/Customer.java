/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPackage;

/**
 *
 * @author uding
 */
import DataPackage.Pemesanan;

public class Customer implements Pengguna {
    private String username;
    private String password;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Login berhasil sebagai Customer");
            return true;  // berhasil
        } else {
            System.out.println("Login gagal");
            return false;  // gagal
        }
    }

    @Override
    public void logout() {
        System.out.println("Customer berhasil logout");
    }

    public Pemesanan buatPesanan(int idPesanan, String namaPelanggan, int nomorKamar, int durasi) {
        // Implementasi untuk membuat pesanan
        return new Pemesanan(idPesanan, namaPelanggan, nomorKamar, durasi);
    }
}