/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1;

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
        Karyawan k1 = new Karyawan ("Otong",1002,5000,"Developer");
        Manajer m1 = new Manajer ("Surotong",1001,10000,"Manajer IT", "IT");
        
        System.out.println("Karyawan: " +k1.getNama()+ ", hari kerja: " +k1.hitungHariKerja());
        
        m1.mengelolaKaryawan();
        m1.bekerja();
        
    }
    
}
