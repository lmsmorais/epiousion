/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Analise os atributos e o construtor desta classe
 *  
 * 2) Sobrescreva o metodo abstrato ajustarLimiteIndividual herdado da classe Agencia 
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver abaixo do saldoMinimo o limite deve ser ajustado em -25%
 *    b) se o saldo estiver acima do saldoMaximo o limite deve ser ajustado em +25%
 *      
 */
public class AgenciaPlus extends Agencia {

    private double saldoMinimo;
    private double saldoMaximo;
    
    public AgenciaPlus(String num, Banco bc, double saldoMinimo, double saldoMaximo) {
        super(num, bc);
        this.saldoMinimo = saldoMinimo;
        this.saldoMaximo = saldoMaximo;
    }
    
    
   /*Sobrescrevendo metodo*/
    protected void ajustarLimiteIndividual( ContaEspecial contaEspecial) {
    	
    	if(saldoMinimo > contaEspecial.getSaldo()) {
    		/*ajustando limite para -25% em relacao ao saldo*/
    		contaEspecial.setLimite(contaEspecial.getLimite()* .75);
    	} else if(saldoMaximo < contaEspecial.getSaldo()) {
    		/*ajustando limite para +25% em relacao ao saldo*/
    		contaEspecial.setLimite(contaEspecial.getLimite()*1.25);
    	}
    }
    
    
    public double getSaldoMaximo() {
        return saldoMaximo;
    }

    public void setSaldoMaximo(double saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }
    
    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    

}
