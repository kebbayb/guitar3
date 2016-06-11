package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class guitarImplTest {
	@Test
	public void test(){
		mysqlDao.guitarImpl impl = new mysqlDao.guitarImpl();
		assertEquals(impl.getAllGuitars().size(),5);
	}
}
