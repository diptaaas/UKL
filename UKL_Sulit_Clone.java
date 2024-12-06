/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_sulit;
 import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pradipta daniswara
 */
public class UKL_Sulit {

    /**
     * @param args the command line arguments
     */
   
  
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        
        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        ArrayList<Integer> elemenNegatif = new ArrayList<>();

        
        for (int elemen : array) {
            if (elemen < 0) {
                elemenNegatif.add(elemen);
            }
        }

     
        if (!elemenNegatif.isEmpty()) {
            System.out.print("Array mengandung elemen negatif: ");
            for (int i = 0; i < elemenNegatif.size(); i++) {
                System.out.print(elemenNegatif.get(i));
                if (i < elemenNegatif.size() - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }

        scanner.close();
    }
}

    



    


    
    

