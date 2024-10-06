/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal3;

/**
 *
 * @author uding
 */
public class IMT {
    double bb;
    double tb;
    String kriteria;
    double rumus;
    
    void Perhitungan(){
        rumus = bb / (tb*tb);
        
        if (rumus <18.5){
            kriteria = "Berat badan kurang ideal";
        }else if(rumus >=8.5 && rumus <=24.9){
            kriteria = "Berat badan ideal";
        }else if(rumus >=25 && rumus <+29.9){
            kriteria = "Berat badan lebih";
        }else if(rumus >=30.9 && rumus <=39.9){
            kriteria = "Gemuk";
        }else{
            kriteria = "Sangat gemuk";
        }
    }
    
    void Output(){
        System.out.println("Berat badan anda : " +bb);
        System.out.println("Tinggi badan anda : " +tb);
        System.out.println("Nilai IMT anda : " +rumus);
        System.out.println("Kriteria anda : " +kriteria);
    }
    
}