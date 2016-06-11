package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class guitarImplTest {
	@Test
	public void test(){
		Impl.guitarImpl impl = new Impl.guitarImpl();
		assertEquals(impl.getAllGuitars().size(),5);
	}
}
