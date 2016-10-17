package package1;

import static org.junit.Assert.*;

//import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Complex test= new Complex(2,3);
		Complex test2 = new Complex(4,5);
		Complex result = new Complex(6,8);
		Complex output = test.add(test2);
		assertTrue(result.equals(output));
	}

}
