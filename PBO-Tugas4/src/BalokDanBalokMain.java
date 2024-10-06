/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

class Balok extends Perhitungan{
    private double panjang, tinggi, lebar;
    
    public Balok(double panjang, double tinggi, double lebar){
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    
    public double hitungVol(){
        return panjang*lebar*tinggi;
    }
    
    public double hitungLuas(){
        return 2 *(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
}

/**
 *
 * @author uding
 */
public class BalokDanBalokMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok b1 = new Balok(10,15,20);
        System.out.println("Volume Balok : " + b1.hitungVol());
        System.out.println("Lebar Balok : " + b1.hitungLuas());
    }
    
}
