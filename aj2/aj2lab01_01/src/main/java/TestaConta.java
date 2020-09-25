/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	
    	/*Instancia a classe Conta*/
    	Conta conta1 = new Conta();
    	
    	/*inserindo dados atrves doa metodos set*/
    	conta1.setAgencia(1);
    	conta1.setBanco(234);
    	conta1.setNumero("01945");
    	conta1.setTitular("Ministro");
    	conta1.setSaldo(10000.0);
    	
    	/*imprimindo seus valores atraves dos metodos get*/
    	System.out.println("AGENCIA: "+conta1.getAgencia()+" BANCO : "+conta1.getBanco());
    	System.out.println("NUMERO : "+conta1.getNumero());
    	System.out.println("TITULAR: "+conta1.getTitular());
    	System.out.println("SALDO : R$"+conta1.getSaldo());
    	
    }
}
