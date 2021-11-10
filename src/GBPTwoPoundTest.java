import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class GBPTwoPoundTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class GBPTwoPoundTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
	@Test
		public void testConstructor() {
			try {
				Coin testGBPTwoPound = new GBPTwoPound(2, "GBP", new CompT());
				assertNotNull(testGBPTwoPound);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
		}
	/*
	 * Function to run smelting test
	 * @return void
	 */
	@Test
		public void testSmelt() {
			Coin testGBPTwoPound = new GBPTwoPound(2, "GBP", new CompT());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Beginning smelting:\nOuter Ring:\n76% Cu\n20% Zi\n4% Ni\nInner Ring:\n75% Cu\n25% Ni\n"; 
			String testOutput = null;
			testGBPTwoPound.smelt();
			System.out.flush();
			testOutput = baos.toString();
			System.setOut(origOut);
			assertTrue(expectedResult.equals(testOutput),
					"Expected:'" + expectedResult 
					+ "' but got '" + testOutput + "'.");
		}
	/*
	 * Function to run minting test
	 * @return void
	 */
	@Test
		public void display() {
			Coin testGBPTwoPound = new GBPTwoPound(2, "GBP", new CompT());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Minting a GBP TwoPound!\n"; 
			String testOutput = null;
			testGBPTwoPound.display();
			System.out.flush();
			testOutput = baos.toString();
			System.setOut(origOut);
			assertTrue(expectedResult.equals(testOutput),
					"Expected:'" + expectedResult 
					+ "' but got '" + testOutput + "'.");
		}
	/*
	 * Function to run test on coin denomination
	 * @return void
	 */
	@Test
		public void testgetDenomination() {
			Coin testGBPTwoPound = new GBPTwoPound(2, "GBP", new CompT());
			Double expectedResult = 2.0;
			Double testOutput = testGBPTwoPound.getDenomination();
			assertEquals(expectedResult, testOutput,
					"Expected:'" + expectedResult 
					+ "' but got '" + testOutput + "'.");
		}
}
