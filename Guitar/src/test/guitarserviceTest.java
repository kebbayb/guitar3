package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Dao.dataAccess;
import Dao.guitarDao;
import model.guitar;
public class guitarserviceTest {
	@Test
	public void test() {
		guitarDao i = dataAccess.createGuitarDao();
		List<guitar> list = i.getAllGuitars();
		assertEquals(list.size(),5);
	}

	
}
