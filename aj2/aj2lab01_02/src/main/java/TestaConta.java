/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
    	Conta conta1 = new Conta();
        // Inicializacao da conta
    	conta1.inicializaConta(10000.00, "123456", "ministro", 12, 22);
        // Impressao dos dados da conta
    	conta1.imprimeDados();
        // Saque da conta
    	conta1.saque(5000.00);
        // Impressao dos dados da conta
    	conta1.imprimeDados();
        // Deposito em conta
    	conta1.deposito(10000.00);
        // Impressao dos dados da conta
    	conta1.imprimeDados();
    }
}
