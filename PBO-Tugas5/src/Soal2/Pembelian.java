/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author uding
 */
public class Pembelian {
    double totalPembelian;
    double potonganHarga;
    double totalHarga;
    String besarPotongan;
    
    void Perhitungan(){
        
        if(totalPembelian < 50000){
            potonganHarga = totalPembelian * 0.05;
            besarPotongan = "5%";
        }else{
            potonganHarga = totalPembelian * 0.20;
            besarPotongan = "20%";
        }
        
        totalHarga =  totalPembelian - potonganHarga;
        
        }
    
    void Output(){
        System.out.println("Total pembelian : Rp. " +totalPembelian);
        System.out.println("Besarnya potongan : Rp. " +potonganHarga+"("+besarPotongan+")");
        System.out.println("Jumlah yang harus dibayarkan : " + potonganHarga);
    }
            
        
    }
    
    

