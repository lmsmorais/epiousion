/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package br.com.globalcode.aj3.teste;

import java.util.Date;

public class TestePrintf {

	public static void main(String[] args) {

		// Mostre a data no formato dd/mm/yyyy
		Date data = new Date();
		System.out.printf("%td/%<tm/%<ty \n", data);

		// Mostre o numero inteiro com 6 digitos e zeros a esquerda
		int i = 101;
		System.out.printf("%06d \n", i);

		// Mostre o numero double com 2 casas decimais
		double numero = 23.45;
		System.out.printf("%.2f \n", numero);
	}
}
