package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEquals {

	@Test
	public void test() {
		Complex test= new Complex(2,3);
		Complex test2 = new Complex(2,3);
		
		assertTrue(test.equals(test2));
	}

}
