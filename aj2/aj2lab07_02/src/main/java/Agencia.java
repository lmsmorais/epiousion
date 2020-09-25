/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Implemente o metodo abrirConta seguindo como modelo o metodo 
 * abrirAgencia da classe Banco. Para isto sera necessario criar os
 * atributos e alterar o construtor conforme foi feito na classe Banco.
 * 
 * 2) Depois de alterar o construtor sera necessario alterar na classe 
 * Banco o metodo abrirAgencia para chamar o construtor valido, ou seja,
 * informando o numero de contas que a agencia podera abrir, utilize um 
 * valor fixo, por exemplo 10.
 *  
 * 3) Crie um metodo que faca a impressao das contas que estao dentro da
 * agencia usando como modelo o metodo imprimirAgencias que esta na classe Banco.
 * 
 */
public class Agencia {

    private String numero;
    private Banco banco;
    private Conta contas[];
    private int numContasAbertas = 0;
    private static int numeroProximaConta = 4242;

    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */
    public Agencia(String num, Banco bc, int numeroMaxContas) {
        numero = num;
        banco = bc;
        contas = new Conta[numeroMaxContas];
    }

    /**
     * @return Numero do banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return Numero da agencia
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param b
     *            banco
     */
    public void setBanco(Banco b) {
        banco = b;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("\nAgencia no. " + numero);
        banco.imprimeDados();
    }
    
    /*metodo para abertura de uma conta dentro da instancia da classe agencia
     * @return Conta que foi criada*/
    public Conta abrirConta(double saldo, Cliente titular) {
    	Conta a = new Conta(saldo, ""+ numeroProximaConta++, titular, this);
    	boolean contaAdicionada = adicionaArrayContas(a);
    	if(contaAdicionada) {
    		return a;
    	} else {
    		return null;
    	}
    }
    
    /*metodo para inclusao da conta recem aberto dentro do array de contas
     * @return retorna um booleano identidicando se a aconta foi inserida com sucesso*/
    private boolean adicionaArrayContas(Conta a) {
    	if(this.contas.length <= numContasAbertas) {
    		System.out.println("BANCO ERROR: Nao foi possivel criar uma nova conta");
    		return false;
    	} else {
    		System.out.println("BANCO DEBUG: Conta adicionada ao array "+numContasAbertas);
    		this.contas[numContasAbertas] = a;
    		numContasAbertas++;
    		return true;
    	}
    }
    
    public void imprimeContas() {
    	
        System.out.println("\n\n=============== RELATORIO DE CONTAS DA AGÊNCIA ==================\n");
        System.out.println("Numero de contas abertas: " +numContasAbertas);
        for (int i = 0; i < numContasAbertas; i++) {
            contas[i].imprimeDados();
        }
        
        System.out.println("===============================================");
        
    }
    
    

    /**
     * @param num
     *            Numero da agencia
     */
    public void setNumero(String num) {
        numero = num;
    }
}