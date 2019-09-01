package hangman.model;

public class BonusScore implements GameScore {
	
	@Override
	/**
	 * @pre Inicia con 0 puntos, la cantidad de jugadas correctas e incorrectas son ambas mayores o iguales a 0 
	 * @pos Se obtiene el puntaje del jugador dados la cantidad de jugadas correctas e incorrectas,
	 * el minimo puntaje es 0, el puntaje se calcula teniendo en cuenta
	 * que Se bonifica con 10 puntos cada letra correcta.Se penaliza con 5 puntos cada letra incorrecta.
	 * @param correctCount el numero de jugadas correctas del jugador
	 * @param incorrectCount el numero de jugadas incorrectas del jugador
	 * @throws ParametrosInvalidosException si alguno de los parametros es negativo  
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		if (correctCount < 0 || incorrectCount < 0) {throw new HangmanException(HangmanException.PARAMETROS_INVALIDOS);}
		return Math.max(0, ((correctCount*10)-(incorrectCount*5)));
	}

}
