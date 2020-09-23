package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utiliza√ß√£o dos operadores com tipos
 * primitivos.
 * 
 * @author Melissa
 */
public class Operadores {
  /**
   * M√©todo para que esta classe possa ser executada com o utilit√°rio java.
   * 
   * @param args
   *          - argumentos para o m√©todo main
   */
  public static void main(String[] args) {
	  
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	@SuppressWarnings("unused")
	int anoAtual = 2009;
	double aliquota = 0.20;
	double impostoDevido = salario * aliquota;
	
	/*Subtrair idade em relacao ao ano atual, para exibirmos o ano de nascimento*/
	int anoNascimento = 2009 - idade;
	
	/*Declarando operador condicional(ternario), para retornar o sexo da passoa a partir da primeira letra*/
	String sexoPorExtenso = sexo == 'M' ? "Masculino" : "Feminino";
	
	
	System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
	System.out.println(anoNascimento + ", portador(a) do RG de n˙mero " + rg);
	System.out.print(", do sexo " + sexoPorExtenso);
	System.out.print(", est· registrado(a) com o sal·rio de R$ " + salario);
	System.out.println(" e pagara R$ " + impostoDevido + " de imposto.");
  }
}
