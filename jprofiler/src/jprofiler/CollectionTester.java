package jprofiler;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CollectionTester {

	@Test
	void should_populate_list_objects() {
		List<Integer> list = new ArrayList<Integer>();
		CollectionMethods.populate(list);
		int expectedResults = 2000000, actualResults = list.size();
		assertEquals(expectedResults, actualResults);
	}

}
