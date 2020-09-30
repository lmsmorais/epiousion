/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteList {

	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");
		List clientes = new ArrayList();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		Cliente c;
		// 1. Imprima somente o nome de cada cliente da lista de clientes
		for(int i=0; i < clientes.size(); i++) {
			c = (Cliente) clientes.get(i);
			System.out.println("Nome: "+c.getNome());	
		
		}
	}
}