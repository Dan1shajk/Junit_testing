package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDiv {

	@Test
	public void test() {
		Complex test= new Complex(5,2);
		Complex test2 = new Complex(7,4);
		Complex result = new Complex(43,-6);
		Complex output = test.div(test2);
		assertTrue(result.equals(output));
	}

}
