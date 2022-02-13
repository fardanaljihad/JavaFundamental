/**
 * Program untuk menghitung jumlah panjang elemen dari dua buah String,
 * membandingkan dua buah String, dan menggabungkan dua buah String
 * @version 1.0 13-02-2022
 * @author Fardan A
 */

import java.util.Scanner;
import java.lang.String;

public class DataTypeString {
	public static void main(String[] args) {
		/* Kamus Data */
		String A, B;
		
		/* Algoritma */
		Scanner sc = new Scanner(System.in);
		A = sc.nextLine();
		B = sc.nextLine();
		System.out.println("The sum the lengths of A and B is " + (A.length() + B.length()));
		
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		  }
		// Menggabungkan dua buah String dengan mengubah huruf awalnya menjadi huruf kapital
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " 
		+ B.substring(0, 1).toUpperCase() + B.substring(1));
	}
}
