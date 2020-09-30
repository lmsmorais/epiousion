/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.teste;

import java.sql.Connection;

import br.com.globalcode.aj3.exception.GlobalcodeException;
import br.com.globalcode.aj3.util.ConnectionManager;

public class TesteConexao {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		} catch (GlobalcodeException ge) {
			System.out.println("---> " + ge.getMessage());
			System.out.println("---> Detalhamento do erro: ");
			ge.printStackTrace();
		} finally {
			ConnectionManager.closeAll(conn);
		}
	}

}
