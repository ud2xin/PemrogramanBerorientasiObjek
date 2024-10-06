/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1;

import java.util.Scanner;

/**
 *
 * @author uding
 */
public class DataMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        Data m1 = new Data();
        
        System.out.println("Masukan npm mahasiswa : ");
        m1.npm = scanner.nextLine();
        
        System.out.println("Masukan nama mahasiswa : ");
        m1.nama = scanner.nextLine();
        
        System.out.println("Masukan nilai kehadiran mahasiswa : ");
        m1.absen = scanner.nextDouble();
                
        System.out.println("Masukan nilai tugas mahasiswa : ");
        m1.nilaiTugas = scanner.nextDouble();
        
        System.out.println("Masukan nilai UTS mahasiswa : ");
        m1.nilaiUTS = scanner.nextDouble();
        
        System.out.println("Masukan nilai UAS mahasiswa : ");
        m1.nilaiUAS = scanner.nextDouble();
        
        m1.Perhitungan();
        m1.DataInfo();
        
    }
    
}
