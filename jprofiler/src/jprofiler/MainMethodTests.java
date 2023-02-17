package jprofiler;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MainMethodTests {

	@Test
	void should_populate_and_empty_list() {
		CollectionMethods x = new CollectionMethods();
		ArrayList<Integer> list = x.popArrayList();
		int expected = 0, actual = list.size();
		assertEquals(expected, actual);
	}

}
