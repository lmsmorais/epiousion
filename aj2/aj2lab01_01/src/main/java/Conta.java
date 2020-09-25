/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Adicione os seguintes atributos na classe Conta: 
 * - saldo (double) 
 * - numero (String) 
 * - titular (String) 
 * - agencia (int) 
 * - banco (int)
 */
class Conta {
	
	/*Atributos privados wooow*/
	private double saldo;
	private String numero;
	private String titular;
	private int agencia;
	private int banco;
	
	
	/*getters i setters*/
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	
	
	
}
