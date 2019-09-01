package hangman.model;
import org.junit.Test;

import hangman.model.*;

import org.junit.Assert;

/**
 * 
 * Clases de equivalencia para OriginalScore: 
 * 1. parametros invalidos (-1,0), (-2,0), (0,-1), (0,-2), (0,0)
 * 2. puntaje entre 0 y 100  (0,1),(0,0),(1,2)
 * 3.puntaje menor que 0 (0,10), (0,11), (0,9)
 *  Clases de equivalencia para BonusScore: 
 * 1. parametros invalidos (-1,0), (-2,0), (0,-1), (0,-2), (0,0)
 * 2. puntaje mayor que 0 (1,0), (5,9), (0,0)
 * 3.puntaje menor que 0 (5,10), (5,11), (0,0)
 * Clases de equivalencia para PowerBonusScore: 
 * 1. parametros invalidos (-1,0), (-2,0), (0,-1), (0,-2), (0,0)
 * 2. puntaje entre  0 y 500 (3,19), (3,20),(4,0), (0,0)
 * 3.puntaje menor que 0 (1,1), (0,1), (0,0)
 * 3.puntaje mayor que 500 (4,0)
 */
public class GameScoreTest {
	
	@Test
	public void parametrosInvalidosOriginalScoreTest() {
		GameScore a = new OriginalScore();
		try {
			a.calculateScore(-1,0);
		}
		catch (HangmanException e) {
			Assert.assertEquals(e.getMessage(), HangmanException.PARAMETROS_INVALIDOS);
		}
		
	}
	
	@Test
	public void parametrosInvalidosBonusScoreTest() {
		GameScore a = new BonusScore();
		try {
			a.calculateScore(1,-1);
		}
		catch (HangmanException e) {
			Assert.assertEquals(e.getMessage(), HangmanException.PARAMETROS_INVALIDOS);
		}
		
	}
	
	@Test
	public void parametrosInvalidosPowerBonusScoreTest() {
		GameScore a = new BonusScore();
		try {
			a.calculateScore(-1,-1);
		}
		catch (HangmanException e) {
			Assert.assertEquals(e.getMessage(), HangmanException.PARAMETROS_INVALIDOS);
		}
		
	}
	
	@Test
	public void puntaje0A100OriginalScore() {
		GameScore a = new OriginalScore();
		try {
			int actual = a.calculateScore(0,0);
			int actual1 = a.calculateScore(0,1);
			int actual2 = a.calculateScore(1,2);
			Assert.assertEquals(100, actual);
			Assert.assertEquals(90, actual1);
			Assert.assertEquals(80, actual2);
		}
		catch (HangmanException e) {}
		
		
	}
	@Test
	public void puntajeMenor0OriginalScore() {
		GameScore a = new OriginalScore();
		try {
			int actual = a.calculateScore(0,10);
			int actual1 = a.calculateScore(0,11);
			int actual2 = a.calculateScore(0,9);
			Assert.assertEquals(0, actual);
			Assert.assertEquals(0, actual1);
			Assert.assertEquals(10, actual2);
		}
		catch (HangmanException e) {}
		
	}
	
	@Test
	public void puntajeMayor0BonusScore() {
		GameScore a = new BonusScore();
		try {
			int actual = a.calculateScore(1,0);
			int actual1 = a.calculateScore(5,9);
			int actual2 = a.calculateScore(0,0);
			Assert.assertEquals(10, actual);
			Assert.assertEquals(5, actual1);
			Assert.assertEquals(0, actual2);
		}
		catch (HangmanException e) {}
		
	}
	
	@Test
	public void puntajeMenor0BonusScore() {
		GameScore a = new BonusScore();
		try {
			int actual = a.calculateScore(5,10);
			int actual1 = a.calculateScore(5,11);
			int actual2 = a.calculateScore(0,0);
			
			Assert.assertEquals(0, actual);
			Assert.assertEquals(0, actual1);
			Assert.assertEquals(0, actual2);
		}
		catch (HangmanException e) {}
		
	}
	
	@Test
	public void puntaje0A500PowerBonusScore() {
		GameScore a = new PowerBonusScore();
		try {
			int actual = a.calculateScore(3,19);
			int actual1 = a.calculateScore(3,18);
			Assert.assertEquals(3, actual);
			Assert.assertEquals(11, actual1);
		}
		catch (HangmanException e) {}
	}
	
	
	@Test
	public void puntajeMaximo500PowerBonusScore() {
		GameScore a = new PowerBonusScore();
		try {
			int actual = a.calculateScore(4,0);
			int actual1 = a.calculateScore(5,0);
			Assert.assertEquals(500, actual);
			Assert.assertEquals(500, actual1);
		}
		catch (HangmanException e) {}
	}
	
	@Test
	public void puntajeMenor0PowerBonusScore() {
		GameScore a = new PowerBonusScore();
		try {
			int actual = a.calculateScore(1,1);
			int actual1 = a.calculateScore(0,1);
			int actual2 = a.calculateScore(0,0);
			Assert.assertEquals(0, actual);
			Assert.assertEquals(0, actual1);
			Assert.assertEquals(0, actual2);
		}
		catch (HangmanException e) {}
		
	}
	

}
