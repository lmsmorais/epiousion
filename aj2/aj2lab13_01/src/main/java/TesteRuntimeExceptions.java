public class TesteRuntimeExceptions {

    public static void main(String[] args) {
        // Leitura do parametro digitado pelo usuario como parametro do main
    	try {
        String parametro1 = "teste";
        int numero = Integer.parseInt(parametro1);
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("iformar parametro correto");
    	}catch(NumberFormatException e) {
    		System.out.println("insira parametro numerico");
    	}
    }
}

/*Quando compilado pela primeira vez, gerou uma exception: Thread [main] (Suspended (uncaught exception ArrayIndexOutOfBoundsException))	
	TesteRuntimeExceptions.main(String[]) line: 5	
	
	ArrayIndexOutOfBoundsException = posição inexistente no vetor
	
	para tratarmos essa exception devemos condicionar com ArrayIndexOutOfBoundsException
	
	Ao compilar utilizando a string teste como parâmetro, recebemos a exception: Thread [main] (Suspended (uncaught exception NumberFormatException))	
	Integer.parseInt(String, int) line: not available	
	Integer.parseInt(String) line: not available	
	TesteRuntimeExceptions.main(String[]) line: 6	
	
	ao tentarmos passar uma string para uma variavel numerica, recebemos NumberFormatException

*/