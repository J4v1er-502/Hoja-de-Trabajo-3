import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mario
 *
 */
public class SortTest {

	
	Sort s = new Sort(new ComparateAsc());
	
	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Iniciando test...");
	}

	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQuickSort() {
		int[] input = {7, 12, 45, 4};
		int [] output = s.quickSort(input, 0, 3);
		assertEquals(12, output[2]);
	}

	@Test
	public void testRadixSort() {
		int[] input = {7, 12, 45, 4};
		int [] output = s.radixSort(input);
		assertEquals(12, output[2]);
	}

	@Test
	public void testBubbleSort() {
		int[] input = {7, 12, 45, 4};
		int [] output = s.BubbleSort(input);
		assertEquals(12, output[2]);
	}

	@Test
	public void testGnomeSort() {
		int[] input = {7, 12, 45, 4};
		int [] output = s.gnomeSort(input, input.length);
		assertEquals(45, output[3]);
	}

	@Test
	public void testMerge() {
		int[] input = {7, 12, 45, 4};
		int [] output = s.sort(input, 0, input.length - 1);
		assertEquals(4, output[0]);
	}

}
