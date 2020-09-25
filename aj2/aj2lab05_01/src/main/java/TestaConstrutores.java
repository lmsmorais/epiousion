/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	Conta c1 = new Conta(10000.00,"1234-5","Ministro","45678-9", 63);
    	c1.imprimeDados();
    	
    	Conta c2 = new Conta("1234-6","Doug","45678-8", 64);
    	c2.imprimeDados();
    	
    	Cliente cliente1 = new Cliente("Luis","111.222.333-44");
    	cliente1.imprimeDados();
    	
    }
}
