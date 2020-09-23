package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhile {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	  
	  char inicio = 'F';
	  char fim = 'Z';
	  
	  /*exibindo caracteres enquanto nao satisfeita a condicao*/
	  while(inicio <= fim) {
		  System.out.println(inicio++);
	  }
  }
}
