/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
    	Cliente cliente1 = new Cliente();
        // Inicializacao do cliente
    	cliente1.inicializaCliente("Ministro", "111.222.333-44");
        // Impressao dos dados do cliente
    	cliente1.imprimeDados();
    }
}
