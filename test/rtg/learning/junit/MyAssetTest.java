package rtg.learning.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssetTest {
	
	List<String> todos=Arrays.asList("Learn to Revise", "Memorize");

	@Test
	void test() {
		boolean test=todos.contains("Memorize"); // result
		boolean test2=todos.contains("Memorizes"); // result
		assertEquals(true, test);
		assertTrue(test);
		
		assertFalse(test2);
		
		// assertNull, assertNotNull
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		
		assertEquals(2, todos.size());
	}

}
