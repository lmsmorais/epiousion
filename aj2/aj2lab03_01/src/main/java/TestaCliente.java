/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
    	Cliente cliente1 = new Cliente();
        // Inicializacao do cliente usando o metodo inicializaCliente
    	cliente1.inicializaCliente("Ministro", "111.222.333-4");
        // Impressao dos dados do cliente
    	cliente1.imprimeDados();
    }
}
