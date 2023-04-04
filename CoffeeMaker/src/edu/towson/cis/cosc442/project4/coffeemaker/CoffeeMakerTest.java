package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class CoffeeMakerTest {
	 	
		private CoffeeMaker coffeeMaker;
		private Inventory inv;
	    private Recipe recipe1;
	    private Recipe recipe2;
	    private Recipe recipe3;
	    private Recipe recipe4;

	    @Before
	    public void setUp() throws Exception {
	        coffeeMaker = new CoffeeMaker();
	        inv = new Inventory();
	        recipe1 = new Recipe();
	        recipe1.setName("Coffee");
	        recipe1.setAmtCoffee(3);
	        recipe1.setAmtMilk(1);
	        recipe1.setAmtSugar(1);
	        recipe1.setAmtChocolate(0);
	        recipe1.setPrice(50);

	        recipe2 = new Recipe();
	        recipe2.setName("Mocha");
	        recipe2.setAmtCoffee(3);
	        recipe2.setAmtMilk(1);
	        recipe2.setAmtSugar(1);
	        recipe2.setAmtChocolate(1);
	        recipe2.setPrice(75);

	        recipe3 = new Recipe();
	        recipe3.setName("Latte");
	        recipe3.setAmtCoffee(3);
	        recipe3.setAmtMilk(3);
	        recipe3.setAmtSugar(1);
	        recipe3.setAmtChocolate(0);
	        recipe3.setPrice(100);

	        recipe4 = new Recipe();
	        recipe4.setName("Hot Chocolate");
	        recipe4.setAmtCoffee(0);
	        recipe4.setAmtMilk(1);
	        recipe4.setAmtSugar(1);
	        recipe4.setAmtChocolate(2);
	        recipe4.setPrice(65);
	    }

	    @Test
	    public void testAddRecipe() {
	        assertTrue(coffeeMaker.addRecipe(recipe1));
	        assertTrue(coffeeMaker.addRecipe(recipe2));
	        assertTrue(coffeeMaker.addRecipe(recipe3));
	        assertTrue(coffeeMaker.addRecipe(recipe4));
	        assertFalse(coffeeMaker.addRecipe(recipe1)); // duplicate recipe
	    }

	    @Test
	    public void testDeleteRecipe() {
	        assertTrue(coffeeMaker.addRecipe(recipe1));
	        assertTrue(coffeeMaker.deleteRecipe(recipe1));
	        assertFalse(coffeeMaker.deleteRecipe(null)); // null recipe
	    }

	    @Test
	    public void testEditRecipe() {
	        assertTrue(coffeeMaker.addRecipe(recipe1));
	        assertTrue(coffeeMaker.addRecipe(recipe2));
	        assertTrue(coffeeMaker.editRecipe(recipe1, recipe2));
	    }

	    @Test
	    public void testAddInventory() {
	        assertTrue(coffeeMaker.addInventory(2, 2, 2, 2));
	        assertFalse(coffeeMaker.addInventory(-2, 2, 2, 2)); // negative coffee amount
	        assertFalse(coffeeMaker.addInventory(2, -2, 2, 2)); // negative milk amount
	        assertFalse(coffeeMaker.addInventory(2, 2, -2, 2)); // negative sugar amount
	        assertFalse(coffeeMaker.addInventory(2, 2, 2, -2)); // negative chocolate amount
	    }

	    @Test
	    public void testCheckInventory() {
	        Inventory inventory = coffeeMaker.checkInventory();
	        assertEquals(15, inventory.getCoffee());
	        assertEquals(15, inventory.getMilk());
	        assertEquals(15, inventory.getSugar());
	        assertEquals(15, inventory.getChocolate());
	    }
	    
	    @Test
	    public void testMakeCoffee() {
	        coffeeMaker.addRecipe(recipe1);
	        assertTrue(coffeeMaker.makeCoffee(recipe1, 100) == 50);
	    }
	    
	    @Test
	    public void testgetRecipes() {
	        Recipe[] recipes = coffeeMaker.getRecipes();
	    	coffeeMaker.addRecipe(recipe1);
	    	
	    	assertEquals(4, recipes.length);
	    }
	    
	    @Test
	    public void testGetRecipeForName() {
	    	coffeeMaker.addRecipe(recipe1);
	    	assertEquals(recipe1,coffeeMaker.getRecipeForName("Coffee"));
	    }

}