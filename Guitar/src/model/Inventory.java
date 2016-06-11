package model;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<guitar> guitars;

	  public Inventory() {
	    guitars = new LinkedList();
	  }

	 
	  public void add(String serialNumber, double price,
	                        guitarspec spec) {
	    guitar guitar = new guitar(serialNumber, price, spec);
	    guitars.add(guitar);
	  }
	  public guitar getguitar(String serialNumber) {
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      guitar guitar = (guitar)i.next();
	      if (guitar.getSerialNumber()==(serialNumber)) {
	        return guitar;
	      }
	    }
	    return null;
	  }
	  public List search(guitarspec searchspec) {
	    List matchingguitars = new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      guitar guitar = (guitar)i.next();
	      System.out.println(guitar.getSpec().getType());
	      System.out.println(searchspec.getType());
	      if (guitar.getSpec().matches(searchspec))
	        matchingguitars.add(guitar);
	    }
	    return matchingguitars;
	  }


}
