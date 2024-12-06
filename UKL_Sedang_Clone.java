/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_sedang;

import java.util.Scanner;

/**
 *
 * @author pradipta daniswara
 */
public class UKL_Sedang {

    /**
     * @param args the command line arguments
     */
    public static double hitungLuasPermukaanBola(double Jarijari) {
        double phi = 3.14;
        return 4 * phi * Jarijari * Jarijari;
    }

    public static double hitungLuasBola(double Jarijari) {
        double phi = 3.14;
        return phi * Jarijari * Jarijari;
    }

    public static void main(String[] args) {
        String bangun;
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Masukan panjang jari-jari :");
        Double Jarijari = scanner.nextDouble();

        
            Double LuasLingkaran = hitungLuasBola(Jarijari);
            System.out.println("Jari-jari yang anda masukkan adalah  " + Jarijari + " maka luasnya adalah " + LuasLingkaran);
      

            // TODO code application logic here
        }

    }

