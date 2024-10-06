/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;  

/**
 *
 * @author uding
 */
public class Data {
    
    String npm;
    String nama;
    double absen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiRata;
    String grade;
    String keterangan;
    double nilaiAkhir;  
    
    void Perhitungan(){
        nilaiAkhir = (0.1 * absen) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        nilaiRata = (absen + nilaiTugas + nilaiUTS + nilaiUAS)/4;
        
        if (nilaiAkhir >= 76){
            grade = "A";
                    keterangan = "ISTIMEWA";
        }else if (nilaiAkhir >= 66){
            grade = "B";
                    keterangan = "BAIK";
        }else if (nilaiAkhir >= 56){
            grade = "C";
                    keterangan = "CUKUP";
        }else if (nilaiAkhir >= 46){
            grade = "D";
                    keterangan = "KURANG";
        }else{
            grade = "E";
                    keterangan = "SANGAT KURANG";
        }
    }
    
    void DataInfo(){
        System.out.println("NPM mahasiswa : " + npm);
        System.out.println("Nama mahasiswa : " +nama);
        System.out.println("Nilai rata-rata : " +nilaiRata);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
