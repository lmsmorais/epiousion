package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain {
  /**
   * M√©todo para que esta classe possa ser executada com o utilit√°rio java.
   * 
   * @param args
   *          - argumentos para o m√©todo main
   */
  public static void main(String[] args) {
  
	  /*Para validar a quantidade de argumentos recebidos dentro da classe main
	   * podemos utilizar seu array de strings, "args" */
	  if(args.length < 5) {
		  System.out.println("Para executar a classe È necess·rio: ");
          System.out.println("java ParametrosMain <nome> <data nascimento> <rg> <sexo> <salario>");
	  } else {
		  /*para cada variavel do tipo string e atribuido sua posicao dentro de args
		   * para entrar na condicao if */
	String nome = args[0];
	String dataNascimento = args[1];
	String rg = args[2];
	String salario = args[3];
	String sexo = args[4];
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", est· registrado(a) com o sal·rio de R$ " + salario
	    + ".";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);
	
	  }
  }
}
