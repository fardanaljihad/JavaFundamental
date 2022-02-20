package javafundamental2;

import java.util.Scanner;

/**
 *
 * @author Fardan
 */
public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* State atau Data field */
        int i, idx;
        /* Algoritma */
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Masukkan banyak test case: ");
        i = keyboard.nextInt();
        String str[] = new String[i];
        int number[] = new int[i];
        System.out.println("Input:");
        for (idx=0; idx < i; idx++) {
            str[idx] = keyboard.next();
            number[idx] = keyboard.nextInt();
        }
        System.out.println("================================");
        System.out.println("Result:");
        for (idx=0; idx < i; idx++) {
            System.out.printf("%-15s%03d\n", str[idx], number[idx]);
        }
    }
}
