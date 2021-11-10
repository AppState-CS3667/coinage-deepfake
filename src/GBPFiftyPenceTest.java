import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class GBPFiftyPenceTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class GBPFiftyPenceTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
	@Test
		public void testConstructor() {
			try {
				Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
				assertNotNull(testGBPFiftyPence);
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
			Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Beginning smelting:\n75% Cu\n25% Ni\n"; 
			String testOutput = null;
			testGBPFiftyPence.smelt();
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
			Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Minting a GBP FiftyPence!\n"; 
			String testOutput = null;
			testGBPFiftyPence.display();
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
			Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
			double expectedResult = 0.5;
			double testOutput = testGBPFiftyPence.getDenomination();
			assertEquals(expectedResult, testOutput,
					"Expected:'" + expectedResult 
					+ "' but got '" + testOutput + "'.");
		}
}
