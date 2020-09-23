package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {

	int inicio = 100;
	int fim = 200;
	 
	for(int i=inicio; i<=fim; i++) {
		/*primeiro comparar o condicao composta*/
		if(i%2 == 0 && i%3 == 0) {
			System.out.println(i+ "� divis�vel por 2 e 3, portanto � divis�vel por 6");
		} else if (i%2 == 0) {
			System.out.println(i+ "� divis�vel por 2");
		} else if(i%3 == 0) {
			System.out.println(i+ "� divis�vel por 3");
		}
	}
	  
  }
}
