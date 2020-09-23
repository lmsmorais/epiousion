package br.com.epiousion.aj1;
/**
 * Classe com o objetivo de praticar a utiliza√ß√£o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
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
	int anoAtual = 2009;
	double aliquota = 0.20;
	int anoNascimento = anoAtual - idade;
	String sexoPorExtenso;
	
	/*Condicao para exibir sexo por extenso*/
	if(sexo == 'M') {
		sexoPorExtenso = "Masculino";
	}else{
		sexoPorExtenso = "Feminino";
	}
	
	double impostoDevido = salario * aliquota;
	
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) no ano de " + anoNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexoPorExtenso;
	String textTrabalho = ", est· registrado(a) com o sal·rio de R$ " + salario;
	String textImposto = " e pagar· R$ " + impostoDevido + " de imposto.";
	
	/*Condicao para referenciar a linguagem de acordo com o genero*/
	switch(sexo) {
	case 'M' :
		textNome = "O Senhor " + nome;
		textNasc = ", nascido no ano de " + anoNascimento;
		textRg = " portador do rg de numero " + rg + ", \n";
		textTrabalho = ", est· registrado com o sal·rio de R$ " + salario;
				break;
	case 'F':
		textNome = "A Senhora " + nome;
		textNasc = ", nascida no ano de " + anoNascimento;
		textRg = " portadora do rg de numero " + rg + ", \n";
		textTrabalho = ", est· registrada com o sal·rio de R$ " + salario;
	}
	System.out.println(textNome + textNasc + textRg + textSexo + textTrabalho + textImposto );
  }
}
