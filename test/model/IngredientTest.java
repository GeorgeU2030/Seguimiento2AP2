package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	
	private Ingredient ingredient;
	public void setupStage1() {
		ingredient = new Ingredient("Tomate",245);
	}

	@Test
	void newIngredientTest() {
		setupStage1();
		try {
		ingredient.addWeight(54);
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		double weight = ingredient.getWeight();
		assertEquals(weight,299);
	}
	@Test
	void exceptionWeightTest() {
		setupStage1();
		boolean flagException=false;
		try {
		ingredient.addWeight(-100);
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
			flagException=true;
		}
		assertTrue(flagException);
		assertEquals(ingredient.getWeight(),245);
	}
	
	@Test
	void removeWeightTest() {
		setupStage1();
		try {
		ingredient.removeWeight(45);
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		
		double weight = ingredient.getWeight();
		assertEquals(weight,200);
	}
	@Test
	void removeWeightExceptionTest() {
		setupStage1();
		boolean flagException=false;
		try {
			ingredient.removeWeight(-100);
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
			flagException=true;
		}
		assertTrue(flagException);
		assertEquals(ingredient.getWeight(),245);
	}
	
}
