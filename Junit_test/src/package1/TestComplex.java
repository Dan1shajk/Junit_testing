package package1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTest.class, TestDiv.class, TestEquals.class, testMult.class, TestSub.class })
public class TestComplex {

}
