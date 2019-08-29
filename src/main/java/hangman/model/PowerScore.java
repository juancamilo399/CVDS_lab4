package hangman.model;

public class PowerScore implements GameScore {

	@Override
	/**
	 * @pre Inicia con 0 puntos, la cantidad de jugadas correctas e incorrectas son ambas mayores o iguales a 0 
	 * @pos Se obtiene el puntaje del jugador dados la cantidad de jugadas correctas e incorrectas,
	 * el minimo puntaje es 0, el puntaje se calcula teniendo en cuenta
	 * que La $i-ésima$ letra correcta se bonifica con $5^i$.Se penaliza con 8 puntos cada letra incorrecta.
	 * Si  sobrepasa 500 puntos, el puntaje es 500.
	 * @param correctCount el numero de jugadas correctas del jugador
	 * @param incorrectCount el numero de jugadas incorrectas del jugador
	 * @throws ParametrosInvalidosException si alguno de los parametros es negativo  
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		return 0;
	}

}
