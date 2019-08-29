package hangman.model;

public class PowerBonusScore implements GameScore {

	@Override
	/**
	 * @pre Inicia con 0 puntos, la cantidad de jugadas correctas e incorrectas son ambas mayores o iguales a 0 
	 * @pos Se obtiene el puntaje del jugador dados la cantidad de jugadas correctas e incorrectas,
	 * el minimo puntaje es 0, el puntaje se calcula teniendo en cuenta
	 * que La i-esima letra correcta se bonifica con 5^i.Se penaliza con 8 puntos cada letra incorrecta.
	 * Si  sobrepasa 500 puntos, el puntaje es 500.
	 * @param correctCount el numero de jugadas correctas del jugador
	 * @param incorrectCount el numero de jugadas incorrectas del jugador
	 * @throws ParametrosInvalidosException si alguno de los parametros es negativo  
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int tot=0;
		for(int i=0;i<correctCount;i++) {
			tot+=Math.pow(5, i+1);
		}
		tot=Math.min(tot,500);
		tot-=incorrectCount*8;
		return Math.max(tot, 0);
	}

}
