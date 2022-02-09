package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {

	private Recipe recipe;
	
	public void setupStage1() {
		recipe = new Recipe();
	}
	
	public void setupStage2() {
		recipe = new Recipe();
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
	}
	@Test
	void addIngredientTest() {
		setupStage1();
		recipe.addIngredient("Sal",12);
		Ingredient product1 = recipe.getIngredients().get(0);
		assertEquals(product1.getName(),"Sal");
		assertEquals(product1.getWeight(),12);
	}
	
	@Test
	void FourIngredientsTest() {
		setupStage2();
		recipe.addIngredient("Pimienta", 6);
		Ingredient product1 = recipe.getIngredients().get(3);
		assertEquals(product1.getName(),"Pimienta");
		assertEquals(product1.getWeight(),6);
	}
	
	@Test
	void changeWeightTest() {
		setupStage2();
		recipe.addIngredient("Ajo", 21);
		Ingredient product1 = recipe.getIngredients().get(1);
		assertEquals(product1.getName(),"Ajo");
		assertEquals(product1.getWeight(),79);
	}
	
	@Test
	void verify() {
		setupStage2();
		recipe.removeIngredient("Ajo");
	    int numberProducts = recipe.getIngredients().size();
	    Ingredient product1 = recipe.getIngredients().get(0);
	    Ingredient product2 = recipe.getIngredients().get(1);
	    assertEquals(product1.getName(),"Cebolla");
		assertEquals(product2.getName(),"Arroz");
		assertEquals(numberProducts,2);
	}
	
}
