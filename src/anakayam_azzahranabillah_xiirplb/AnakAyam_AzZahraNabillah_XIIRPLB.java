/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anakayam_azzahranabillah_xiirplb;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL09
 */
public class AnakAyam_AzZahraNabillah_XIIRPLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int d,e,f;
        
        System.out.println("Masukkan Anak Ayam");
        d= sc.nextInt();
        
        for (f=1;f<d;){
            System.out.print("Anak ayam turun " +d);
            System.out.print(" mati " +f);
            d=d-f;
            
            System.out.println(" Tinggal " +d);
        }
        System.out.print("Anak Ayam Turun " +d);
        System.out.print(", mati " +d);
        System.out.println(", Tinggal Induknya ");
    }
    
}
