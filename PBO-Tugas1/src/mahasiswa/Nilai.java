/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author uding
 */
public class Nilai {
    String npm;
	String nama;
	
	float NilaiAbsen;
	float NilaiTugas;
	float NilaiUTS;
	float NilaiUAS;
	float NilaiAkhir;
	
	void nilai() {
		NilaiAbsen = NilaiAbsen * 10/100;
		NilaiTugas = NilaiTugas * 20/100;
		NilaiUTS = NilaiUTS * 30/100;
		NilaiUAS = NilaiUAS * 40/100;
		NilaiAkhir = NilaiAkhir + NilaiTugas + NilaiUTS + NilaiUAS + NilaiAkhir;
	}
	
	void CetakNilai() {
		System.out.println("Nim anda : " + npm);
		System.out.println("Nama anda : " + nama);
		System.out.println("Nilai absen anda : " + NilaiAkhir);
		System.out.println("Nilai tugas anda : " + NilaiTugas);
		System.out.println("Nilai UTS anda : " + NilaiUTS);
		System.out.println("Nilai UAS anda : " + NilaiUAS);
		System.out.println("Nilai Akhir anda : " + NilaiAkhir);
	}
}
