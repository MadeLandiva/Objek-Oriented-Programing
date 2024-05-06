/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaarray1;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class CobaArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;
        int rata = 0;
        int[] a = new int[5];
        
        for (i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            a[i] = sc.nextInt();

        }
        System.out.println("");
        System.out.println("ANGKA YANG INPUT");
        System.out.println("----------------------------------");
        System.out.println("");

        for (i = 0; i < 5; i++) {
            System.out.println("Angka ke-" + i + " adalah :" + a[i]);
        }
        
        int max = a[0];
        int min = a[0];

        for (i = 0; i < 5; i++) {
            sum += a[i];
            rata = sum / a.length;
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Total: " + sum);
        System.out.println("Rata: " + rata);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
