package Dao;

import java.util.List;

import guitar.guitar;
import guitar.guitarspec;
import guitar.Inventory;
public interface guitarDao {
	public List<guitar> getAllGuitars();
	public Inventory Inventory();
	public void add(String serialNumber, double price, guitarspec spec) ;
	public void delete(String serialNumber) ;
}
