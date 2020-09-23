package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhileOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	  
	int limiteInferior = 14;
	int limiteSuperior = 1578;
	int numerosDiv6 = 0;
	String texto = "Quantidade de numeros divisiveis por 6 entre ";
	
	while(limiteInferior <= limiteSuperior) {
		
		if(limiteInferior%6 == 0) {
			/*se satisfazermos a condicao, incrementa-se a variavel responsavel,
			 * por armazenar a quantidade ocorrida da condicao*/
			numerosDiv6++;
		}
		
		limiteInferior++;
		
	}
	
	System.out.println(texto + limiteInferior + " e " + limiteSuperior
		    + " e : " + numerosDiv6);
  }
}
