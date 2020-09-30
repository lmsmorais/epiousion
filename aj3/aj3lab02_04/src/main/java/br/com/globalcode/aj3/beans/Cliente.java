/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.beans;

public class Cliente {

	private String nome;
	private String telefone;
	private String cpf;
	private int id;

	/**
	 * @param nome
	 *            Nome do cliente
	 * @param telefone
	 *            Telefone do cliente
	 * @param cpf
	 *            CPF do cliente
	 * @param id
	 *            ID do cliente
	 */
	public Cliente(String nome, String telefone, String cpf, int id) {
		this(nome, telefone, cpf);
		this.id = id;
	}

	/**
	 * Este construtor podera ser utilizado quando o id do cliente precisar ser
	 * atribuido depois, como por exemplo quando e necessario criar o cliente
	 * para salvar no banco de dados, onde o id e gerado automaticamente.
	 * 
	 * @param nome
	 *            Nome do cliente
	 * @param telefone
	 *            Telefone do cliente
	 * @param cpf
	 *            CPF do cliente
	 * 
	 */
	public Cliente(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return CPF do Cliente
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @return ID do cliente
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return Nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return Telefone do cliente
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param cpf
	 *            CPF do cliente
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @param id
	 *            ID do cliente
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nome
	 *            Nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param telefone
	 *            Telefone do cliente
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		String cliente = " ID [" + this.id + "]";
		cliente += this.nome + "\t CPF (" + this.cpf + " ) \t";
		cliente += "- Tel: {" + this.telefone + "}";
		return cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
}
