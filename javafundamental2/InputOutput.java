package javafundamental2;

import java.util.Scanner;

/**
 * 
 * 
 * @author Fardan
 * @version 2
 * @since 18-02-2022
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* State atau Data field */
        String s;
        String tokens[];
        int i;
        /* Algoritma */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input: ");
        s = keyboard.nextLine();
        tokens = s.split("[\\s!,?._'@]+");
        System.out.println("================================");
        System.out.println("Result:");
        System.out.println(tokens.length);
        for (i=0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
