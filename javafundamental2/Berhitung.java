package javafundamental2;

import java.util.Scanner;

/**
 *
 * @author Fardan
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* State atau Data field */
        short A, B;
        int result=0;
        char operator;
        
        /* Algoritma */
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Rule:\n1 <= A,B <= 1000\nInput:\n");
        do {
            A = keyboard.nextShort();
            operator = keyboard.next().charAt(0);
            B = keyboard.nextShort();
            if (Character.compare(operator, '/') == 0) {
                if (A % B != 0) {
                    System.out.println("A harus habis dibagi B");
                    B = 0;
                }
            }
        } while ((A < 1 || A > 1000) || (B < 1 || B > 1000));
        
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '/':
                result = A / B;
                break;
            case '*':
                result = A * B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                break;
        }
        System.out.println("================================");
        System.out.println("Result:");
        System.out.println(result);
    }
}
