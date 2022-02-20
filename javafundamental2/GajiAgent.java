package javafundamental2;

import java.util.Scanner;

/**
 *
 * @author Fardan
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* State atau Data field */
        final int gajiPokok = 500000;
        final int hargaPerItem = 50000;
        int totalItem; 
        int bonus=0, minusPenjualan=0;
        int gajiDiterima=0;
        /* Algoritma */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input:");
        totalItem = keyboard.nextInt();
        if (totalItem >= 80) {
            bonus = (totalItem*hargaPerItem) * 35/100;
        } else if (totalItem >= 40) {
            bonus =(totalItem*hargaPerItem) * 25/100;
        } else if (totalItem > 15) {
            bonus = (totalItem*hargaPerItem) * 10/100;
        } else if (totalItem <= 15) {
            minusPenjualan = (15-totalItem) * hargaPerItem * 15/100;
            gajiDiterima = gajiPokok - minusPenjualan;
        }
        if (totalItem > 15){
            gajiDiterima = gajiPokok + bonus;
        }
        System.out.println("================================");
        System.out.println("Result:");
        System.out.println(gajiDiterima);
    }
}