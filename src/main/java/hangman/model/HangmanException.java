package hangman.model;

public class HangmanException extends Exception {
	public static final String PARAMETROS_INVALIDOS = "no se permiten parametros negativos";
	public HangmanException(String mensaje){
		super(mensaje);
	}
}
