/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayhello;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class SayHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        String nama, almt;
        int thnL, umr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        nama= sc.nextLine();
        System.out.println("Masukkan Alamat Anda: ");
        almt = sc.nextLine();
        System.out.println("Masukkan Tahun Lahir Anda: ");
        thnL = sc.nextInt();
        
        umr = 2024-thnL;
        
        System.out.println("Hello "+nama+" Apa Kabar");
        System.out.println("Alamat anda: "+almt);
        System.out.println("Sekarang anda berumur :"+umr+"tahun");
    }
    
}
