package br.com.globalcode.aj3.teste;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteTreeSet {
	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");
		
		//Define a coleÃ§Ã£o do tipo TreeSet
		Set<Cliente> clientes = new TreeSet<Cliente>();
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		Iterator<Cliente> ponteiroClientes = clientes.iterator();
		while (ponteiroClientes.hasNext()) {
			System.out.println(ponteiroClientes.next());
		}
	}
}