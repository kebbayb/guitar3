package test;

import java.util.Iterator;
import java.util.List;

import guitar.Inventory;
import guitar.guitar;
import guitar.guitarspec;

public class searchTest {
	public static void main(String[] args) {
	    // Set up Rick's guitar inventory
	    Inventory inventory = new Inventory();
	    initializeInventory(inventory);

	    guitarspec test = 
	      new guitarspec("a", "a", "a", "a","a");
	    List matchingGuitars = inventory.search(test);
	    if (!matchingGuitars.isEmpty()) {
	      System.out.println("ËÑË÷½á¹û----");
	      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
	        guitar guitar = (guitar)i.next();
	        guitarspec spec = guitar.getSpec();
	        System.out.println(spec.getBuilder() + "--" + spec.getModel() + "--" +
	          spec.getType() + "--" +spec.getBackWood() + "--" +spec.getTopWood() + "--" +
	          guitar.getPrice()+"--"+guitar.getSerialNumber());
	      }
	    } else {
	      System.out.println("Sorry, Erin, we have nothing for you.");
	    }
	  }

	  private static void initializeInventory(Inventory inventory) {
	    inventory.add("v1", 3999, 
	      new guitarspec("a", "a", "a", "a","a"));
	    inventory.add("V2", 1499, 
	      new guitarspec("b", "b", "b", "b","b"));
	    inventory.add("V3", 1549, 
	      new guitarspec("c", "c", "c", "c","c"));

	  }
}
