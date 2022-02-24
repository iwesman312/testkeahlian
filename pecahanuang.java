/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaifaktorial;

import java.util.Scanner;

/**
 *
 * @author al kurni
 */
public class pecahanuang {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Uang : ");
        double jumlah = input.nextDouble();
        int ratusRibu = (int)(jumlah / 100000);
        int sisa = (int)(jumlah % 100000);
        int limapuluhRibu = (sisa / 50000);
        sisa = sisa % 50000;
        int duapuluhribu = (sisa / 20000);
        sisa = sisa % 20000;
        int ribu = (sisa / 5000);
        sisa = sisa % 5000;
        int ribuan = (sisa / 1000);
        sisa = sisa % 1000;
        int puluhan = (sisa / 50);
        sisa = sisa % 50;

        
        System.out.println("Jumlah Uang = " + jumlah);
        System.out.println("Jumlah Pecahan 100000 = " + ratusRibu);
        System.out.println("Jumlah Pecahan 50000 = " + limapuluhRibu);
        System.out.println("Jumlah Pecahan 20000 = " + duapuluhribu);
        System.out.println("Jumlah Pecahan 1000 = " + ribuan);
        System.out.println("Jumlah Pecahan 5000 = " + ribu);
        System.out.println("Jumlah Pecahan 50 = " + puluhan);
    }
}

