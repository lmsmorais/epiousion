/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package br.com.globalcode.aj3.util;

import java.util.Scanner;

public class Teclado {

	public static String le() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
