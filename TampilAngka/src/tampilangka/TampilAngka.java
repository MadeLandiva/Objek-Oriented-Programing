/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilangka;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class TampilAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x, n, y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        n = sc.nextInt();
        System.out.print("Masukkan nilai Akhir: ");
        y = sc.nextInt();

        for (x = n; x <= y; x++) {
            System.out.println(x);
        }

    }

}
