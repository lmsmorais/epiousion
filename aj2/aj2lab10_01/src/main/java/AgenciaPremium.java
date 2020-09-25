/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *
 * 
 * 1) Modifique esta classe para que herde de Agencia
 * 
 * 2) Acrescente um construtor valido. 
 * 
 * 3) Sobrescreva o metodo abstrato ajustarLimiteIndividual
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver negativo, abaixo de -5000.00 o limite deve ser ajustado para 1000.00
 *    b) se o saldo estiver positivo, abaixo de +5000.00 o limite deve ser ajustado para 30% do saldo  
 *    c) se o saldo estiver positivo, acima de  +5000.00 o limite deve ser ajustado para 50% do saldo
 * 
 */
public class AgenciaPremium extends Agencia{

	private double saldoMinimo;
	private double saldoMaximo;
	
	public AgenciaPremium(String num, Banco bc) {
		super(num, bc);
		this.setSaldoMinimo(saldoMinimo);
		this.setSaldoMaximo(saldoMaximo);
	}
	
	@Override
	protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
		// TODO Auto-generated method stub
		/*saldos negativos abaixo de -5000.0 tem apenas 1000.00 de limite*/
		if(contaEspecial.getSaldo() < -5000.00) {
			contaEspecial.setLimite(1000.00);
			/*saldos positivos e menores que 5000.00, recebem 30% do valor sobre saldo em limite*/
		} else if(contaEspecial.getSaldo() > 0 && contaEspecial.getSaldo() < 5000.00) {
			contaEspecial.setLimite(contaEspecial.getLimite()*.70);
			/*saldos acima de 5000.00, recebem 50% do valor sobre saldo em limite*/
		} else if(contaEspecial.getSaldo() > 5000.00) {
			contaEspecial.setLimite(contaEspecial.getSaldo() * .50);
		}
		
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	public void setSaldoMaximo(double saldoMaximo) {
		this.saldoMaximo = saldoMaximo;
	}


}
