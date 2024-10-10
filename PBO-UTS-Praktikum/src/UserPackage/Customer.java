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
import DataPackage.Kamar;

public class Customer implements Pengguna {
    private String username;
    private String password;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void logout() {
        System.out.println("Customer berhasil logout.");
    }

    public Pemesanan buatPesanan(int idPesanan, String namaPelanggan, Kamar kamar, int durasi) {
        return new Pemesanan(idPesanan, namaPelanggan, kamar, durasi);
    }
}