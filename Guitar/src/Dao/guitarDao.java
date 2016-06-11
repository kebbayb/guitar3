package Dao;

import java.util.List;

import model.Inventory;
import model.guitar;
import model.guitarspec;
public interface guitarDao {
	public List<guitar> getAllGuitars();
	public Inventory Inventory();
	public void add(String serialNumber, double price, guitarspec spec) ;
	public void delete(String serialNumber) ;
}
