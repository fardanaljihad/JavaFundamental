package javafundamental2;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author Fardan
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* State atau Data field */
        BigInteger a, b;
        /* Algoritma */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input:");
        a = keyboard.nextBigInteger();
        b = keyboard.nextBigInteger();
        System.out.println("================================");
        System.out.println("Result:");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
    
}
