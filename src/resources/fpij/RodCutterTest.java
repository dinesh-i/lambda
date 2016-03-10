/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 ***/
package resources.fpij;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static resources.fpij.TestHelper.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.JUnit4TestAdapter;

public class RodCutterTest {
	private RodCutter rodCutter;
	private List<Integer> prices;

	protected RodCutter createCutter() {
		return new RodCutter(false);
	}

	@Before public void initialize() {
		rodCutter = createCutter();
		prices = Arrays.asList(1, 1, 2, 2, 3, 4, 5);
	}

	@Test public void VerboseExceptionTest() {
		rodCutter.setPrices(prices);
		try {
			rodCutter.maxProfit(0);
			fail("Expected exception for zero length");
		} catch(final RodCutterException ex) {
			assertTrue("expected", true);
		}
	}

	@Test(expected = RodCutterException.class) 
	public void TerseExceptionTest() {
		rodCutter.setPrices(prices);
		rodCutter.maxProfit(0);
	}

	@Test 
	public void ConciseExceptionTest() {
		rodCutter.setPrices(prices);
		assertThrows(RodCutterException.class, () -> rodCutter.maxProfit(0));
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(new JUnit4TestAdapter(RodCutterTest.class));
	}
}
