package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	
	private Recipe recipe;

	@Before
	public void setUp() throws Exception {
		recipe = new Recipe();
	}

	@After
	public void tearDown() throws Exception {
		recipe = null;
	}

	@Test
	public void testGetAmtChocolate() {
		assertEquals(0, recipe.getAmtChocolate());
	}

	@Test
	public void testSetAmtChocolate() {
	   	recipe.setAmtChocolate(2);
        assertEquals(2, recipe.getAmtChocolate());
        
        recipe.setAmtChocolate(-2);
        assertEquals(0, recipe.getAmtChocolate());
        
        recipe.setAmtChocolate(-1);
        assertNotEquals(-1, recipe.getAmtChocolate());
        
	}

	@Test
	public void testGetAmtCoffee() {
		assertEquals(0, recipe.getAmtCoffee());
	}

	@Test
	public void testSetAmtCoffee() {
        recipe.setAmtCoffee(2);
        assertEquals(2, recipe.getAmtCoffee());
        
        recipe.setAmtCoffee(-2);
        assertEquals(0, recipe.getAmtCoffee());
        
        recipe.setAmtCoffee(-1);
        assertNotEquals(-1, recipe.getAmtCoffee());
        
	}

	@Test
	public void testGetAmtMilk() {
		assertEquals(0, recipe.getAmtMilk());
	}

	@Test
	public void testSetAmtMilk() {
        recipe.setAmtMilk(2);
        assertEquals(2, recipe.getAmtMilk());
        
        recipe.setAmtMilk(-2);
        assertEquals(0, recipe.getAmtMilk());
        
        recipe.setAmtMilk(-1);
        assertNotEquals(-1, recipe.getAmtMilk());
	}

	@Test
	public void testGetAmtSugar() {
		assertEquals(0, recipe.getAmtSugar());
	}

	@Test
	public void testSetAmtSugar() {
	    
		recipe.setAmtSugar(2);
        assertEquals(2, recipe.getAmtSugar());
        
        recipe.setAmtSugar(-2);
        assertEquals(0, recipe.getAmtSugar());
        
        recipe.setAmtSugar(-1);
        assertNotEquals(-1, recipe.getAmtSugar());
	}

	@Test
	public void testGetName() {
		assertNull(recipe.getName());
	}

	@Test
	public void testSetName() {
		  recipe.setName("Coffee");
	      assertEquals("Coffee", recipe.getName());
	}

	@Test
	public void testGetPrice() {
		assertEquals(0, recipe.getPrice());
	}

	@Test
	public void testSetPrice() {
        recipe.setPrice(2);
        assertEquals(2, recipe.getPrice());
        
        recipe.setPrice(-2);
        assertEquals(0, recipe.getPrice());
        
        recipe.setPrice(-1);
        assertNotEquals(-1, recipe.getPrice());
	}

	@Test
	public void testEqualsRecipe() {
        Recipe recipe1 = new Recipe();
        recipe1.setName("Coffee");
        Recipe recipe2 = new Recipe();
        recipe2.setName("Coffee");
        assertTrue(recipe1.equals(recipe2)); //If they are the same
        
        Recipe recipe1f = new Recipe();
        recipe1f.setName("Coffee");
        Recipe recipe2f = new Recipe();
        recipe2f.setName("Tea");
        assertFalse(recipe1f.equals(recipe2f)); //If there not the same
        
        Recipe recipe3 = new Recipe();
        recipe3.setName(null);
        assertFalse(recipe3.equals(recipe3)); //r.name == null
        
        assertFalse(recipe3.equals(recipe1)); //this.name == null
	}

	@Test
	public void testToString() {
        recipe.setName("Coffee");
        assertEquals("Coffee", recipe.toString());
	}

}
