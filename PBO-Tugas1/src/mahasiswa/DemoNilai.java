/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author uding
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai1 = new Nilai();
		
		nilai1.nama = "Muhammad Haikal Syamsuddin";
		nilai1.npm = "2310631170101";
		
		nilai1.NilaiAbsen = 100;
		nilai1.NilaiTugas = 100;
		nilai1.NilaiUTS = 100;
		nilai1.NilaiUAS = 100;
		nilai1.nilai();
		nilai1.CetakNilai();
    }
    
}
