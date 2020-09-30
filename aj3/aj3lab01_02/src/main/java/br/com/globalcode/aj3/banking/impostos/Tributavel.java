/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package br.com.globalcode.aj3.banking.impostos;

public interface Tributavel {
	public String getDescricaoTributavel();

	public String getNomeImposto();

	public double calcularImpostos();
}
