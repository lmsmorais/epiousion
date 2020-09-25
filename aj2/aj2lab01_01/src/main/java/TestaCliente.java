/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um objeto da classe Cliente 
 * 2) Inicialize todos os atributos deste objeto
 * 3) Imprima os valores dos atributos da classe Cliente de forma a obter o seguinte resultado:
 * 
 * --------------------------------- 
 * NOME: Globalcode     CPF : 123154 
 * ---------------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaCliente {

    public static void main(String[] args) {
    	/*Instanciando a classe cliente, ou seja, criando um objeto da mesma*/
    	Cliente cliente1 = new Cliente();
    	
    	/*Inserindo dados a cada atributo da classe cliente
    	 * atraves de seus metodos set*/
    	cliente1.setNome("Ministro");
    	cliente1.setCpf("111.222.333-44");
    	
    	/*Imprimindo os dados atraves dos metodos get*/
    	System.out.println("NOME: "+cliente1.getNome()+"\t CPF : "+cliente1.getCpf());
    	
    }
}
