/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matematika;

/**
 *
 * @author uding
 */
public class MatematikaInheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika2 m1 = new Matematika2();
        
        int hTambah = m1.tambah(20,10);
        System.out.println("Pertambahan 20 + 10: " + hTambah);
    
        int hKurang = m1.kurang(10,5);
        System.out.println("Penurangan 10 - 5: " + hKurang);
    
        int hKali = m1.kali(10,3);
        System.out.println("Perkalian 10 x 3: " + hKali);
    
        int hBagi = m1.bagi(21,2);
        System.out.println("Pembagian 21/2: " + hBagi);
        
        int hModulus = m1.modulus(20, 11);
        System.out.println("Modulus 20%11: " +hModulus);
    }
    
}
