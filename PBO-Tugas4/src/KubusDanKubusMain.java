/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

class Kubus extends Perhitungan{
    private double sisi;
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    public double hitungVol(){
        return Math.pow(sisi,3);
    }
    
    public double hitungLuas(){
        return 6 * Math.pow(sisi,2);
    }
}

/**
 *
 * @author uding
 */
public class KubusDanKubusMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus k1 = new Kubus(10);
        System.out.println("Volume Kubus : " + k1.hitungVol());
        System.out.println("Luas Kubus : " +k1.hitungLuas());
    }
    
}
