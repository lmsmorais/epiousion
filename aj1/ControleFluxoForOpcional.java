package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utiliza√ß√£o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * M√©todo para que esta classe possa ser executada com o utilit√°rio java.
   * 
   * @param args
   *          - argumentos para o m√©todo main
   */
  public static void main(String[] args) {

	int inicio = 100;
	int fim = 200;
	 
	for(int i=inicio; i<=fim; i++) {
		/*primeiro comparar o condicao composta*/
		if(i%2 == 0 && i%3 == 0) {
			System.out.println(i+ "È divisÌvel por 2 e 3, portanto È divisÌvel por 6");
		} else if (i%2 == 0) {
			System.out.println(i+ "È divisÌvel por 2");
		} else if(i%3 == 0) {
			System.out.println(i+ "È divisÌvel por 3");
		}
	}
	  
  }
}
