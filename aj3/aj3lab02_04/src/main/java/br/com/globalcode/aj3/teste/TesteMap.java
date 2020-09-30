/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.teste;

import java.util.HashMap;
import java.util.Map;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteMap {

	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");

		Map clientes = new HashMap();

		clientes.put(c1.getCpf(), c1);
		clientes.put(c2.getCpf(), c2);
		clientes.put(c3.getCpf(), c3);
		clientes.put(c4.getCpf(), c4);

		// Imprima o nome de todos os clientes que estao no Map
		Cliente c;
		String key;
		for(Object o: clientes.keySet()) {
			key = (String) o;
			c = (Cliente) clientes.get(key);
			System.out.println("Nome: "+ c.getNome());
		}
	}
}