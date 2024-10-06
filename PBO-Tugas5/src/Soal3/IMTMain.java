/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author uding
 */
public class IMTMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new Scanner(System.in);
        
        IMT b1 = new IMT();
        System.out.println("Masukan berat badan anda(Kg) : ");
        b1.bb = scanner.nextDouble();
        System.out.println("Masukan tinggi badan anda(M) : " );
        b1.tb = scanner.nextDouble();
        
        b1.Perhitungan();
        b1.Output();
    }
    
}
