package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ArraysBidimensionais {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String args[]) {
	int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
	
	/*Para cada iteracao, e atribuido a i o valor do elemento*/
	for(int[] i : array) {
		/*cada j recebe o valor de i, possibilitando o print do array completo*/
		for(int j : i) {
			System.out.println(j);
		}
	}
  }
}
