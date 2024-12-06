/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_mudah;

/**
 *
 * @author pradipta daniswara
 */
public class UKL_Mudah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for (int i = 50; i >= 1; i--) {
           System.out.print(i + ". ");

            // Kondisi untuk memilih kalimat sesuai pola
            if (i == 1) {
                System.out.println("saya senang");
            } else if (i % 3 == 0) {
                System.out.println("saya anak wikusama");
            } else if (i % 2 == 0) {
                System.out.println("saya anak moklet");
            } else {
                System.out.println("saya angkatan 33");
            }
        }
    }
}

