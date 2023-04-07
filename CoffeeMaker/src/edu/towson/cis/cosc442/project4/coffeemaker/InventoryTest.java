package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
	
	Inventory inv;

	@Before
	public void setUp() throws Exception {
		    inv = new Inventory();
	}
	
	@After
	public void tearDown() throws Exception {
		inv = null;
	}


	@Test
	public void testInventory() {
			assertEquals(15, inv.getCoffee());
		    assertEquals(15, inv.getMilk());
		    assertEquals(15, inv.getSugar());
		    assertEquals(15, inv.getChocolate());
	}

	@Test
	public void testGetChocolate() {
		assertEquals(15, inv.getChocolate());
	}

	
	/*
	 * Test setChocolate with proper input for first assert.
	 * Test setChocolate with improper input for second assert.
	 * 
	 */
	@Test
	public void testSetChocolate() {
	    inv.setChocolate(10);
	    assertEquals(10, inv.getChocolate());
	    
	    inv.setChocolate(-10);
	    assertEquals(0, inv.getChocolate());
	    
	    inv.setChocolate(-1);
	    assertNotEquals(-1, inv.getChocolate());
	}

	@Test
	public void testGetCoffee() {
		assertEquals(15, inv.getCoffee());
	}

	@Test
	public void testSetCoffee() {
	    inv.setCoffee(10);
	    assertEquals(10, inv.getCoffee());
	    
	    inv.setCoffee(-10);
	    assertEquals(0, inv.getCoffee());
	    
	    inv.setCoffee(-1);
        assertNotEquals(-1, inv.getCoffee());
	}

	@Test
	public void testGetMilk() {
		assertEquals(15, inv.getMilk());
	}

	@Test
	public void testSetMilk() {
	    inv.setMilk(10);
	    assertEquals(10, inv.getMilk());
	    
	    inv.setMilk(-10);
	    assertEquals(0, inv.getMilk());
	    
	    inv.setMilk(-1);
        assertNotEquals(-1, inv.getMilk());
	}

	@Test
	public void testGetSugar() {
		assertEquals(15, inv.getSugar());
	}

	@Test
	public void testSetSugar() {
	    inv.setSugar(10);
	    assertEquals(10, inv.getSugar());
	    
	    inv.setSugar(-10);
	    assertEquals(0, inv.getSugar());
	    
	    inv.setSugar(-1);
        assertNotEquals(-1, inv.getSugar());
	}
	
	/*
	 * Test both true instance of enough ingredients and 
	 * a false instance of enough ingredients.
	 */
	@Test
	public void testEnoughIngredients() {
	    Recipe recipe = new Recipe();
	    recipe.setAmtCoffee(5);
	    recipe.setAmtMilk(5);
	    recipe.setAmtSugar(5);
	    recipe.setAmtChocolate(5);
	    assertTrue(inv.enoughIngredients(recipe));
	    assertNotEquals(false, inv.enoughIngredients(recipe));
	    
	    Recipe recipe2 = new Recipe();
	    recipe2.setAmtCoffee(20);
	    recipe2.setAmtMilk(20);
	    recipe2.setAmtSugar(20);
	    recipe2.setAmtChocolate(20);
	    assertFalse(inv.enoughIngredients(recipe2));
	    assertNotEquals(true, inv.enoughIngredients(recipe2));
	    
	    Recipe recipe3 = new Recipe();
	    recipe3.setAmtCoffee(15);
	    recipe3.setAmtMilk(5);
	    recipe3.setAmtSugar(5);
	    recipe3.setAmtChocolate(5);
	    assertTrue(inv.enoughIngredients(recipe3));
	    assertNotEquals(false, inv.enoughIngredients(recipe3));
	    
	    Recipe recipe4 = new Recipe();
	    recipe4.setAmtCoffee(5);
	    recipe4.setAmtMilk(15);
	    recipe4.setAmtSugar(5);
	    recipe4.setAmtChocolate(5);
	    assertTrue(inv.enoughIngredients(recipe4));
	    assertNotEquals(false, inv.enoughIngredients(recipe4));
	    
	    Recipe recipe5 = new Recipe();
	    recipe5.setAmtCoffee(5);
	    recipe5.setAmtMilk(15);
	    recipe5.setAmtSugar(5);
	    recipe5.setAmtChocolate(5);
	    assertTrue(inv.enoughIngredients(recipe5));
	    assertNotEquals(false, inv.enoughIngredients(recipe5));
	    
	    Recipe recipe6 = new Recipe();
	    recipe6.setAmtCoffee(5);
	    recipe6.setAmtMilk(5);
	    recipe6.setAmtSugar(15);
	    recipe6.setAmtChocolate(5);
	    assertTrue(inv.enoughIngredients(recipe6));
	    assertNotEquals(false, inv.enoughIngredients(recipe6));
	    
	    Recipe recipe7 = new Recipe();
	    recipe7.setAmtCoffee(5);
	    recipe7.setAmtMilk(5);
	    recipe7.setAmtSugar(5);
	    recipe7.setAmtChocolate(15);
	    assertTrue(inv.enoughIngredients(recipe7));
	    assertNotEquals(false, inv.enoughIngredients(recipe7));

	    
	}

	@Test
	public void testToString() {
	 
	    String expected = "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n";
	    assertEquals(expected, inv.toString());
	}


}
