/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1;

/**
 *
 * @author uding
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ayam = 10;
        do {
            if (ayam == 1) {
                System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal " + (ayam - 1) + ".");
            }
            ayam--;
        } while (ayam > 0);
    }
}