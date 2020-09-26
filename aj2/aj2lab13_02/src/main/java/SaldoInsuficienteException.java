
public class SaldoInsuficienteException extends Exception {

	/*Criando construtores para aceitar string de erro*/
	
	public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(Throwable cause) {
        super(cause);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }
	
}
