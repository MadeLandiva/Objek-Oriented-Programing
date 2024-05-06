/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t, x, a, b, h;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Perkalian: ");
        x = sc.nextInt();
        System.out.print("Masukkan nilai awal: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        b = sc.nextInt();
        
        for (t=a; t<=b; t++){
            h = x*t;
            System.out.println(x+ " x "+ t +" = "+h );
        }
    }
    
}
