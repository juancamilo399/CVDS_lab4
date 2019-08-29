package hangman.model;

public class OriginalScore implements GameScore {

	@Override
	/**
	 * @pre Se inicia con 100 puntos, la cantidad de jugadas correctas e incorrectas son ambas mayores o iguales a 0 
	 * @pos Se obtiene el puntaje del jugador dados la cantidad de jugadas correctas e incorrectas,
	 * el minimo puntaje es 0, el puntaje se calcula teniendo en cuenta
	 * que No se bonifican las letras correctas y Se penaliza con 10 puntos con cada letra incorrecta.
	 * @param correctCount el numero de jugadas correctas del jugador
	 * @param incorrectCount el numero de jugadas incorrectas del jugador
	 * @throws ParametrosInvalidosException si alguno de los parametros es negativo  
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		return 0;
	}
	
	


}
