import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class USDQuarterTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDQuarterTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
	@Test
		public void testConstructor() {
			try {
				Coin testUSDQuarter = new USDQuarter(0.25,"USD",new CompHQD());
				assertNotNull(testUSDQuarter);
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
			Coin testUSDQuarter = new USDQuarter(0.25,"USD",new CompHQD());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Beginning smelting:\n91.67% Cu\n8.33% Ni\n";; 
			String testOutput = null;
			testUSDQuarter.smelt();
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
			Coin testUSDQuarter = new USDQuarter(0.25,"USD",new CompHQD());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Minting a USD Quarter!\n"; 
			String testOutput = null;
			testUSDQuarter.display();
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
			Coin testUSDQuarter = new USDQuarter(0.25,"USD",new CompHQD());
			Double expectedResult = 0.25;
			Double testOutput = testUSDQuarter.getDenomination();
			assertEquals(expectedResult, testOutput,
					"Expected:'" + expectedResult 
					+ "' but got '" + testOutput + "'.");
		}
}
