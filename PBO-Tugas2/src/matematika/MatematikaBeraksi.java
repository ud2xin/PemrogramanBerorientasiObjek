package matematika;

/**
 *
 * @author uding
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Matematika mtk = new Matematika();
    
    int hTambah = mtk.tambah(20,10);
        System.out.println("Pertambahan 20 + 10: " + hTambah);
    
    int hKurang = mtk.kurang(10,5);
        System.out.println("Penurangan 10 - 5: " + hKurang);
    
    int hKali = mtk.kali(10,3);
        System.out.println("Perkalian 10 x 3: " + hKali);
    
    int hBagi = mtk.bagi(21,2);
        System.out.println("Pembagian 21/2: " + hBagi);    
    
        
    }
    
}
