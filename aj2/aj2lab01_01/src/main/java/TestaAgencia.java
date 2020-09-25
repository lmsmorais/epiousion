/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Agencia
 * 2) Inicialize todos os atributos deste objeto
 * 3) Imprima os valores dos atributos da classe Agencia de forma a obter o
 * seguinte resultado:
 * 
 * -----------------------------
 * AGENCIA: 1    BANCO  : 234
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaAgencia {

    public static void main(String[] args) {
    	
    	/*Intanciando a classe agencia*/
    	Agencia agencia1 = new Agencia();
    	
    	/*setando os atributos*/
    	agencia1.setNumero("234");
    	agencia1.setBanco(1);
    	
    	System.out.println("AGENCIA: "+agencia1.getBanco()+"\t BANCO : "+agencia1.getNumero());
    	
    	
    }
}
