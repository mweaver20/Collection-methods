package jprofiler;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CollectionTester.class, MainMethodTests.class })
public class AllTests {

}
